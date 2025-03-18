package ej15;

import java.time.LocalDate;
import java.util.*;

public class App {

	private static ArrayList<Publicaciones> lista = new ArrayList<>();

	/**
	 * @param args
	 * 
	 *             Metodo main por el que se llaman a los metodos
	 */
	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		lista.add(new Libro("Gabriel García Márquez", "Cien años de soledad", LocalDate.of(1967, 5, 30), 432));
		lista.add(new Libro("J.K. Rowling", "Harry Potter y la piedra filosofal", LocalDate.of(1997, 6, 26), 223));

		lista.add(new Ebook("George Orwell", "1984", LocalDate.of(1949, 6, 8), 328));
		lista.add(new Ebook("Aldous Huxley", "Un mundo feliz", LocalDate.of(1932, 1, 1), 288));

		lista.add(new Revista("National Geographic", "El cambio climático", LocalDate.of(2021, 9, 1), 50));
		lista.add(new Revista("Time", "Persona del año 2020", LocalDate.of(2020, 12, 10), 40));

		
		
		int opcion=0;
		
		do {
			
			
			MostrarMenu();
			
			 opcion = sc.nextInt();
			
			
			switch(opcion) {
			
			
			
			case 1 -> filtroFecha();
			case 2 -> obtenerTituloYautor();
			case 3 -> OrdernarPorPagina();
			case 4-> PublicacionesAutor();
			case 5 -> ClasificadoPorTipo();
			case 6 -> System.out.println("saliendo... ");
			
			
			}
			
			
			
		}while(opcion !=6);
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

	private static Object ClasificadoPorTipo() {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object PublicacionesAutor() {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object OrdernarPorPagina() {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object obtenerTituloYautor() {
		// TODO Auto-generated method stub
		return null;
	}

	private static void filtroFecha() {
		
	}

	private static void MostrarMenu() {


		
		System.out.println("1. Filtrar por publicaciones poosteriores al 2000");
		System.out.println("2. obtener titulo y autor");
		System.out.println("3. ordenar por numero de paginas ");
		System.out.println("4. buscar publicacion de un autor");
		System.out.println("5. clasificar por tipo");
		System.out.println("salir");

		
		
		
		
		
		
		
		
		
	}

}
