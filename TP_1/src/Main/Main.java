package Main;

import  Class.VehiculoPrinter;
import Class.Camion;
import Class.Auto;


public class Main {
    public static void main(String[] args) {
        VehiculoPrinter vp = new VehiculoPrinter();
        
        Camion c1 = new Camion("123RTYMA", "Renault", 2003, 903.23, true);
        Auto a1 = new Auto("093MAD123", "Ferrari", 2018, 83, 4);

        vp.mostrarDatos(a1);
        System.out.println("---------");
        vp.mostrarDatos(c1);
    }

}