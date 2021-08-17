/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

/**
 *
 * @author aiya
 */
public class Calculadora {
    //Métodos
    public int sumar(int a, int b){
        return a + b;
    }
    
    public int restar(int a, int b){
        return a -b;
    }
    
    public TipoOperacion definirTipoOperacion(long id, String name, String sigla){
        TipoOperacion tipoOper = new TipoOperacion();
        tipoOper.setId(id);
        tipoOper.setName(name);
        tipoOper.setSigla(sigla);
        return tipoOper;
    }
    
    
}
