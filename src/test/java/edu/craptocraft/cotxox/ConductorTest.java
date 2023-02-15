package edu.craptocraft.cotxox;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import edu.craptocraft.cotxox.conductores.Conductor;
import edu.craptocraft.cotxox.conductores.PoolConductores;

public class ConductorTest {

	private PoolConductores conductores = null;
	private String[] nombres = new String[] { "Samantha", "Fox" };
	private String[] matricula = { "4ABC123", "5DHJ234" };
	private String[] modelos = { "Chevy Malibu", "Toyota Prius" };

	@Before
	public void setup_conductor() {

		List<Conductor> poolConductores = new ArrayList<Conductor>();
		Conductor conductor = null;

		for (String nombre : nombres) {
			conductor = new Conductor(nombre);
			poolConductores.add(conductor);
		}

		int index = 0;
		
		for (Conductor conductora : poolConductores) {
			conductora.setMatricula(matricula[index]);
			conductora.setModelo(modelos[index]);
			conductora.setValoracion((byte) 3);
			index++;
		}

		conductores = new PoolConductores(poolConductores);

	}
	
	@Test
	public void test_getConductorValues() {

		for (Conductor conductora : conductores.getPoolConductores()) {
			assertTrue(Arrays.asList(nombres).contains(conductora.getNombre()));
			assertTrue(Arrays.asList(modelos).contains(conductora.getModelo()));
			assertTrue(Arrays.asList(matricula).contains(conductora.getMatricula()));
			assertEquals(3.0, conductora.getValoracion(), 0.0);
		}
	}

}