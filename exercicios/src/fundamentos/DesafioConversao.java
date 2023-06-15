package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o primeiro salario: ");
		String primeiroSalario = entrada.nextLine().replace(",", ".");
		
		System.out.println("Informe o segundo salario: ");
		String segundoSalario = entrada.nextLine().replace(",", ".");
		
		System.out.println("Informe o terceiro salario: ");
		String terceiroSalario = entrada.nextLine().replace(",", ".");
		
		
		double salario1 = Double.parseDouble(primeiroSalario);
		double salario2 = Double.parseDouble(segundoSalario);
		double salario3 = Double.parseDouble(terceiroSalario);
		
		double soma = salario1 + salario2 + salario3;
		
		System.out.println("A soma dos salario é : " + soma);
		
		System.out.println("A media do salario é: " + soma / 3);
		
		entrada.close();

	}

}
