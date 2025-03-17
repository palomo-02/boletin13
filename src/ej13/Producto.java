package ej13;

public class Producto implements Comparable<Producto>{


	private int precio;
	
		private int stock;
			private String categoria;
			/**
			 * @param precio
			 * @param stock
			 * @param categoria
			 */
			public Producto(int precio, int stock, String categoria) {
				this.precio = precio;
				this.stock = stock;
				this.categoria = categoria;
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
			 * @return the categoria
			 */
			public String getCategoria() {
				return categoria;
			}
			/**
			 * @param categoria the categoria to set
			 */
			public void setCategoria(String categoria) {
				this.categoria = categoria;
			}
			@Override
			public String toString() {
				return "Producto [precio=" + precio + ", stock=" + stock + ", categoria=" + categoria + "]";
			}
			@Override

			public int compareTo(Producto o) {
				// TODO Auto-generated method stub
				return Integer.compare(this.precio, o.precio)  ;

			}
		
	
	
	
}
