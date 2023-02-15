package edu.craptocraft.cotxox.carrera;

import org.junit.Before;
import org.junit.Test;

import edu.craptocraft.cotxox.conductores.Conductor;
import edu.craptocraft.cotxox.conductores.PoolConductores;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CarreraTest {

	private PoolConductores conductores = null;
	private String[] nombres = new String[] { "Samantha", "Fox" };
	private List<Conductor> poolConductores = new ArrayList<Conductor>();
	private Conductor conductor = null;
	private String tarjetaCredito = "4916119711304546";
	private Carrera carrera = new Carrera(tarjetaCredito);

	@Before
	public void setup_conductor() {


		for (String nombre : nombres) {
			conductor = new Conductor(nombre);
			poolConductores.add(conductor);
		}

		conductores = new PoolConductores(poolConductores);

	}
	
	// The conductor assigned is in the Array given before.
	@Test
	public void test_assignConductor() {

		carrera.asignarConductor(conductores);

		assertTrue(Arrays.asList(nombres).contains(conductor.getNombre()));

	}

}