package ej15;

import java.time.LocalDate;

public class Ebook extends Publicaciones {

	public Ebook(String autor, String titulo, LocalDate añoPublicacion, int pags) {
		super(autor, titulo, añoPublicacion, pags);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Publicaciones o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
