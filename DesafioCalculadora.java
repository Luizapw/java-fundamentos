package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o numero: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("Informe o numero: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("Informe a opera��o: ");
		String op = entrada.next();
		
		//LOGICA
		double resultado = "+".equals(op) ? num1 + num2: 0;
		resultado = "-".equals(op) ? num1 - num2: resultado;
		resultado = "*".equals(op) ? num1 * num2: resultado;
		resultado = "/".equals(op) ? num1 / num2: resultado;
		resultado = "%".equals(op) ? num1 % num2: resultado;
		
		
		System.out.printf("%f.2 %s %f.2 = %.2f", num1, op, num2, resultado);
		entrada.close();
	}
}