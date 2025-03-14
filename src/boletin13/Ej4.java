package boletin13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ej4 {

	public static void main(String[] args) {

		ArrayList<Integer> lista1 = new ArrayList<>();
		ArrayList<Integer> lista2 = new ArrayList<>();
		List<Integer> lista3 = new ArrayList<>();

		for (int i = 1; i < 21; i++) {

			lista1.add((int) (Math.random() * 101));

		}

		for (int i = 1; i < 21; i++) {

			lista2.add((int) (Math.random() * 101));

		}

		System.out.println("lista 1: " + lista1);

		System.out.println("lista 2: " + lista2);

		lista3 = Stream.concat(lista1.stream(), lista2.stream()).distinct() // Eliminar duplicados
				.collect(Collectors.toList()); // Convertir el Stream en una lista

		System.out.println("lista3: " + lista3);

	}

}
