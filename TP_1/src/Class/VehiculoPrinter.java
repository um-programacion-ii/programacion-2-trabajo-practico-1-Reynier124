package Class;


import java.util.List;

public class VehiculoPrinter {
    public VehiculoPrinter() {
    }

    public void mostrarDatos(Vehiculo v) {
        System.out.println("El vehiculo tiene los siguientes datos:");
        System.out.println(v.toString());
    }

    public void mostrarVehiculos(List<Vehiculo> vehiculos) {
        for (Vehiculo v : vehiculos) {
            mostrarDatos(v);
            System.out.println("--------");
        }
    }
}
