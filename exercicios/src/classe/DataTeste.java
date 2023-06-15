package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data data1 = new Data();
		
		Data data2 = new Data(30, 5, 2016);	
		
		String data = data1.obterDataFormatada();
		
		System.out.println(data);
		
		data2.imprimirDataFormatada();
		
		System.out.printf("\nData 2 = %d/%d/%d", data2.dia, data2.mes, data2.ano);
		
		

	}

}
