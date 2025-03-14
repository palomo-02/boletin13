package ej7boletin;

import java.time.LocalDate;
import java.util.ArrayList;


public class App {
	private static ArrayList<Socio> socios = new ArrayList<>();

	public static void main(String[] args) {

		
		socios.add(new Socio("Pepe", "54181356A", LocalDate.of(2000, 4, 14), LocalDate.of(2020, 7, 21), 1500, 2));
		socios.add(new Socio("Luis", "12545145Y", LocalDate.of(1995, 6, 20), LocalDate.of(2018, 5, 10), 1800, 3));
		socios.add(new Socio("Ana", "74839203P", LocalDate.of(1992, 12, 5), LocalDate.of(2019, 8, 15), 56, 1));
		socios.add(new Socio("Juan", "23654789X", LocalDate.of(1997, 3, 11), LocalDate.of(2021, 9, 1), 5, 4));
		socios.add(new Socio("Marta", "98563412T", LocalDate.of(1990, 11, 30), LocalDate.of(2017, 12, 25), 1700, 5));

		
		
		
		
		
		
		
		
	}

}
