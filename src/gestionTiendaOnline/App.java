package gestionTiendaOnline;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class App {
	private static ArrayList<Producto> productos = new ArrayList<>();

	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		productos.add(new Ropa(10, 500, "Camiseta", "M", "Azul"));
		productos.add(new Ropa(6, -2, "Pantalón", "L", "Negro"));
		productos.add(new Electronico(0, 15000, "Laptop", 24));
		productos.add(new Electronico(7, 2000, "Auriculares", 12));
		productos.add(new Ropa(8, 600, "Chaqueta", "XL", "Rojo"));
		productos.add(new Electronico(4, 5000, "Smartphone", 18));

		int opcion = 0;

		do {

			MostrarMenu();

			opcion = sc.nextInt();
			sc.nextLine();
			switch (opcion) {

			case 1:

				ListarPorPrecio(sc);

				break;
			case 2:

				ListadoPorCategoria();

				break;
			case 3:

				CalcularPrecio();

				break;
			case 4:

				calcularPrecioPorcategoria(sc);

				break;
			case 5:

				ordenarPorStock();
				break;
			case 6:

				productoMasBarato();
				productoMasCaro();

				break;
			case 7:

				ProductoFueraStock();

				break;
			case 8:

				CalculoProductos();

				break;
			case 9:

				MostrarPrimerProducto();

				break;
			case 10:

				mostrarPorTipo();

				break;
			case 11:

				ComprobarStock();
				break;
			case 12:

				ComprobarPrecioNegativo();

				break;
			case 13:
				System.out.println("saliendo");
				break;
			default:
				System.out.println("numero introducido incorrecto");

			}

		} while (opcion != 13);

		sc.close();

	}

	private static void ComprobarPrecioNegativo() {

		Predicate<Producto> precioNegativo = p -> p.getPrecio() < 0;

		boolean encontrado = productos.stream().anyMatch(precioNegativo);

		if (!encontrado) {

			System.out.println("todos los precios son positivos ");
			return;
		}

		System.out.println("hay productos con productos negativpos ");
	}

	private static void ComprobarStock() {
		Predicate<Producto> sinStock = p -> p.getStock() == 0;
		boolean encontrado = productos.stream().anyMatch(sinStock);

		if (!encontrado) {

			System.out.println("todos los producots tienen Stock ");
			return;
		}

		System.out.println("hay productos sin stock");
	}

	private static void mostrarPorTipo() {

	}

	private static void MostrarPrimerProducto() {

		productos.stream().filter(p -> p.getStock() < 5).limit(1).forEach(System.out::println);

	}

	private static void CalculoProductos() {

		int precio = productos.stream().mapToInt(Producto::getPrecio).sum();

		System.out.println("El precio total de los productos es: " + precio);

	}

	private static void ProductoFueraStock() {

		Predicate<Producto> sinStock = p -> p.getStock() == 0;
		boolean encontrado = productos.stream().anyMatch(sinStock);

		if (!encontrado) {

			System.out.println("todos los producots tienen Stock ");
			return;
		}

		productos.stream().filter(sinStock).forEach(System.out::println);

		// productos.stream().filter(p -> p.getStock() ==
		// 0).forEach(System.out::println);

	}

	private static void productoMasCaro() {
		System.out.println("el producto mas caro es: ");

		Producto masCaro = productos.stream().max(Comparator.comparing(Producto::getPrecio)).orElse(null);

		System.out.println(masCaro);
	}

	private static void productoMasBarato() {
		System.out.println("el producto mas barato es: ");

		Producto masBarato = productos.stream().min(Comparator.comparing(Producto::getPrecio)).orElse(null);

		System.out.println(masBarato);
	}

	private static void ordenarPorStock() {

		productos.stream().sorted(Comparator.comparing(Producto::getStock)).forEach(System.out::println);

	}

	private static void calcularPrecioPorcategoria(Scanner sc) {

	}

	private static void CalcularPrecio() {

		OptionalDouble media = productos.stream().mapToDouble(Producto::getPrecio).average();

		System.out.println(" la media es: " + media.orElse(0.0));

	}

	private static void ListadoPorCategoria() {

		productos.stream().collect(Collectors.groupingBy(p -> p.getClass().getSimpleName()))
				.forEach((categoria, lista) -> {
					System.out.println("📌 Categoría: " + categoria);
					lista.forEach(p -> System.out.println("   🔹 " + p));
					System.out.println();
				});
	}

	private static void ListarPorPrecio(Scanner sc) {

		System.out.println("diga si quiere el listado por precio o por categoria: 1.precio 2.categoria");
		int opcionListado = sc.nextInt();

		switch (opcionListado) {

		case 1:
			System.out.println("el orden por precio es: ");
			productos.stream().sorted().forEach(System.out::println);
			break;
		case 2:

			System.out.println("el orden por nombre es: ");
			productos.stream().sorted(Comparator.comparing(Producto::getNombre)).forEach(System.out::println);
			;

			break;
		}

	}

	private static void MostrarMenu() {

		System.out.println("==================================");
		System.out.println("      🛒 MENÚ DE LA TIENDA 🛍️      ");
		System.out.println("==================================");
		System.out.println("1.  Listar productos por precio o por nombre");
		System.out.println("2.  Listar productos agrupados por categoría");
		System.out.println("3.  Calcular el precio medio de todos los productos");
		System.out.println("4.  Calcular el precio medio de los productos por categoría");
		System.out.println("5.  Ordenar productos por stock disponible");
		System.out.println("6.  Encontrar el producto más caro/barato");
		System.out.println("7.  Verificar si hay algún producto fuera de stock");
		System.out.println("8.  Calcular el precio total de todos los productos");
		System.out.println("9.  Mostrar el primer producto con stock menor a 5 unidades");
		System.out.println("10. Descomponer categorías de productos en una lista única sin duplicados");
		System.out.println("11. ¿Todos los productos tienen stock disponible?");
		System.out.println("12. ¿No hay productos con precio negativo?");
		System.out.println("13. 🚪 Salir");
		System.out.println("==================================");
		System.out.print("👉 Selecciona una opción: ");

	}

}
