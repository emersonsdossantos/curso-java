package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 6;
		
		String resultadoFinal = media >= 7.0 ? "Aprovado": "em recuperacao";
		System.out.println("O aluno esta " + resultadoFinal);
		
		double nota = 8;
		boolean bomComportamente =  true;
		boolean passouPorMedia = nota > 7;
		boolean temDesconto = bomComportamente && passouPorMedia;
		String resultado = temDesconto ? "Sim": "Nao";
		
		System.out.println("Tem Desconto? " + resultado);

	}

}
