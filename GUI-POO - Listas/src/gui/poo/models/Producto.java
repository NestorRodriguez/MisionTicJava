/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.poo.models;

/**
 *
 * @author aiya
 */
public class Producto {
    //Atributos
    private long id;
    private String description;
    private int price; 
    
    //Métodos
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", description=" + description + ", price=" + price + '}';
    }
    
    
    
    
}
