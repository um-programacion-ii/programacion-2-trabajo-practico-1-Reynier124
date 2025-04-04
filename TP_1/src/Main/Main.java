package Main;
import Class.Vehiculo;
import  Class.VehiculoPrinter;
import Class.Camion;
import Class.Auto;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        VehiculoPrinter vp = new VehiculoPrinter();
        vp.mostrarVehiculo("99SDGI12", "Fiat", 2012, 98);
        System.out.println("---------");
        vp.mostrarVehiculo(null, "Fiat", 2001, 23.4);
        System.out.println("---------");
        vp.mostrarVehiculo("99SDGI12", "Ferrari", 1820, 93);
        System.out.println("---------");
        vp.mostrarVehiculo("99SDGI15", "Ferrari", 1943, -23);

        System.out.println("---------");
        Vehiculo v1 = new Vehiculo("465LAK21", "Audi", 2007, 56);
        Camion c1 = new Camion("123RTYMA", "Renault", 2003, 903.23, true);
        Auto a1 = new Auto("093MAD123", "Ferrari", 2018, 83, 4);

        vp.mostrarDatos(v1);
        System.out.println("---------");
        vp.mostrarDatos(c1);
        System.out.println("---------");
        vp.mostrarDatos(a1);
    }

}