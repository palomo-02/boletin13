package gestionFlota;

import java.time.LocalDate;

public class Coche extends Vehiculo {

	private int nplazas;

	public Coche(String marca, String modelo, String matricula, LocalDate año, int nplazas) {
		super(marca, modelo, matricula, año);
		this.nplazas = nplazas;
	}

	/**
	 * @return the nplazas
	 */
	public int getNplazas() {
		return nplazas;
	}

	/**
	 * @param nplazas the nplazas to set
	 */
	public void setNplazas(int nplazas) {
		this.nplazas = nplazas;
	}

	@Override
	public String toString() {
		return super.toString() + "Coche [nunmero de plazas=" + nplazas + "]";
	}

}
