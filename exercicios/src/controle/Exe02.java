package controle;

public class Exe02 {

	public static void main(String[] args) {
		
		int ano = 1992;
		
		if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
			System.out.println("O ano " + ano + " e Bissexto");
		} else {
			System.out.println("O ano " + ano + " nao é Bissesto (tem 365 dias" );
		}
	}

}
