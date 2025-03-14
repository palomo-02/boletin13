package ej6boletin;

import java.time.LocalDate;

public class Socio implements Comparable<Socio> {

    private String nombre;
    private String dni;
    private LocalDate fechaNac;
    private LocalDate fechaAlta;
    private int cuota;  // Corregido a 'cuota' en lugar de 'couta'
    private int numeroFamiliares;
private int edad;
    // Constructor
    public Socio(String nombre, String dni, LocalDate fechaNac, LocalDate fechaAlta, int cuota, int numeroFamiliares) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNac = fechaNac;
        this.fechaAlta = fechaAlta;
        this.cuota = cuota;
        this.numeroFamiliares = numeroFamiliares;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public int getCouta() {
        return cuota;  // Este método debe coincidir con el nombre correcto
    }

    public int getNumeroFamiliares() {
        return numeroFamiliares;
    }

    // Implementación de compareTo() basado en el DNI
    @Override
    public int compareTo(Socio o) {
        return this.dni.compareTo(o.dni);  // Compara el DNI lexicográficamente
    }

    // Método toString() para mostrar la información del socio
    @Override
    public String toString() {
        return "Socio{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", fechaNac=" + fechaNac +
                ", fechaAlta=" + fechaAlta +
                ", cuota=" + cuota +
                ", numeroFamiliares=" + numeroFamiliares +
                '}';
    }
}
