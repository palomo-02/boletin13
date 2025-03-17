package ej13;

import java.util.*;
import java.util.function.*;

public class App {
	private static ArrayList<Producto> lista = new ArrayList<>();

	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		lista.add(new Producto(15, 4, "lavadora"));
		lista.add(new Producto(70, 55, "atun"));
		lista.add(new Producto(8, 100, "webos"));
		lista.add(new Producto(500, 1, "ps5"));
		lista.add(new Producto(45, 5, "comia"));
		lista.add(new Producto(90, 12, "licuadora"));

		int opcion = 0;

		do {

			mostrarMenu();

			opcion = sc.nextInt();
			sc.nextLine();
			switch (opcion) {

			case 1 -> FlitradoPorStock();
			case 2 -> OrdenPorPrecio();
			case 3 -> aplicarDescuento(sc);
			case 4 -> buscarProducto(sc);
			case 5 -> generarTique();
			case 6 -> System.out.println("saliendo...");
			default -> System.out.println("seleccione una opcion correcta");
			}

		} while (opcion != 6);
		sc.close();
	}

	private static void FlitradoPorStock() {

		lista.stream().filter(p -> p.getStock() < 5).forEach(System.out::println);

	}

	private static void OrdenPorPrecio() {

		lista.stream().sorted().forEach(System.out::println);

	}

	private static void generarTique() {

	}

	private static void buscarProducto(Scanner sc) {

		System.out.println("inserte el producto a buscar ");
		String nombre = sc.nextLine();

		Predicate<Producto> busqueda = b -> b.getCategoria().equalsIgnoreCase(nombre);

		lista.stream().filter(busqueda).toList();

	}

	private static void aplicarDescuento(Scanner sc) {


	
	
	
	
	
	
	}

	private static void mostrarMenu() {
		System.out.println("seleccione lo que desea hacer ");

		System.out.println("1. Filtrar productos con stock menor a 5");
		System.out.println("2. ordenar por precio ");
		System.out.println("3. aplicar descuentos dinamicos ");
		System.out.println("4. buscar productos por nombre ");
		System.out.println("5. generar un tique de compra");
		System.out.println("6. salir");

	}

}
