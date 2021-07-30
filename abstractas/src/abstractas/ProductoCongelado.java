/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractas;

/**
 *
 * @author aiya
 */
public abstract class ProductoCongelado extends Producto {
    
    private float TemperaturaCongelación;

    public float getTemperaturaCongelación() {
        return TemperaturaCongelación;
    }

    public void setTemperaturaCongelación(float TemperaturaCongelación) {
        this.TemperaturaCongelación = TemperaturaCongelación;
    }
    
    
}
