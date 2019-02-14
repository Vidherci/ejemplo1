package calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class Ejercicio1Test {

	@Test
	public void testResta() {
		Ejercicio1 dora = new Ejercicio1 (50,10);
		int resultado = dora.resta();
		assertEquals(40, resultado);
		
	}

	@Test
	public void testResta2() {
		Ejercicio1 dora = new Ejercicio1 (10,50);
		boolean resultado = dora.resta2();
		assertFalse(resultado);
	}
	@Test
	public void testResta2b() {
		Ejercicio1 dora = new Ejercicio1 (50,10);
		boolean resultado = dora.resta2();
		assertTrue(resultado);
		
	}

	@Test
	public void testDivide2() {
		Ejercicio1 dora = new Ejercicio1 (50,0);
		Integer resultado = dora.divide2();
		assertNull(resultado);
	}
	@Test
	public void testDivide2b() {
		Ejercicio1 dora = new Ejercicio1 (0,50);
		int resultado = dora.divide2();
		assertNotNull(resultado);
	}
}

