package pruebasLambda;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.function.*;

public class Ej5 {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		Supplier<LocalDate> fecha = () -> LocalDate.now();

		System.out.println(fecha.get());

		sc.close();
	}
}
