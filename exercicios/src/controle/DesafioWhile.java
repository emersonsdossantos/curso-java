package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
			
		double total = 0;
		double nota = 0;
		double contador = 0;
		
		
		while(nota != -1) {
			System.out.println("Entre com a nota: ");
			nota = entrada.nextDouble();
			
			if (nota <= 10 && nota >= 0) {
				contador++;
				total += nota;
			} else if (nota != -1) {
				System.out.println("Nota invalida");
			}
		}
		double media = total / contador;
		
    	System.out.println("Total de nota: " +  total);
		System.out.println("quantidade de nota: " +  contador);
		System.out.println("Media das nota: " +  media);
		
		
		entrada.close();
	}

}
