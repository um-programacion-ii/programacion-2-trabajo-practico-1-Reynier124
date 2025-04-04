package Main;
import Class.Vehiculo;
import  Class.VehiculoPrinter;
import Class.Camion;
import Class.Auto;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        VehiculoPrinter vp = new VehiculoPrinter();

        List<Vehiculo> vehiculos = new ArrayList<>();

        Camion c1 = new Camion("123RTYMA", "Renault", 2003, 903.23, true);
        Auto a1 = new Auto("093MAD123", "Ferrari", 2018, 83, 4);

        vehiculos.add(c1);
        vehiculos.add(a1);

        vp.mostrarDatos(vehiculos.get(0));
        System.out.println("---------");
        vp.mostrarDatos(vehiculos.get(1));

        System.out.println("#########");
        vp.mostrarVehiculos(vehiculos);
    }

}