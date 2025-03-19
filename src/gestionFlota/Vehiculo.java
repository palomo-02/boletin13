package gestionFlota;

import java.time.LocalDate;


public abstract class Vehiculo implements Comparable<Vehiculo>{

	private String marca;
	
	private String modelo;
	private String matricula;
	private LocalDate año;
	/**
	 * @param marca
	 * @param modelo
	 * @param matricula
	 * @param año
	 */
	public Vehiculo(String marca, String modelo, String matricula, LocalDate año) {
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.año = año;
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}
	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	/**
	 * @return the año
	 */
	public LocalDate getAño() {
		return año;
	}
	/**
	 * @param año the año to set
	 */
	public void setAño(LocalDate año) {
		this.año = año;
	}
	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + ", año=" + año + "]";
	}

	@Override
	public int compareTo(Vehiculo o) {
		// TODO Auto-generated method stub
		return this.getAño().compareTo(o.año);
	}
	
	
	
	
	
}
