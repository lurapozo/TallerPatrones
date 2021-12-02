/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

import sinpatron.Carroceria;
import sinpatron.MotorDiesel;
import sinpatron.Vehiculo;

/**
 *
 * @author oscar
 */
public class vehiculoTipo1 implements VehiculoBuilder {
    
    private Vehiculo v1;

    public vehiculoTipo1(){
        v1 = new Vehiculo();
    }
    
    @Override
    public void defVehiculo() {
        v1.marca = "Citroen";
        v1.modelo = "Xsara Picasso";
    }

    @Override
    public void constCarroceria() {
        Carroceria c1 = new Carroceria();
        c1.habitaculoReforzado = false;
        c1.material = "acero";
        c1.tipoCarroceria = "monovolumnen";
        v1.tipoCarroceria = c1;
        v1.color = "negro";
    }

    @Override
    public void constMotor() {
        v1.motor = new MotorDiesel();
    }

    @Override
    public void constExtras() {
        v1.direccionAsistida = false;
    }
    
    public Vehiculo getVehiculo(){
        return v1;
    }
    
}
