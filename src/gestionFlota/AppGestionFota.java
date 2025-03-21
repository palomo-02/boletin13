package gestionFlota;

import java.time.LocalDate;
import java.time.Year;
import java.util.*;

public class AppGestionFota {
	private static ArrayList<Vehiculo> vehiculos = new ArrayList<>();

	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		vehiculos.add(new Moto("Yamaha", "YZF-R3", "1234ABC", LocalDate.of(2021, 1, 1), 321));
		vehiculos.add(new Moto("Honda", "CBR500R", "5678DEF", LocalDate.of(2020, 1, 1), 471));
		vehiculos.add(new Moto("Kawasaki", "Ninja 650", "9101GHI", LocalDate.of(2019, 1, 1), 649));
		vehiculos.add(new Moto("Ducati", "Monster 821", "1121JKL", LocalDate.of(2018, 1, 1), 821));
		vehiculos.add(new Moto("Suzuki", "GSX-S750", "3141MNO", LocalDate.of(2022, 1, 1), 749));

		vehiculos.add(new Coche("Toyota", "Corolla", "4151PQR", LocalDate.of(2017, 1, 1), 5));
		vehiculos.add(new Coche("Ford", "Mustang", "6171STU", LocalDate.of(2016, 1, 1), 4));
		vehiculos.add(new Coche("BMW", "X5", "8191VWX", LocalDate.of(2023, 1, 1), 5));
		vehiculos.add(new Coche("Audi", "A3", "9202YZA", LocalDate.of(2022, 1, 1), 5));
		vehiculos.add(new Coche("Mercedes", "Clase C", "1023BCD", LocalDate.of(2021, 1, 1), 5));

		int opcion = 0;

		do {

			mostrarMenu();

			opcion = sc.nextInt();
			sc.nextLine();
			switch (opcion) {

			case 1:

				ListadoOmarca(sc);

				break;
			case 2:

				Filtrado(sc);
				break;
			case 3:
				VehiculosPorTipo();
				break;
			case 4:

				VehiculoViejoYnuevo();
				break;
			case 5:

				MostrarMarcas();
				break;
			case 6:
				
				VehiculosMasDe5();
				break;
			case 7:
				break;
			case 8:
				System.out.println("Saliendo... ");

				break;
			default:
				System.out.println("El numero introducido es incorrecto.");
			}

		} while (opcion != 8);

		sc.close();
	}

	public static void VehiculosMasDe5() {
		vehiculos.stream()
        .filter(p -> (Year.now().getValue() - p.getAño().getYear() > 5)) // Filtra vehículos con más de 5 años
        .forEach(System.out::println); // Imprime los vehículos filtrados
	}

	public static void VehiculosPorTipo() {

		long ContCoches = vehiculos.stream().filter(p -> p instanceof Coche).count();

		long ContMotos = vehiculos.stream().filter(p -> p instanceof Coche).count();

		System.out.println("la cantidad de coches es: " + ContCoches);
		System.out.println("la cantidad de motos es: " + ContMotos);

	}

	public static void MostrarMarcas() {

		vehiculos.stream().map(Vehiculo::getMarca).forEach(System.out::println);

	}

	public static void VehiculoViejoYnuevo() {

		System.out.println("el vehiculo mas viejo es: ");

		vehiculos.stream().sorted().limit(1).forEach(System.out::println);

		System.out.println("el vehiculo mas nuevo es: ");

		vehiculos.stream().sorted(Comparator.reverseOrder()).limit(1).forEach(System.out::println);

	}

	public static void Filtrado(Scanner sc) {

		System.out.println("elija la opcion de filtrado 1.tipo 2.marca 3.año ");
		int opcioFiltrado = sc.nextInt();

		switch (opcioFiltrado) {
		case 1:
			
			System.out.println("los coches:");
			vehiculos.stream().filter(p->p instanceof Coche).forEach(System.out::println);
			
			System.out.println("las motos:");
			vehiculos.stream().filter(p->p instanceof Moto).forEach(System.out::println);
			
			
			
			break;
		case 2:
			
			
			System.out.println("las marcas: ");
			
			vehiculos.stream().map(Vehiculo::getMarca).forEach(System.out::println);
			
			
			break;
		case 3:
			
			
			System.out.println("los años: ");
			
			vehiculos.stream().map(Vehiculo::getAño).forEach(System.out::println);
			
			
			
			break;

		}

	}

	public static void ListadoOmarca(Scanner sc) {

		System.out.println("Quiere listar por 1 año o 2.marca");
		int elegirLista = sc.nextInt();
		sc.nextLine();
		switch (elegirLista) {

		case 1:
			System.out.println("la lista por años es: ");
			vehiculos.stream().sorted().forEach(System.out::println);

			break;
		case 2:

			System.out.println("la lista por marca en orden alfabetico es: ");
			vehiculos.stream().sorted(Comparator.comparing(Vehiculo::getMarca)).forEach(System.out::println);

			break;
		default:
			System.out.println("opcion introducida incorrecta");

		}

	}

	public static void mostrarMenu() {
		System.out.println("=======================================");
		System.out.println("         MENÚ DE GESTIÓN DE VEHÍCULOS");
		System.out.println("=======================================");
		System.out.println("1.  Listar vehículos ordenados por año o marca.");
		System.out.println("2.  Filtrar vehículos por tipo, marca o año, según se elija.");
		System.out.println("3.  Calcular el número de vehículos de cada tipo.");
		System.out.println("4.  Encontrar el vehículo más nuevo/viejo.");
		System.out.println("5.  Mostrar las marcas de vehículos disponibles en el concesionario.");
		System.out.println("6.  Mostrar vehículos con más de 5 años de antigüedad.");
		System.out.println("7.  Obtener un conjunto de marcas de vehículos disponibles.");
		System.out.println("8.  Salir");
		System.out.println("=======================================");
		System.out.print("Seleccione una opción: ");
	}

}
