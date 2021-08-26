/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rappi.tesoreria.maven;

import com.rappi.tesoreria.maven.controllers.RolJpaController;
import com.rappi.tesoreria.maven.controllers.exceptions.NonexistentEntityException;
import com.rappi.tesoreria.maven.entities.Rol;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Persistence;

/**
 *
 * @author aiya
 */
public class Home {
    public static void main(String[] args) {
        RolJpaController crudRol = new  RolJpaController(Persistence.createEntityManagerFactory("com.rappi.tesoreria_maven_jar_1.0-SNAPSHOTPU"));
        Rol rol = new Rol();
        //Crear un rol
        rol.setDescripcion("Consulta");
        rol.setEstado(false);
        rol.setSiglaRol("CO");
        crudRol.create(rol);
        //Revisar todos los roles
        List<Rol> roles = crudRol.findRolEntities();
        for(Rol r : roles)
            System.out.println(r.toString());
        //Consultar un rol
        crudRol.findRol(1);
        System.out.println("Rol 1: "+rol.toString());
        try {
            //Eliminar un rol
            crudRol.destroy(5);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
