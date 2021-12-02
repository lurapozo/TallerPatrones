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
public class vehiculoTipo2 implements VehiculoBuilder {
    
    private Vehiculo v2;
    
    public vehiculoTipo2(){
        v2 = new Vehiculo();
    }

    @Override
    public void defVehiculo() {
        v2.marca = "Audi";
        v2.modelo = "A3 Sportback";
    }

    @Override
    public void constCarroceria() {
        Carroceria c2 = new Carroceria();
        c2.habitaculoReforzado = true;
        c2.material = "fibra de carbono";
        c2.tipoCarroceria = "deportivo";
        v2.tipoCarroceria = c2;
        v2.color = "plata cromado";
    }

    @Override
    public void constMotor() {
        v2.motor = new MotorDiesel();
    }

    @Override
    public void constExtras() {
        v2.direccionAsistida = true;
    }
    
    public Vehiculo getVehiculo(){
        return v2;
    }
    
}
