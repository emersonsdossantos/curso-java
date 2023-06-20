package classe.desafio;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Emerson", 100);
		Pessoa p2 = new Pessoa("Agatha", 30);
		
		Comida c1 = new Comida("Arroz", 0.120);
		Comida c2 = new Comida("Feijao", 0.2);
		
		System.out.printf("%s peso inicial %.2f kg \n", p1.nome, p1.peso);
		p1.comer(c2);
		System.out.println("Comeu " + c2.nomeComida);
		p1.comer(c1);
		System.out.println("Comeu " + c1.nomeComida);
		System.out.printf("%s peso apos comer %.2f kg \n\n", p1.nome, p1.peso);
		
		
		System.out.printf("%s peso inicial %.2f kg \n", p2.nome, p2.peso);
		p2.comer(c2);
		System.out.println("Comeu " + c2.nomeComida);
		p2.comer(c2);
		System.out.println("Comeu " + c2.nomeComida);
		p2.comer(c1);
		System.out.println("Comeu " + c1.nomeComida);
		System.out.printf("%s peso apos comer %.2f kg", p2.nome, p2.peso);
	}

}
