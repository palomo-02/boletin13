package ej15;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

import org.junit.jupiter.api.Test;

class AppTest1 {

	@Test
	void testClasificadoPorTipo() {
		ArrayList<Publicaciones> lista = new ArrayList<>();

		lista.add(new Libro("Gabriel García Márquez", "Cien años de soledad", LocalDate.of(1967, 5, 30), 432));

		lista.add(new Ebook("Aldous Huxley", "Un mundo feliz", LocalDate.of(1932, 1, 1), 288));

		lista.add(new Revista("Time", "Persona del año 2020", LocalDate.of(2020, 12, 10), 40));

	}

	@Test
	void testPublicacionesAutor() {
		// Inicializar la lista con datos de prueba
		ArrayList<Publicaciones> lista = new ArrayList<>();
		lista.add(new Libro("Gabriel García Márquez", "Cien años de soledad", LocalDate.of(1967, 5, 30), 432));
		lista.add(new Ebook("George Orwell", "1984", LocalDate.of(1949, 6, 8), 328));
		lista.add(new Ebook("George Orwell", "Rebelión en la granja", LocalDate.of(1945, 8, 17), 112));

		// Filtrar publicaciones de un autor específico
		String autor = "George Orwell";
		ArrayList<Publicaciones> filtradas = new ArrayList<>();
		lista.stream().filter(p -> p.getAutor().equals(autor)).forEach(filtradas::add);

		// Verificar que hay 2 publicaciones de George Orwell
		assertEquals(2, filtradas.size());
		assertEquals("1984", filtradas.get(0).getTitulo());
		assertEquals("Rebelión en la granja", filtradas.get(1).getTitulo());
	}

	@Test
	void testOrdernarPorPagina() {

		ArrayList<Publicaciones> lista = new ArrayList<>();

		lista.add(new Ebook("Aldous Huxley", "Un mundo feliz", LocalDate.of(1932, 1, 1), 288));
		lista.add(new Revista("Time", "Persona del año 2020", LocalDate.of(2020, 12, 10), 40));
		lista.sort(Comparator.comparing(Publicaciones::getPags));
		assertEquals(40, lista.get(0).getPags());
		assertEquals(288, lista.get(1).getPags());

	}

	@Test
	void testObtenerTituloYautor() {
		ArrayList<Publicaciones> lista = new ArrayList<>();

		lista.add(new Ebook("Aldous Huxley", "Un mundo feliz", LocalDate.of(1932, 1, 1), 288));
		lista.add(new Revista("Time", "Persona del año 2020", LocalDate.of(2020, 12, 10), 40));

		lista.forEach(p -> {
			String resultado = p.MostrarTituloYautor();

			assertTrue(resultado.contains(p.getTitulo()));
			assertTrue(resultado.contains(p.getAutor()));

		});

	}

	@Test
	void testFiltroFecha() {
		ArrayList<Publicaciones> lista = new ArrayList<>();
		lista.add(new Revista("National Geographic", "El cambio climático", LocalDate.of(2021, 9, 1), 50));
		lista.add(new Revista("Time", "Persona del año 2020", LocalDate.of(2020, 12, 10), 40));
		lista.add(new Libro("Gabriel García Márquez", "Cien años de soledad", LocalDate.of(1967, 5, 30), 432));

		// Filtrar publicaciones posteriores al año 2000
		ArrayList<Publicaciones> filtradas = new ArrayList<>();
		lista.stream().filter(p -> p.getAñoPublicacion().isAfter(LocalDate.of(2000, 1, 1))).forEach(filtradas::add);

		// Verificar que solo hay 2 publicaciones posteriores al 2000
		assertEquals(2, filtradas.size());
		assertEquals("El cambio climático", filtradas.get(0).getTitulo());
		assertEquals("Persona del año 2020", filtradas.get(1).getTitulo());
	}

}
