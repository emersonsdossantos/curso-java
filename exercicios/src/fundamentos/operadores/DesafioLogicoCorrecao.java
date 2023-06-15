package fundamentos.operadores;

public class DesafioLogicoCorrecao {

	public static void main(String[] args) {
		
		boolean trabalho1 = true;
		boolean trabalho2 =  false;
		
		boolean comprouTv50 =  trabalho1 && trabalho2;
		boolean comprouTv32 =  trabalho1 ^ trabalho2;
		boolean comprouSorvete =  trabalho1 || trabalho2;
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou a Tv de 50\" ? " + comprouTv50);	
		
		System.out.println("Comprou a Tv de 32\" ? " + comprouTv32);
		
		System.out.println("Comprou sorvete? " + comprouSorvete);
		
		System.out.println("Mais saudavel? " + maisSaudavel);

	}

}
