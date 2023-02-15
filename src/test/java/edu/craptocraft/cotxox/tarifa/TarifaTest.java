package edu.craptocraft.cotxox.tarifa;

import org.junit.Test;

import edu.craptocraft.cotxox.carrera.Carrera;

import static org.junit.Assert.assertTrue;


public class TarifaTest {

	private String tarjetaCredito = "4916119711304546";
	private Carrera carrera = new Carrera(tarjetaCredito);

	// If "coste" is less than the minim,
    // "costeEsperado" == minim cost (5.0).
	// Otherwise, returns the value of "costeEsperado".
	@Test
	public void test_isCosteMinimo() {

		carrera.setDistancia(7.75);
		carrera.setTiempoEsperado(10);
		double costeEsperado = carrera.getCosteEsperado();

		assertTrue("El coste no supera el coste mínimo", costeEsperado>5.0);

		carrera.setDistancia(1.0);
		carrera.setTiempoEsperado(2);
		double costeEsperadoMinimo = carrera.getCosteEsperado();

		assertTrue("El coste supera el coste mínimo", costeEsperadoMinimo==5.0);

	}

}