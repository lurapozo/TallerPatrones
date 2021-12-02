/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.Decorator;

import sinpatron.IVehiculo;

/**
 *
 * @author oscar
 */
public class CamaraDecorator extends VehiculoDecorator {
    
    public CamaraDecorator(IVehiculo v) {
        super(v);
    }
    
    public String getPrestaciones(){
        return super.getPrestaciones() + "Con camara \n";
    }
    
}
