package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o dia da semana: ");
		String dia = entrada.next();
		
		if (dia.equalsIgnoreCase("Domingo")) {
			System.out.println(dia + " -> 1");
		} else if (dia.equalsIgnoreCase("Segunda")) {
			System.out.println(dia + " -> 2");
		} else if (dia.equalsIgnoreCase("Terça")) {
			System.out.println(dia + " -> 3");
		} else if (dia.equalsIgnoreCase("Quarta")) {
			System.out.println(dia + " -> 4");
		} else if (dia.equalsIgnoreCase("Quinta")) {
			System.out.println(dia + " -> 5");
		} else if (dia.equalsIgnoreCase("sexta")) {
			System.out.println(dia + " -> 6");
		} else if (dia.equalsIgnoreCase("Sabado")) {
			System.out.println(dia + " -> 7");
		} else {
			System.out.println("Dia invalido");
		}
		System.out.println("Fim");
		
		entrada.close();

	}

}
