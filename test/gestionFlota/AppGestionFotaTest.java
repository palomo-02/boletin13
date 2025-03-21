package gestionFlota;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

class AppGestionFotaTest {

	@Test
	void testVehiculosMasDe5() {

		List<Vehiculo> vehiculos = new ArrayList<>();
		vehiculos.add(new Coche("Toyota", "Corolla", "4151PQR", LocalDate.of(2015, 1, 1), 5));
		vehiculos.add(new Moto("Yamaha", "YZF-R3", "1234ABC", LocalDate.of(2021, 1, 1), 321));

		List<Vehiculo> resultado = vehiculos.stream()
				.filter(p -> (LocalDate.now().getYear() - p.getAño().getYear() > 5)).collect(Collectors.toList());

		assertEquals(1, resultado.size());

	}

	@Test
	void testVehiculosPorTipo() {

		List<Vehiculo> vehiculos = new ArrayList<>();
		vehiculos.add(new Coche("Toyota", "Corolla", "4151PQR", LocalDate.of(2015, 1, 1), 5));
		vehiculos.add(new Moto("Yamaha", "YZF-R3", "1234ABC", LocalDate.of(2021, 1, 1), 321));

		long ContCoches = vehiculos.stream().filter(p -> p instanceof Coche).count();

		long ContMotos = vehiculos.stream().filter(p -> p instanceof Coche).count();

		assertEquals(1, ContCoches);

		assertEquals(1, ContMotos);

	}

	@Test
	void testMostrarMarcas() {

		List<Vehiculo> vehiculos = new ArrayList<>();
		vehiculos.add(new Coche("Toyota", "Corolla", "4151PQR", LocalDate.of(2015, 1, 1), 5));
		vehiculos.add(new Moto("Yamaha", "YZF-R3", "1234ABC", LocalDate.of(2021, 1, 1), 321));

		List<String> marcas = vehiculos.stream().map(Vehiculo::getMarca).collect(Collectors.toList());

		assertTrue(marcas.contains("Toyota"));
		assertTrue(marcas.contains("Yamaha"));

	}

	@Test
	void testVehiculoViejoYnuevo() {
	    List<Vehiculo> vehiculos = new ArrayList<>();
	    vehiculos.add(new Coche("Toyota", "Corolla", "4151PQR", LocalDate.of(2015, 1, 1), 5));
	    vehiculos.add(new Moto("Yamaha", "YZF-R3", "1234ABC", LocalDate.of(2021, 1, 1), 321));

	    Vehiculo masViejo = vehiculos.stream()
	        .min(Comparator.comparing(Vehiculo::getAño)) // Encuentra el más antiguo
	        .orElse(null);

	    Vehiculo masNuevo = vehiculos.stream()
	        .max(Comparator.comparing(Vehiculo::getAño)) // Encuentra el más nuevo
	        .orElse(null);

	    assertNotNull(masViejo);
	    assertNotNull(masNuevo);
	    assertEquals("Toyota", masViejo.getMarca());
	    assertEquals("Yamaha", masNuevo.getMarca());
	}


	@Test
	void testFiltrado() {


	
		 List<Vehiculo> vehiculos = new ArrayList<>();
		 
		    vehiculos.add(new Coche("Toyota", "Corolla", "4151PQR", LocalDate.of(2015, 1, 1), 5));
		    vehiculos.add(new Moto("Yamaha", "YZF-R3", "1234ABC", LocalDate.of(2021, 1, 1), 321));
			vehiculos.add(new Moto("Ducati", "Monster 821", "1121JKL", LocalDate.of(2018, 1, 1), 821));
			vehiculos.add(new Moto("Suzuki", "GSX-S750", "3141MNO", LocalDate.of(2022, 1, 1), 749));

	
	
	
	
	
	
	
	
	
	}

	@Test
	void testListadoOmarca() {
		fail("Not yet implemented");
	}

}
