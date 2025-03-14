package PruebasStream;

import java.util.*;
import java.util.stream.Collectors;

public class Prueba1 {

	public static void main(String[] args) {

		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		lista.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

		Set<Integer> pares = lista.stream().filter(n -> n % 2 == 0).collect(Collectors.toSet());

		System.out.println(pares);

		List<String> nombres = Arrays.asList("pablo", "paco", "pepe", "alejandra", "ewkbe3ib", "edcwshgiuedchiu");

		nombres.stream().map(String::toUpperCase).forEach(System.out::println);

		Set<String> mayus = nombres.stream().map(String::toUpperCase).collect(Collectors.toSet());

		System.out.println(mayus);

		List<Integer> numeroa = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		int suma = numeroa.stream().reduce(0, Integer::sum);
		System.out.println(suma);

		long cant = nombres.stream().filter(x -> x.length() > 4).count();

		System.out.println(cant);

	}

}
