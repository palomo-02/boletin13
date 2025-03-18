package ej15;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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

		int opcion = 0;

		do {

			MostrarMenu();

			opcion = sc.nextInt();
			sc.nextLine();
			switch (opcion) {

			case 1 -> filtroFecha();
			case 2 -> obtenerTituloYautor();
			case 3 -> OrdernarPorPagina();
			case 4 -> PublicacionesAutor(sc);
			case 5 -> ClasificadoPorTipo();
			case 6 -> System.out.println("saliendo... ");

			}

		} while (opcion != 6);

		sc.close();

	}

	public static void ClasificadoPorTipo() {

		/*
		 * lista.stream().collect(Collectors.groupingBy(p ->
		 * p.getClass().getSimpleName())) // Agrupar por tipo .forEach((tipo,
		 * publicaciones) -> { System.out.println("Tipo: " + tipo); // Mostrar el tipo
		 * publicaciones.forEach(System.out::println); // Mostrar cada publicación
		 * System.out.println(); // Separador entre tipos });
		 * 
		 * }
		 * 
		 * 
		 */

		lista.stream().collect(Collectors.groupingBy(p -> p.getClass().getSimpleName()))
				.forEach((tipo, publicaciones) -> publicaciones.forEach(System.out::println));

	}

	public static void PublicacionesAutor(Scanner sc) {

		System.out.println("inserte el autor del que desea saber los datos ");

		String autor = sc.nextLine();

		Predicate<Publicaciones> porAutor = p -> p.getAutor().equalsIgnoreCase(autor);

		boolean encontrado = lista.stream().anyMatch(porAutor);

		if (encontrado) {

			lista.stream().filter(porAutor).forEach(System.out::println);

		} else {
			System.out.println("-------------------------------------------- ");

			System.out.println("el autor " + autor + " no ha escrito ningun libro que este en nuestro registro ");

		}

	}

	public static void OrdernarPorPagina() {

		lista.stream().sorted().forEach(System.out::println);

	}

	public static void obtenerTituloYautor() {
		System.out.println("la lista de autores y obras es: ");

		lista.stream().forEach(p -> System.out.println(p.MostrarTituloYautor()));

	}

	public static void filtroFecha() {

		lista.stream().filter(p -> p.getAñoPublicacion().isAfter(LocalDate.of(2000, 1, 1)))
				.forEach(System.out::println);
		;
	}

	public static void MostrarMenu() {
		System.out.println("-------------------------------------------- ");

		System.out.println("1. Filtrar por publicaciones poosteriores al 2000");
		System.out.println("2. obtener titulo y autor");
		System.out.println("3. ordenar por numero de paginas ");
		System.out.println("4. buscar publicacion de un autor");
		System.out.println("5. clasificar por tipo");
		System.out.println("6. salir");
		System.out.println("-------------------------------------------- ");

	}

}
