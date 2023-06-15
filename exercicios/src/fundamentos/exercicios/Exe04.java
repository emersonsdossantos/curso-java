package fundamentos.exercicios;

import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com um valor: ");
		double valor = entrada.nextDouble();
		
		double quadrado =  Math.pow(valor, 2);
		
		double cubo = Math.pow(valor, 3);
		
		System.out.printf("\n%.1f ao quadrado = %.2f", valor, quadrado);
		System.out.printf("\n%.1f ao cubo = %.2f", valor, cubo);
		
		entrada.close();

	}

}
