package fundamentos.operadores;

public class DesafioAritimeticos {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		
		a = 6 * (3 + 2);
		b = (int) Math.pow(a, 2);
		c = b / (3*2);
		
		System.out.println(c);
		
		int d = ((1 - 5) * (2 - 7)) / 2;
		int e = (int) Math.pow(d, 2);
		
		System.out.println(e);
		
		int f = c - e;
		
		System.out.println(f);
		
		int resultado = ((int) Math.pow(f, 3) / ((int) Math.pow(10, 3)));
		
		System.out.println(resultado);
	}

}
