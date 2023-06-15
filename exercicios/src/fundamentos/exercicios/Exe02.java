package fundamentos.exercicios;

import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a temperatura em Celsius: ");
		double tempCel = entrada.nextDouble();
		
		double tempFah = tempCel * 1.8 + 32;
		
		System.out.println("Valor da temperatura em Fahrenheit: " + tempFah + "F");
		
		entrada.close();

	}

}
