package Main;
import Class.Vehiculo;
import  Class.VehiculoPrinter;

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
    }

}