/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rappi.tesoreria.maven.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author aiya
 */
@Entity
@Table(name = "usuarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuarios.findAll", query = "SELECT u FROM Usuarios u")
    , @NamedQuery(name = "Usuarios.findByIdUsuarioPk", query = "SELECT u FROM Usuarios u WHERE u.idUsuarioPk = :idUsuarioPk")
    , @NamedQuery(name = "Usuarios.findByDocumento", query = "SELECT u FROM Usuarios u WHERE u.documento = :documento")
    , @NamedQuery(name = "Usuarios.findByEstado", query = "SELECT u FROM Usuarios u WHERE u.estado = :estado")
    , @NamedQuery(name = "Usuarios.findByEmail", query = "SELECT u FROM Usuarios u WHERE u.email = :email")
    , @NamedQuery(name = "Usuarios.findByNombre", query = "SELECT u FROM Usuarios u WHERE u.nombre = :nombre")
    , @NamedQuery(name = "Usuarios.findByUsername", query = "SELECT u FROM Usuarios u WHERE u.username = :username")})
public class Usuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_usuario_pk")
    private Integer idUsuarioPk;
    @Basic(optional = false)
    @Column(name = "documento")
    private String documento;
    @Basic(optional = false)
    @Column(name = "estado")
    private boolean estado;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "username")
    private String username;
    @JoinColumn(name = "id_dependencia_fk", referencedColumnName = "id_dependencia_pk")
    @ManyToOne(optional = false)
    private Dependencia idDependenciaFk;
    @JoinColumn(name = "id_rol_fk", referencedColumnName = "id_rol_pk")
    @ManyToOne(optional = false)
    private Rol idRolFk;

    public Usuarios() {
    }

    public Usuarios(Integer idUsuarioPk) {
        this.idUsuarioPk = idUsuarioPk;
    }

    public Usuarios(Integer idUsuarioPk, String documento, boolean estado, String email, String nombre, String username) {
        this.idUsuarioPk = idUsuarioPk;
        this.documento = documento;
        this.estado = estado;
        this.email = email;
        this.nombre = nombre;
        this.username = username;
    }

    public Integer getIdUsuarioPk() {
        return idUsuarioPk;
    }

    public void setIdUsuarioPk(Integer idUsuarioPk) {
        this.idUsuarioPk = idUsuarioPk;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Dependencia getIdDependenciaFk() {
        return idDependenciaFk;
    }

    public void setIdDependenciaFk(Dependencia idDependenciaFk) {
        this.idDependenciaFk = idDependenciaFk;
    }

    public Rol getIdRolFk() {
        return idRolFk;
    }

    public void setIdRolFk(Rol idRolFk) {
        this.idRolFk = idRolFk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuarioPk != null ? idUsuarioPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuarios)) {
            return false;
        }
        Usuarios other = (Usuarios) object;
        if ((this.idUsuarioPk == null && other.idUsuarioPk != null) || (this.idUsuarioPk != null && !this.idUsuarioPk.equals(other.idUsuarioPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rappi.tesoreria.maven.entities.Usuarios[ idUsuarioPk=" + idUsuarioPk + " ]";
    }
    
}
