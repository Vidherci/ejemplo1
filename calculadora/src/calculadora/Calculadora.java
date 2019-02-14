package calculadora;

public class Calculadora {
	private int num1;
	private int num2;
	
	public Calculadora (int a, int b) {
		num1=a;
		num2=b;
	}
	public int suma() {
		int result = num1 + num2;
		return result;
	}
	public int resta() {
		int result = num1 - num2;
		return result;
	}
	public int multiplicar() {
		int result = num1 * num2;
		return result;
	}
	public int divide() {
		if (num2 != 0) {
		int result = num1 / num2;
		return result;
		} else {
			throw new java.lang.ArithmeticException("Division por 0");
		}
	}
	
}