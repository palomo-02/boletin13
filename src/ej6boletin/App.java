package ej6boletin;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class App {

	 public static void main(String[] args) {
	        List<Socio> socios = Arrays.asList(
	            new Socio("12345678A", "Ana", LocalDate.of(1990, 5, 20), LocalDate.of(2015, 3, 10), 120, 2),
	            new Socio("23456789B", "Carlos", LocalDate.of(1985, 7, 15), LocalDate.of(2012, 6, 5), 80, 3),
	            new Socio("34567890C", "Alberto", LocalDate.of(2000, 2, 25), LocalDate.of(2020, 9, 1), 150, 1),
	            new Socio("45678901D", "Beatriz", LocalDate.of(1995, 12, 10), LocalDate.of(2018, 11, 23), 95, 0),
	            new Socio("56789012E", "David", LocalDate.of(1978, 8, 30), LocalDate.of(2010, 5, 19), 110, 4)
	        );

	        // a) Ordenados por DNI
	        System.out.println("Socios ordenados por DNI:");
	        socios.stream().sorted().forEach(System.out::println);

	        // b) Cuota mayor de 100€
	        System.out.println("\nSocios con cuota mayor de 100€:");
	        socios.stream().filter(s -> s.getCuota() > 100).forEach(System.out::println);

	        // c) Nombre que empieza por 'A'
	        System.out.println("\nSocios cuyo nombre empieza por 'A':");
	        socios.stream().filter(s -> s.getNombre().startsWith("A")).forEach(System.out::println);

	        // d) Socios ordenados por antigüedad
	        System.out.println("\nSocios ordenados por antigüedad:");
	        socios.stream().sorted(Comparator.comparingInt(Socio::antiguedad)).forEach(System.out::println);

	        // e) Socios ordenados por edad
	        System.out.println("\nSocios ordenados por edad:");
	        socios.stream().sorted(Comparator.comparingInt(Socio::edad)).forEach(System.out::println);

	        // f) Stream con DNIs ordenados
	        System.out.println("\nDNIs ordenados:");
	        socios.stream().map(Socio::getDni).sorted().forEach(System.out::println);

	        // g) Obtener tabla de DNIs
	        String[] dniArray = socios.stream().map(Socio::getDni).sorted().toArray(String[]::new);
	        System.out.println("\nTabla de DNIs:");
	        System.out.println(Arrays.toString(dniArray));

	        // h) Obtener lista de DNIs
	        List<String> dniList = socios.stream().map(Socio::getDni).sorted().collect(Collectors.toList());
	        System.out.println("\nLista de DNIs:");
	        System.out.println(dniList);

	        // i) Obtener Stream de DNIs usando un Map
	        Map<String, String> dniNombreMap = socios.stream().collect(Collectors.toMap(Socio::getDni, Socio::getNombre));
	        System.out.println("\nMap de DNI a Nombre:");
	        dniNombreMap.forEach((dni, nombre) -> System.out.println(dni + " -> " + nombre));

	        // j) Calcular el número medio de familiares por socio
	        double mediaFamiliares = socios.stream().mapToInt(Socio::getNumeroFamiliares).average().orElse(0);
	        System.out.println("\nNúmero medio de familiares por socio: " + mediaFamiliares);
	    }
	}
