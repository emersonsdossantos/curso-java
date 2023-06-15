package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		double a = 4.5; // declaraçâo e inicialização
		
		a = 12;
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
		// c = 4.5; ja foi declarado como String
		
		double d;  // varaivel foi declarada
		d = 123.56; // variavel foi inicializada
		System.out.println(d); // usada
		
		var e = 123.45;
		System.out.println(e); // nao serã exibido pois a nao entende o tipo
		
		var f = 12; // inteiro
		//f = 12.01; não é possivel atribuir o valor real no inteiro
		System.out.println(f);	
	}

}
