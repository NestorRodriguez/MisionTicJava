/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author aiya
 */
public class Animal{
    
    //Atributos
    private long id;
    private String name;
    private int year;
    
    //Constructor
    public Animal() {
    }

    public Animal(long id, String name, int year) {
        this.id = id;
        this.name = name;
        this.year = year;
    }
    
    //Métodos
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", name=" + name + ", year=" + year + '}';
    }

    public String setOperacion(){
        hola();
        if(this.year >= 8)
            return "Revisar para operación";
        return "No necesita revisión";
    }
    
    private void hola(){
    
    }
    
     
}
