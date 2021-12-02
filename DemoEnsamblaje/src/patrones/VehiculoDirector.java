/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

/**
 *
 * @author oscar
 */
public class VehiculoDirector {
    
    public void construirCitroen(vehiculoTipo1 v1){
        v1.defVehiculo();
        v1.constCarroceria();
        v1.constExtras();
        v1.constMotor(); 
    }
    
    public void construirAudi(vehiculoTipo2 v2){
        v2.defVehiculo();
        v2.constCarroceria();
        v2.constExtras();
        v2.constMotor(); 
    }
    
}
