package patrones.Builder;

import sinpatron.Carroceria;
import sinpatron.Vehiculo;

public class vehiculoTipo1 extends VehiculoBuilder {

    public vehiculoTipo1(){}
    
    @Override
    public void defVehiculo() {
        super.v.marca = "Citroen";
        super.v.modelo = "Xsara Picasso";
    }

    @Override
    public void constCarroceria() {
        Carroceria c1 = new Carroceria();
        c1.habitaculoReforzado = false;
        c1.material = "acero";
        c1.tipoCarroceria = "monovolumnen";
        super.v.tipoCarroceria = c1;
        super.v.color = "negro";
    }

    @Override
    public void constMotor() {
        super.constMotor();
    }

    @Override
    public void constExtras() {
        super.v.direccionAsistida = false;
    }
    
    public Vehiculo getVehiculo(){
        return super.getVehiculo();
    }
    
}
