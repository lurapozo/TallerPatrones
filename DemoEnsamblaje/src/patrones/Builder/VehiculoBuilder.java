package patrones.Builder;

import sinpatron.MotorDiesel;
import sinpatron.Vehiculo;

public abstract class VehiculoBuilder {
    
    protected Vehiculo v;
    
    public VehiculoBuilder(){
        this.v = new Vehiculo();
    }
    
    abstract public void defVehiculo();
    
    abstract public void constCarroceria();
    
    public void constMotor(){
        v.motor = new MotorDiesel();
    };
    
    abstract public void constExtras();  
    
    public Vehiculo getVehiculo(){
        return v;
    };
    
}
