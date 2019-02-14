package calculadora;

public class Factorial {

	public static int calculo(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Numero " + n + " no puede ser > 0");
		}

		int fact = 1;
		for (int i = 2; i < n; i++)
			fact *= i;
		System.out.println("fact = " + fact);
		if (fact == 0) {
			throw new ArithmeticException("Overflow, numero " + n + " demasiado grande");
		}
		return fact;
	}

}
