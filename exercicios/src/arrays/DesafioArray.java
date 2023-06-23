package arrays;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantas notas deseja informar: ");
		int numNotas = entrada.nextInt();
		
		double[] notas = new double[numNotas];
		
		for(int i = 0; i < numNotas; i++) {
			System.out.println("Digite a nota " + (i + 1) + ": ");
			notas[i] = entrada.nextDouble();			
		}
		
		double soma = 0;
		
		for(double nota : notas) {
			 soma += nota;
		}
		
		double media = soma / notas.length;
		System.out.println("A media de nota: " + media);
		
		entrada.close();

	}

}
