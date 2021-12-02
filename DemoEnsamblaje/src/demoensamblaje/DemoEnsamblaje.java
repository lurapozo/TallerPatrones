/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoensamblaje;

import patrones.CamaraDecorator;
import patrones.RadioDecorator;
import patrones.SensorDecorator;
import patrones.VehiculoDecorator;
import patrones.VehiculoDirector;
import patrones.vehiculoTipo1;
import patrones.vehiculoTipo2;
import sinpatron.*;

/**
 *
 * @author david_000
 */
public class DemoEnsamblaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Definir vehiculo
        Vehiculo v1 = new Vehiculo();
        v1.marca = "Citroen";
        v1.modelo = "Xsara Picasso";
        
        //Contruir motor
        v1.motor = new MotorDiesel();
        
        //Construir carroceria
        Carroceria c1 = new Carroceria();
        c1.habitaculoReforzado = false;
        c1.material = "acero";
        c1.tipoCarroceria = "monovolumnen";
        v1.tipoCarroceria = c1;
        v1.color = "negro";
        
        //Construir extras
        v1.direccionAsistida = false;
        
        //Mostrar prestaciones del vehiculo
        //System.out.println(v1.getPrestaciones());


        //--------------------------------------------------
        //Definir vehiculo
        Vehiculo v2 = new Vehiculo();
        v2.marca = "Audi";
        v2.modelo = "A3 Sportback";
        
        //Contruir motor
        v2.motor = new MotorDiesel();
        
        //Construir carroceria
        Carroceria c2 = new Carroceria();
        c2.habitaculoReforzado = true;
        c2.material = "fibra de carbono";
        c2.tipoCarroceria = "deportivo";
        v2.tipoCarroceria = c1;
        v2.color = "plata cromado";
        
        //Construir extras
        v2.direccionAsistida = true;
        
        //Mostrar prestaciones del vehiculo
        //System.out.println(v2.getPrestaciones());
        
        //--------------------------------------------------

        //TODO: Agregar accesorios: radio y sensores de retro a v1
        //Debería agregar estos accesorios como parte de las prestaciones del vehiculo
        
        // Con builder
        
        vehiculoTipo1 base1 = new vehiculoTipo1();
        
        VehiculoDirector director = new VehiculoDirector();
        
        director.construirCitroen(base1);
        
        RadioDecorator decorador = new RadioDecorator(base1.getVehiculo());
        
        SensorDecorator decorador2 = new SensorDecorator(decorador);
        
        //Mostrar prestaciones actualizadas del vehiculo

        System.out.println(decorador2.getPrestaciones());
        
        //--------------------------------------------------
        
        //TODO: Agregar accesorios: camara de retro a v2
        //Debería agregar estos accesorios como parte de las prestaciones del vehiculo
        
        // Con builder
        
        vehiculoTipo2 base2 = new vehiculoTipo2();
        
        director.construirAudi(base2);
        
        CamaraDecorator decorador3 = new CamaraDecorator(base2.getVehiculo());
        
        //Mostrar prestaciones actualizadas del vehiculo

        System.out.println(decorador3.getPrestaciones());
    }
    
}
