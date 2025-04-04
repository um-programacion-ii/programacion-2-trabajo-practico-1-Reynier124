package Class;

import java.time.Year;

public class Vehiculo {
    private String patente;
    private String marca;
    private int anio;
    private double capacidadCargaKg;

    public Vehiculo(String patente, String marca, int anio, double capacidadCargaKg) {
        setPatente(patente);
        this.marca = marca;
        setAnio(anio);
        //this.anio = anio;
        setCapacidadCargaKg(capacidadCargaKg);
        //this.capacidadCargaKg = capacidadCargaKg;
    }

    public Vehiculo() {
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        if (patente == null || patente.trim().isEmpty()) {
            throw new IllegalArgumentException("La patente no puede ser nula ni vacía.");
        }
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        int anioActual = Year.now().getValue();
        if (anio < 1900 || anio > anioActual) {
            throw new IllegalArgumentException("El año debe ser mayor a 1900 y menor o igual al año actual.");
        }
        this.anio = anio;
    }

    public double getCapacidadCargaKg() {
        return capacidadCargaKg;
    }

    public void setCapacidadCargaKg(double capacidadCargaKg) {
        if (capacidadCargaKg <= 0) {
            throw new IllegalArgumentException("La capacidad de carga debe ser positiva.");
        }
        this.capacidadCargaKg = capacidadCargaKg;
    }

    @Override
    public String toString() {
        return "Patente: " + patente +
                "\nMarca: " + marca +
                "\nAño: " + anio +
                "\nCapacidad de carga (Kg): " + capacidadCargaKg;
    }

}
