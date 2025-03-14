package pruebasLambda;

import java.util.*;
import java.util.function.Consumer;

public class Prueba4 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);

		ArrayList<String> Logs = new ArrayList<>();

		Consumer<String> Historial = log -> Logs.add(log);

		Historial.accept("hiiuj87k8koa");
		Historial.accept("e3wf");
		Historial.accept("f4gf");
		Historial.accept("5846j6");
		Historial.accept("f4346th35");

		Logs.forEach(System.out::println);

		sc.close();
	}

}
