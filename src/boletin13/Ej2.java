package boletin13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Predicate;

public class Ej2 {

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<>();

		for (int i = 0; i < 40; i++) {

			numeros.add((int) (Math.random() * 21) - 10);

		}

		Predicate<Integer> positivos = e -> e > 0;
		Predicate<Integer> negativos = e -> e < 0;

		System.out.println("numeros positivos de mayor a menor");
		numeros.stream().distinct().filter(positivos).sorted().forEach(System.out::println);

		System.out.println("numeros positivos de menor a mayor");
		numeros.stream().distinct().filter(positivos).sorted(Comparator.reverseOrder()).forEach(System.out::println);

		System.out.println("numeros negativos ordenados de mayor a menor");

		numeros.stream().filter(negativos).sorted().forEach(System.out::println);

		System.out.println("numeros negativos ordenados de menor a mayor");

		numeros.stream().filter(negativos).sorted(Comparator.reverseOrder()).forEach(System.out::println);

	}

}
