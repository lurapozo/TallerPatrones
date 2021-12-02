package patrones.Builder;

import sinpatron.Carroceria;
import sinpatron.Vehiculo;

public class vehiculoTipo2 extends VehiculoBuilder {
    
    public vehiculoTipo2(){}

    @Override
    public void defVehiculo() {
        super.v.marca = "Audi";
        super.v.modelo = "A3 Sportback";
    }

    @Override
    public void constCarroceria() {
        Carroceria c2 = new Carroceria();
        c2.habitaculoReforzado = true;
        c2.material = "fibra de carbono";
        c2.tipoCarroceria = "deportivo";
        super.v.tipoCarroceria = c2;
        super.v.color = "plata cromado";
    }

    @Override
    public void constMotor() {
        super.constMotor();
    }

    @Override
    public void constExtras() {
        super.v.direccionAsistida = true;
    }
    
    public Vehiculo getVehiculo(){
        return super.getVehiculo();
    }
    
}
