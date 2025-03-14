package pruebasLambda;

import java.util.*;
import java.util.function.Predicate;

public class Prueba1 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		System.out.println("isnerte n ");
		int n = sc.nextInt();

		Predicate<Integer> mayor = x -> x >= 0;

		if (mayor.test(n)) {
			System.out.println("es positivo ");
		} else {

			System.out.println("es nagativo ");

		}

		sc.close();

	}

}
