package fundamentos.operadores;

public class Relacionais {

	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a';
		
		System.out.println(a == b);
		System.out.println(30 != 7);
		System.out.println(3 > 4);
		System.out.println(3 >= 3);
		System.out.println(3 < 4);
		System.out.println(30 <= 4);
		
		double nota = 4.0;
		boolean bomComportamente =  true;
		boolean passouPorMedia = nota > 7;
		boolean temDesconto = bomComportamente && passouPorMedia;
		
		System.out.println("Tem Desconto? " + temDesconto);

	}

}
