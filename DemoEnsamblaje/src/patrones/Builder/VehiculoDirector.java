package patrones.Builder;

import sinpatron.Vehiculo;

public class VehiculoDirector {
    
    VehiculoBuilder builder;
    
    public VehiculoDirector(VehiculoBuilder v){
        this.builder=v;
    }
    
    public void construirVehiculo(){
        builder.defVehiculo();
        builder.constCarroceria();
        builder.constExtras();
        builder.constMotor(); 
    }
    
    public Vehiculo getVehiculo(){
        return builder.getVehiculo();
    }
    
}
