package gestionTiendaOnline;

public class Electronico extends Producto {

	private int garantia;

	public Electronico(int stock, int precio, String nombre, int garantia) {
		super(stock, precio, nombre);
		this.garantia = garantia;
	}

	@Override
	public String toString() {
		return super.toString() + "Electronico [garantia=" + garantia + "]";
	}

}
