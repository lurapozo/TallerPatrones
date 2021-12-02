package patrones;

import sinpatron.IVehiculo;

public class VehiculoDecorator implements IVehiculo{
    
    private IVehiculo envuelto;
    
    public VehiculoDecorator(IVehiculo v){
        this.envuelto=v;
    }
    
    public String getPrestaciones(){
        return envuelto.getPrestaciones();
    }
}
