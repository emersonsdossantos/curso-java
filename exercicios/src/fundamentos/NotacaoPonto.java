package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.replace("X", "senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String x = "Agatha".toUpperCase();
		System.out.println(x);
		
		System.out.println("Emerson".toUpperCase());
		
		String y = "Bom dia X".replace("X", "Emerson").toUpperCase().concat("!!!");
		System.out.println(y);
		
		// Tipos primitivos nao tem o operador "."
		int a =3;
		System.out.println(a);
	}

}
