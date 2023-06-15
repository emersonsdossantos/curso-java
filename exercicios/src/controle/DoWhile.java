package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Voce precisa informar as palavras magicas");
			System.out.print("Deseja sair: ");
			texto = entrada.nextLine();
		} while (!texto.equalsIgnoreCase("Por Favor"));
		
		System.out.println("Obrigado!!");
		
		entrada.close();

	}

}
