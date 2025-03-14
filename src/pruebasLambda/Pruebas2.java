package pruebasLambda;

import java.util.*;
import java.util.function.*;

public class Pruebas2 {


	public static void main(String[] args) {
		var sc = new Scanner(System.in);
	
		
		
		System.out.println("inserte una cadena");
		String cad = sc.nextLine();
		
		
		
		
		Predicate<String> conteo = str-> str.length()<5;

		
		
		if (conteo.test(cad)) {
			
			
			System.out.println("menor");
		}else {
			
			
			System.out.println("mayort");
		}
		
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
