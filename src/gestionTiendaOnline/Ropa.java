package gestionTiendaOnline;

public class Ropa extends Producto {

	private String talla;
	private String color;

	public Ropa(int stock, int precio, String nombre, String color, String talla) {
		super(stock, precio, nombre);

		this.color = color;
		this.talla = talla;

	}

	@Override
	public String toString() {
		return super.toString() + "Ropa [talla=" + talla + ", color=" + color + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
