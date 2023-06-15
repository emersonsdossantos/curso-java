package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o primeiro numero:");
		double n1 = entrada.nextInt();
		
		System.out.println("Informe o segundo numero:");
		double n2 = entrada.nextInt();
		
		System.out.println("Informe o operador ( +, -, *, /, %): ");
		String operador = entrada.next();
		
		double resultado = "+".equals(operador) ? n1 + n2 : 0;
		resultado = "-".equals(operador) ? n1 - n2 : resultado;
		resultado = "*".equals(operador) ? n1 * n2 : resultado;
		resultado = "/".equals(operador) ? n1 / n2 : resultado;
		resultado = "%".equals(operador) ? n1 % n2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", n1, operador, n2, resultado );
		
		entrada.close();

	}

}
