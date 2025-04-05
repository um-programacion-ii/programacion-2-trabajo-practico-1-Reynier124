package Class;

public class VehiculoPrinter {
    public VehiculoPrinter() {
    }

    public void mostrarDatos(Vehiculo v) {
        System.out.println(v.toString());
    }

    public void mostrarVehiculo(String patente, String marca, int anio, double capacidadCargaKg) {
        try {
            Vehiculo vehiculo = new Vehiculo(patente, marca, anio, capacidadCargaKg);
            mostrarDatos(vehiculo);
        }catch (IllegalArgumentException e) {
            System.out.println("Error al crear el vehiculo: " + e.getMessage());
        }
    }
}