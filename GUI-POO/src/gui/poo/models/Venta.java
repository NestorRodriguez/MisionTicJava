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
public class Venta {
    
    //Atributos
    private long id;
    private float descuento;
    private int cantidadDocenas;
    private int cantidadObsequio;
    private int valorSubTotal;
    private float valorDescuento;
    private float valorTotal;
    private Producto producto;
    
    //Métodos
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public int getCantidadDocenas() {
        return cantidadDocenas;
    }

    public void setCantidadDocenas(int cantidadDocenas) {
        this.cantidadDocenas = cantidadDocenas;
    }

    public int getCantidadObsequio() {
        return cantidadObsequio;
    }

    public void setCantidadObsequio(int cantidadObsequio) {
        this.cantidadObsequio = cantidadObsequio;
    }

    public int getValorSubTotal() {
        return valorSubTotal;
    }

    public void setValorSubTotal(int valorSubTotal) {
        this.valorSubTotal = valorSubTotal;
    }

    public float getValorDescuento() {
        return valorDescuento;
    }

    public void setValorDescuento(float valorDescuento) {
        this.valorDescuento = valorDescuento;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "Venta{" + "id=" + id + ", descuento=" + descuento + ", cantidadDocenas=" + cantidadDocenas + ", cantidadObsequio=" + cantidadObsequio + ", valorSubTotal=" + valorSubTotal + ", valorDescuento=" + valorDescuento + ", valorTotal=" + valorTotal + ", producto=" + producto + '}';
    }
    
}
