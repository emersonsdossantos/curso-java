package fundamentos.exercicios;

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("informe o peso: ");
		double peso = entrada.nextDouble();
		
		System.out.print("Informe a altura: ");
		double altura =  entrada.nextDouble();
		
		double imc = peso / Math.pow(altura, 2);
		
		System.out.printf("IMC = %.2f", imc );
		
		entrada.close();

	}

}
