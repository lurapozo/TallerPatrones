/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

import sinpatron.IVehiculo;

/**
 *
 * @author oscar
 */
public class SensorDecorator extends VehiculoDecorator{
    
    public SensorDecorator(IVehiculo v) {
        super(v);
    }
    
    public String getPrestaciones(){
        return super.getPrestaciones() + "Con sensor \n";
    }
    
}
