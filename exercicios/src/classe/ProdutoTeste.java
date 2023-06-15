package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4356.89, 0.25 );
				
		Produto p2 = new Produto();
		p2.nome = "Caneta";
		p2.preco = 12.56;
		p2.desconto = 0.29;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.3);
		double media = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("A media do preco dos produtos = R$%.2f ", media);
		

	}

}
