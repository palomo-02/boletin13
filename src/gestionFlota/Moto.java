package gestionFlota;

import java.time.LocalDate;

public class Moto extends Vehiculo {

	int cilindrada;

	public Moto(String marca, String modelo, String matricula, LocalDate año, int cilindrada) {
		super(marca, modelo, matricula, año);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the cilindrada
	 */
	public int getCilindrada() {
		return cilindrada;
	}

	/**
	 * @param cilindrada the cilindrada to set
	 */
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return super.toString() + "Moto [cilindrada=" + cilindrada + "]";
	}

}
