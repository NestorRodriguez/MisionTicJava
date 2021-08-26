/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rappi.tesoreria.maven.controllers;

import com.rappi.tesoreria.maven.controllers.exceptions.NonexistentEntityException;
import com.rappi.tesoreria.maven.entities.Dependencia;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author aiya
 */
public class DependenciaJpaController implements Serializable {

    public DependenciaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Dependencia dependencia) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(dependencia);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Dependencia dependencia) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            dependencia = em.merge(dependencia);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = dependencia.getIdDependenciaPk();
                if (findDependencia(id) == null) {
                    throw new NonexistentEntityException("The dependencia with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Dependencia dependencia;
            try {
                dependencia = em.getReference(Dependencia.class, id);
                dependencia.getIdDependenciaPk();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The dependencia with id " + id + " no longer exists.", enfe);
            }
            em.remove(dependencia);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Dependencia> findDependenciaEntities() {
        return findDependenciaEntities(true, -1, -1);
    }

    public List<Dependencia> findDependenciaEntities(int maxResults, int firstResult) {
        return findDependenciaEntities(false, maxResults, firstResult);
    }

    private List<Dependencia> findDependenciaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Dependencia.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Dependencia findDependencia(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Dependencia.class, id);
        } finally {
            em.close();
        }
    }

    public int getDependenciaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Dependencia> rt = cq.from(Dependencia.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
