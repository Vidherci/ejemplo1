package calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {
	
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testCalculoMenor0() {
		int result = Factorial.calculo(-5);
	}
	@Test(expected = java.lang.ArithmeticException.class)
	public void testCalculoOverflow() {
		int result = Factorial.calculo(999999999);
	}
	@Test
	public void testvalido() {
		int result = Factorial.calculo(10);
	}
}
