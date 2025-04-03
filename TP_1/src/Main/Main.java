package Main;
import Class.Vehiculo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MostrarVehiculos("99SDGI12", "Fiat", 2012, 98);
        MostrarVehiculos(null, "Fiat", 2001, 23.4);
        MostrarVehiculos("99SDGI12", "Ferrari", 1820, 93);
        MostrarVehiculos("99SDGI15", "Ferrari", 1943, -23);

    }

    public static void MostrarVehiculos(String patente, String marca, int anio, double capacidadCargaKg) {
        try {
            Vehiculo v = new Vehiculo(patente, marca, anio, capacidadCargaKg);
            v.mostrarInformacion();
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear el vehículo: " + e.getMessage());
        }
        System.out.println("--------------");
    }

}