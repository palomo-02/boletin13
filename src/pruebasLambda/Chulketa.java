package pruebasLambda;
import java.util.*;
import java.util.function.*;
import java.time.*;
public class Chulketa {
	

	
	public static void main(String[] args) {

		        // 1. Ejemplo de Predicate
		        Predicate<Integer> esPar = n -> n % 2 == 0;
		        Predicate<Integer> esMayorQue10 = n -> n > 10;

		        System.out.println("¿8 es par? " + esPar.test(8));  // ✅ true
		        System.out.println("¿7 es par? " + esPar.test(7));  // ❌ false

		        // AND: Número par y mayor que 10
		        Predicate<Integer> esParYMayorQue10 = esPar.and(esMayorQue10);
		        System.out.println("¿12 es par y mayor que 10? " + esParYMayorQue10.test(12)); // ✅ true

		        // OR: Número par o mayor que 10
		        Predicate<Integer> esParOMayorQue10 = esPar.or(esMayorQue10);
		        System.out.println("¿9 es par o mayor que 10? " + esParOMayorQue10.test(9)); // ❌ false

		        // Negate: Número NO es par
		        Predicate<Integer> noEsPar = esPar.negate();
		        System.out.println("¿9 NO es par? " + noEsPar.test(9)); // ✅ true

		        // isEqual: Compara con un valor específico
		        Predicate<String> esHola = Predicate.isEqual("Hola");
		        System.out.println("¿La cadena es 'Hola'? " + esHola.test("Hola")); // ✅ true
		        
		        
		        // 2. Ejemplo de Supplier
		        Supplier<LocalDate> obtenerFecha = () -> LocalDate.now();
		        System.out.println("Fecha actual: " + obtenerFecha.get());

		        Supplier<Integer> numeroAleatorio = () -> new Random().nextInt(100); // Entre 0 y 99
		        System.out.println("Número aleatorio: " + numeroAleatorio.get());

		        Supplier<String> saludo = () -> "¡Hola, bienvenido!";
		        System.out.println(saludo.get());


		        // 3. Ejemplo de Function
		        Function<Integer, Integer> cuadrado = n -> n * n;
		        System.out.println("Cuadrado de 5: " + cuadrado.apply(5)); // 25

		        Function<String, Integer> longitud = str -> str.length();
		        System.out.println("Longitud de 'Hola': " + longitud.apply("Hola")); // 4

		        Function<Integer, String> numeroATexto = num -> "Número: " + num;
		        System.out.println(numeroATexto.apply(10)); // "Número: 10"

		        // Encadenamiento de funciones
		        Function<Integer, String> dobleYTexto = cuadrado.andThen(numeroATexto);
		        System.out.println(dobleYTexto.apply(3)); // "Número: 9"


		        // 4. Ejemplo de Consumer
		        Consumer<String> imprimirMayusculas = str -> System.out.println(str.toUpperCase());
		        imprimirMayusculas.accept("Hola mundo"); // "HOLA MUNDO"

		        List<String> logs = new ArrayList<>();
		        Consumer<String> registrarLog = mensaje -> logs.add("[LOG] " + mensaje);

		        registrarLog.accept("El sistema ha iniciado.");
		        registrarLog.accept("Usuario 'admin' ha iniciado sesión.");
		        registrarLog.accept("Error: Conexión fallida.");

		        System.out.println("Registros:");
		        logs.forEach(System.out::println);
		        
		        
		        // 5. Ejemplo de Comparator
		        // Comparar números
		        Comparator<Integer> compararPorValor = (a, b) -> Integer.compare(a, b);
		        System.out.println("Comparar 5 y 10: " + compararPorValor.compare(5, 10));  // -1 (5 es menor que 10)
		        System.out.println("Comparar 10 y 5: " + compararPorValor.compare(10, 5));  // 1 (10 es mayor que 5)
		        System.out.println("Comparar 5 y 5: " + compararPorValor.compare(5, 5));   // 0 (son iguales)

		        // Comparar cadenas por longitud
		        Comparator<String> compararPorLongitud = (a, b) -> Integer.compare(a.length(), b.length());
		        System.out.println("Comparar 'Hola' y 'Mundo': " + compararPorLongitud.compare("Hola", "Mundo")); // 0
		        System.out.println("Comparar 'Hola' y 'Java': " + compararPorLongitud.compare("Hola", "Java"));  // 0
		        System.out.println("Comparar 'Hola' y 'JavaScript': " + compararPorLongitud.compare("Hola", "JavaScript")); // -1


		    }

	}
