package ej15;

import java.time.LocalDate;

abstract class Publicaciones {

	private String autor;

	private String titulo;
	private LocalDate añoPublicacion;
	private int pags;

	/**
	 * @param autor
	 * @param titulo
	 * @param añoPublicacion
	 * @param pags
	 */
	public Publicaciones(String autor, String titulo, LocalDate añoPublicacion, int pags) {
		this.autor = autor;
		this.titulo = titulo;
		this.añoPublicacion = añoPublicacion;
		this.pags = pags;
	}

	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the añoPublicacion
	 */
	public LocalDate getAñoPublicacion() {
		return añoPublicacion;
	}

	/**
	 * @param añoPublicacion the añoPublicacion to set
	 */
	public void setAñoPublicacion(LocalDate añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}

	/**
	 * @return the pags
	 */
	public int getPags() {
		return pags;
	}

	/**
	 * @param pags the pags to set
	 */
	public void setPags(int pags) {
		this.pags = pags;
	}

	@Override
	public String toString() {
		return "Publicaciones [autor=" + autor + ", titulo=" + titulo + ", añoPublicacion=" + añoPublicacion + ", pags="
				+ pags + "]";
	}

}
