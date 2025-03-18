package ej6boletin;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Socio implements Comparable<Socio> {
    private String dni;
    private String nombre;
    private LocalDate fechaNacimiento;
    private LocalDate fechaAlta;
    private double cuota;
    private int numeroFamiliares;

    public Socio(String dni, String nombre, LocalDate fechaNacimiento, LocalDate fechaAlta, double cuota, int numeroFamiliares) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaAlta = fechaAlta;
        this.cuota = cuota;
        this.numeroFamiliares = numeroFamiliares;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public double getCuota() {
        return cuota;
    }

    public int getNumeroFamiliares() {
        return numeroFamiliares;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Socio socio = (Socio) obj;
        return dni.equals(socio.dni);
    }

    @Override
    public int compareTo(Socio o) {
        return this.dni.compareTo(o.dni);
    }

    @Override
    public String toString() {
        return String.format("DNI: %s, Nombre: %s, Cuota: %.2f, Familiares: %d", dni, nombre, cuota, numeroFamiliares);
    }

    public int edad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    public int antiguedad() {
        return Period.between(fechaAlta, LocalDate.now()).getMonths();
    }
}