package ej14;

import java.time.LocalDate;

public class Vehiculo implements Comparable <Vehiculo> {

	private LocalDate año;
	private String Marca;
	private int consumo;

	/**
	 * @param año
	 * @param marca
	 * @param consumo
	 */
	public Vehiculo(LocalDate año, String marca, int consumo) {
		this.año = año;
		Marca = marca;
		this.consumo = consumo;
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

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return Marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		Marca = marca;
	}

	/**
	 * @return the consumo
	 */
	public int getConsumo() {
		return consumo;
	}

	/**
	 * @param consumo the consumo to set
	 */
	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}

	@Override
	public String toString() {
		return "Vehiculo [año=" + año + ", Marca=" + Marca + ", consumo=" + consumo + "]";
	}

	@Override
	public int compareTo(Vehiculo o) {
		// TODO Auto-generated method stub
		return this.año.compareTo(o.año);
	}

	
	
	
	
}
