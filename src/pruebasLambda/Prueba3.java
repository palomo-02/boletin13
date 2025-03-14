package pruebasLambda;

import java.util.Scanner;
import java.util.function.Function;

public class Prueba3 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		
		

		System.out.println("inserte una cadena");
		String cad = sc.nextLine();
		
		
		
		cad.trim();
		Function<String,Integer> trans = cambio-> cad.length();

				
		
		
		System.out.println(trans.apply(cad));
		
		
		
		
		
		
		
		sc.close();
	}

}
