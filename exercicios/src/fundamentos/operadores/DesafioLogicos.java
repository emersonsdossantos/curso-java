package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		
		boolean trabalho1 = false;
		boolean trabalho2 =  false;
		
		if (trabalho1 && trabalho2) {
			System.out.println("Foi ao shopping e comprou a TV de 50 Polegadas e tomou sorvete");
		} else if (trabalho1 || trabalho2 ) {
			System.out.println("Foi ao shopping e comprou a TV de 32 Polegadas e tomou sorvete");
		} else {
			System.out.println("Nao comprou a  tv e nao tomou sorvete");
		}

	}

}
