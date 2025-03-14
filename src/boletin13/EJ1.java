package boletin13;

import java.util.*;
import java.util.function.Predicate;

public class EJ1 {

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<>();

		for (int i = 0; i < 40; i++) {

			numeros.add((int) (Math.random() * 21) - 10);

		}

		Predicate<Integer> positivos = e -> e > 0;
		Predicate<Integer> negativos = e -> e < 0;

		System.out.println("numeros positivos");
		numeros.stream().distinct().filter(positivos).forEach(System.out::println);

		int cont = (int) numeros.stream().distinct().filter(positivos).count();
		System.out.println("-----------------");
		System.out.println(cont);
		System.out.println("-----------------");

		System.out.println("numeros negativos");

		numeros.stream().filter(negativos).forEach(System.out::println);


	}

}
