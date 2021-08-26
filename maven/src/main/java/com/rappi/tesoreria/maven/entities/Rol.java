/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rappi.tesoreria.maven.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author aiya
 */
@Entity
@Table(name = "rol")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rol.findAll", query = "SELECT r FROM Rol r")
    , @NamedQuery(name = "Rol.findByIdRolPk", query = "SELECT r FROM Rol r WHERE r.idRolPk = :idRolPk")
    , @NamedQuery(name = "Rol.findByDescripcion", query = "SELECT r FROM Rol r WHERE r.descripcion = :descripcion")
    , @NamedQuery(name = "Rol.findByEstado", query = "SELECT r FROM Rol r WHERE r.estado = :estado")
    , @NamedQuery(name = "Rol.findBySiglaRol", query = "SELECT r FROM Rol r WHERE r.siglaRol = :siglaRol")})
public class Rol implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_rol_pk")
    private Integer idRolPk;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "estado")
    private boolean estado;
    @Column(name = "sigla_rol")
    private String siglaRol;

    public Rol() {
    }

    public Rol(Integer idRolPk) {
        this.idRolPk = idRolPk;
    }

    public Rol(Integer idRolPk, String descripcion, boolean estado) {
        this.idRolPk = idRolPk;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public Integer getIdRolPk() {
        return idRolPk;
    }

    public void setIdRolPk(Integer idRolPk) {
        this.idRolPk = idRolPk;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getSiglaRol() {
        return siglaRol;
    }

    public void setSiglaRol(String siglaRol) {
        this.siglaRol = siglaRol;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRolPk != null ? idRolPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rol)) {
            return false;
        }
        Rol other = (Rol) object;
        if ((this.idRolPk == null && other.idRolPk != null) || (this.idRolPk != null && !this.idRolPk.equals(other.idRolPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Rol{" + "idRolPk=" + idRolPk + ", descripcion=" + descripcion + ", estado=" + estado + ", siglaRol=" + siglaRol + '}';
    }


    
}
