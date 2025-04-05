package Class;

public class VehiculoPrinter {
    public VehiculoPrinter() {
    }

    public void mostrarDatos(Vehiculo v) {
        System.out.println("El vehiculo tiene los siguientes datos:");
        System.out.println("La patente: "+v.getPatente());
        System.out.println("La marca: "+v.getMarca());
        System.out.println("El año: "+v.getAnio());
        System.out.println("La capacitad de carga en kg: "+v.getCapacidadCargaKg());
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