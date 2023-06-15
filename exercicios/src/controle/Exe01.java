package controle;

import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com um numero: ");
		int num = entrada.nextInt();
		
		if (num >= 0 && num <= 10 ) {
			if (num % 2 == 0 ) {
				System.out.println("Este numero está entre 0 e 10 e é par");
			} else {
				System.out.println("Este numero está entre 0 e 10 mas é impar");
			}
			
		} else {
			System.out.println("Este numero nao esta entre 0 e 10");
		}
		
		System.out.println("fim");
		entrada.close();

	}

}
