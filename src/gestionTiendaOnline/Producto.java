package gestionTiendaOnline;

public abstract class Producto implements Comparable<Producto> {

	private int stock;

	private int precio;
	private String nombre;

	/**
	 * @param stock
	 * @param precio
	 * @param nombre
	 */
	public Producto(int stock, int precio, String nombre) {
		this.stock = stock;
		this.precio = precio;
		this.nombre = nombre;
	}

	/**
	 * @return the stock
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * @param stock the stock to set
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}

	/**
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
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

	@Override
	public String toString() {
		return " [stock=" + stock + ", precio=" + precio + ", nombre=" + nombre + "]";
	}

	@Override
	public int compareTo(Producto o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.precio, o.precio);
	}

}
