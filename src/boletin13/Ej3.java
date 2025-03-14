package boletin13;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Ej3 {

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<>();

		for (int i = 1; i < 101; i++) {

			numeros.add(i);

		}

		System.out.println(numeros);

		Predicate<Integer> multiplos = e -> e % 7 == 0;

		System.out.println("multioplso de 7:");
		numeros.stream().filter(multiplos).forEach(System.out::println);

	}

}
