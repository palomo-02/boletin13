package boletin13;

import java.util.*;
import java.util.stream.Collectors;

public class Ej5 {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        // Solicitar una cadena de texto al usuario
        System.out.println("Introduzca una cadena con palabras separadas por espacios:");
        String cad = sc.nextLine();

        // Crear una lista de palabras, ordenarlas y mostrarlas
        List<String> lista = Arrays.stream(cad.split("\\s+"))  // Dividir la cadena en palabras usando un solo espacio o múltiples
                                   .sorted()                  // Ordenar las palabras alfabéticamente
                                   .collect(Collectors.toList());  // Recoger el resultado en una lista

        // Mostrar las palabras ordenadas
        System.out.println("Las palabras ordenadas son:");
        lista.forEach(System.out::println);  // Imprimir cada palabra de la lista

        sc.close();  // Cerrar el Scanner
    }
}
