package ejPowerPoint;

import java.util.*;
import java.util.function.*;

public class App {

	public static void main(String[] args) {

		ArrayList<Empleado> lista = new ArrayList<>();

		lista.add(new Empleado(30, 2500, "Ana", "TI"));
		lista.add(new Empleado(45, 4000, "Carlos", "Marketing"));
		lista.add(new Empleado(22, 1800, "Beatriz", "TI"));
		lista.add(new Empleado(38, 3200, "David", "Ventas"));
		lista.add(new Empleado(50, 5000, "Elena", "TI"));
		lista.add(new Empleado(28, 2200, "Fernando", "Ventas"));

		// 1. Filtrar empleados con salario superior a 3000€ (Predicate).

		System.out.println("Ej1:");
		Predicate<Empleado> salarioAlto = e -> e.getSalario() > 3000;
		lista.stream().filter(salarioAlto).forEach(System.out::println);

		System.out.println("--------------------------------------------");

		// 2. Transformar el nombre de los empleados a mayúsculas (Function).

		System.out.println("Ej2:");
		Function<Empleado, String> enMayus = e -> e.getNombre().toUpperCase();

		lista.stream().map(enMayus).forEach(System.out::println);

		System.out.println("--------------------------------------------");

		// 3. Imprimir los empleados con un icono previo " " (Consumer).

		System.out.println("Ej3:");

		Consumer<Empleado> empleados = e -> System.out.println("📌" + e);

		lista.stream().forEach(empleados);

		System.out.println("--------------------------------------------");

		// 4. Generar un empleado aleatorio (Supplier).

		System.out.println("Ej4:");
		Random rand = new Random();
		Supplier<Empleado> empleadoAleatorio = () -> {

			String[] nombres = { "Lucía", "Pedro", "María", "Javier", "Laura", "Sergio" };
			String[] departamentos = { "TI", "Marketing", "Ventas", "RRHH" };

			String nombre = nombres[rand.nextInt(nombres.length)];
			String departamento = departamentos[rand.nextInt(departamentos.length)];

			int salario = rand.nextInt(1500, 5000);

			int edad = rand.nextInt(18, 64);

			return new Empleado(edad, salario, nombre, departamento);

		};

		Empleado random = empleadoAleatorio.get();
		System.out.println(random);

		System.out.println("--------------------------------------------");

		
		
		
		// 5. Ordenar empleados por diferentes criterios (Comparable, Comparator). El orden natural lo establecemos por salario. Y el orden alternativo por nombre


		System.out.println("Ej5:");

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		System.out.println("--------------------------------------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
