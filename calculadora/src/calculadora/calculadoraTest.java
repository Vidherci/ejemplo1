package calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class calculadoraTest {
	//ejemplo
	@Test
	public void testSuma() {
		Calculadora dora = new Calculadora(20, 10);
		int resultado = dora.suma();
		assertEquals(30, resultado);
	}

	@Test
	public void testResta() {
		Calculadora dora = new Calculadora(20, 10);
		int resultado = dora.resta();
		assertEquals(10, resultado);
	}

	@Test
	public void testMultiplicar() {
		Calculadora dora = new Calculadora(20, 10);
		int resultado = dora.multiplicar();
		assertEquals(200, resultado);
	}

	@Test
	public void testDivide() {
		Calculadora dora = new Calculadora(20, 10);
		int resultado = dora.divide();
		assertEquals(2, resultado);
	}

	@Test(expected = java.lang.ArithmeticException.class)
	public void testDivideExcept() {
		Calculadora dora = new Calculadora(20, 2);
		int resultado = dora.divide();

	}
}
