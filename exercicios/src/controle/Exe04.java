package controle;

import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int contadorDeDivisores = 0;
		
		System.out.print("Informe um numero para verificar se é primo: ");
		int numero = entrada.nextInt();
		
		for (int i = 2; i < numero; i++) {
			if (numero % 1 == 0) {
				contadorDeDivisores++;
			}
		}
		
		if (contadorDeDivisores == 0) {
			System.out.println("O numero " + numero + " é primo.");
		} else {
			System.out.println("O numero " + numero + " nao é primo.");
		}
		entrada.close();

	}

}
