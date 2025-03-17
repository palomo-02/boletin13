package ej14;

import java.time.LocalDate;
import java.util.*;
import java.util.function.*;

import ej13.Producto;

public class App {
	private static ArrayList<Vehiculo> lista = new ArrayList<>();

	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		lista.add(new Moto(LocalDate.of(2000, 4, 14), "audi", 6));
		lista.add(new Moto(LocalDate.of(2017, 12, 22), "kawasaki", 10));
		lista.add(new Coche(LocalDate.of(1999, 5, 2), "Toyota", 3));
		lista.add(new Coche(LocalDate.of(2022, 7, 1), "ferrari", 15));
		lista.add(new Camion(LocalDate.of(2025, 9, 15), "lambo", 20));
		lista.add(new Camion(LocalDate.of(2002, 11, 28), "citroen", 2));

		int opcion = 0;

		do {

			mostrarMenu();

			opcion = sc.nextInt();
			sc.nextLine();
			switch (opcion) {

			case 1 -> FiltradoPorAño();
			case 2 -> ConversionString(sc);
			case 3 -> OrdenarAntiguedad();
			
			case 7 -> System.out.println("saliendo...");

			default -> System.out.println("seleccione una opcion correcta");
			}

		} while (opcion != 7);
		sc.close();
	}

	private static void OrdenarAntiguedad() {

	
	
	lista.stream().sorted().forEach(System.out::println);
	
	
	
	
	}

	private static void ConversionString(Scanner sc) {

		System.out.println("inserte el nombre de la marca del vehiculo que quiere buscar");
		String nombreBusca = sc.nextLine();

		Predicate<Vehiculo> busca = b -> b.getMarca().equalsIgnoreCase(nombreBusca);

		boolean encontrado = lista.stream().anyMatch(busca);

		if (encontrado) {

		} else {

			System.err.println("el vehiculo de la marca " + nombreBusca + "no existe en la tienda");

		}

	}

	private static void FiltradoPorAño() {
		LocalDate fechaActual = LocalDate.now();

		lista.stream().filter(p -> p.getAño().isBefore(fechaActual.minusYears(5))).forEach(System.out::println);

	}

	private static void mostrarMenu() {
		System.out.println("seleccione lo que desea hacer ");

		System.out.println("1. Filtrar vehiculos con mas de 5 años");
		System.out.println("2. convertir un String detallado ");
		System.out.println("3. Ordenar por antiguedad ");
		System.out.println("4. filtrar por tipo de vehiculo  ");
		System.out.println("5. Calcular consumo ");
		System.out.println("6. Convertir la lista en un mapa por tipo ");
		System.out.println("7. Salir ");


	}

}