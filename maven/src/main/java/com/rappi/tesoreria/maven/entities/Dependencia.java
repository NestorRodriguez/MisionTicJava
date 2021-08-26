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
@Table(name = "dependencia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dependencia.findAll", query = "SELECT d FROM Dependencia d")
    , @NamedQuery(name = "Dependencia.findByIdDependenciaPk", query = "SELECT d FROM Dependencia d WHERE d.idDependenciaPk = :idDependenciaPk")
    , @NamedQuery(name = "Dependencia.findByCargo", query = "SELECT d FROM Dependencia d WHERE d.cargo = :cargo")
    , @NamedQuery(name = "Dependencia.findByCodigo", query = "SELECT d FROM Dependencia d WHERE d.codigo = :codigo")
    , @NamedQuery(name = "Dependencia.findByDescripcion", query = "SELECT d FROM Dependencia d WHERE d.descripcion = :descripcion")
    , @NamedQuery(name = "Dependencia.findByEstado", query = "SELECT d FROM Dependencia d WHERE d.estado = :estado")})
public class Dependencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_dependencia_pk")
    private Integer idDependenciaPk;
    @Column(name = "cargo")
    private String cargo;
    @Column(name = "codigo")
    private String codigo;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "estado")
    private boolean estado;

    public Dependencia() {
    }

    public Dependencia(Integer idDependenciaPk) {
        this.idDependenciaPk = idDependenciaPk;
    }

    public Dependencia(Integer idDependenciaPk, String descripcion, boolean estado) {
        this.idDependenciaPk = idDependenciaPk;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public Integer getIdDependenciaPk() {
        return idDependenciaPk;
    }

    public void setIdDependenciaPk(Integer idDependenciaPk) {
        this.idDependenciaPk = idDependenciaPk;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDependenciaPk != null ? idDependenciaPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dependencia)) {
            return false;
        }
        Dependencia other = (Dependencia) object;
        if ((this.idDependenciaPk == null && other.idDependenciaPk != null) || (this.idDependenciaPk != null && !this.idDependenciaPk.equals(other.idDependenciaPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rappi.tesoreria.maven.entities.Dependencia[ idDependenciaPk=" + idDependenciaPk + " ]";
    }
    
}
