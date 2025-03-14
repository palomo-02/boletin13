package ej6boletin;

import java.time.LocalDate;

public class Socio {

	private String nombre;

	private String dni;

	private LocalDate fechaNac;

	private LocalDate fechaAlta;

	private int couta;
	private int numerofamiliares;
	/**
	 * @param nombre
	 * @param dni
	 * @param fechaNac
	 * @param fechaAlta
	 * @param couta
	 * @param numerofamiliares
	 */
	public Socio(String nombre, String dni, LocalDate fechaNac, LocalDate fechaAlta, int couta, int numerofamiliares) {
		this.nombre = nombre;
		this.dni = dni;
		this.fechaNac = fechaNac;
		this.fechaAlta = fechaAlta;
		this.couta = couta;
		this.numerofamiliares = numerofamiliares;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}
	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	/**
	 * @return the fechaNac
	 */
	public LocalDate getFechaNac() {
		return fechaNac;
	}
	/**
	 * @param fechaNac the fechaNac to set
	 */
	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}
	/**
	 * @return the fechaAlta
	 */
	public LocalDate getFechaAlta() {
		return fechaAlta;
	}
	/**
	 * @param fechaAlta the fechaAlta to set
	 */
	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	/**
	 * @return the couta
	 */
	public int getCouta() {
		return couta;
	}
	/**
	 * @param couta the couta to set
	 */
	public void setCouta(int couta) {
		this.couta = couta;
	}
	/**
	 * @return the numerofamiliares
	 */
	public int getNumerofamiliares() {
		return numerofamiliares;
	}
	/**
	 * @param numerofamiliares the numerofamiliares to set
	 */
	public void setNumerofamiliares(int numerofamiliares) {
		this.numerofamiliares = numerofamiliares;
	}

	
	
	
	
	
}
