package fundamentos.exercicios;

import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em Fahrenheit: ");
		double tempFah = entrada.nextDouble();
		
		double tempCel = (tempFah - 32) / 1.8;
		
		System.out.println("Temperatura em Celsius: " + tempCel + " Graus");
		entrada.close();

	}

}
