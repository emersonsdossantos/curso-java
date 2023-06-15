package controle;

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com a nota 1: ");
		double nota1 = entrada.nextDouble();
		
		System.out.print("Entre com a nota 2: ");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if (media >= 7) {
			System.out.println("Sua media foi " + media + " e voce esta Aprovado");
		} else if (media < 7  && media > 4){
			System.out.println("Sua media foi " + media + " e voce em, Recuperacao");
		} else {
			System.out.println("Sua media foi " + media + " e voce esta Reprovado");
		}
		
		entrada.close();

	}

}
