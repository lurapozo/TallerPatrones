package patrones.Decorator;

import sinpatron.IVehiculo;

public class RadioDecorator extends VehiculoDecorator {
    
    public RadioDecorator(IVehiculo v) {
        super(v);
    }
    
    public String getPrestaciones(){
        return super.getPrestaciones() + "Con radio \n";
    }
    
}
