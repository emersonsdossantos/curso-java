package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> lista = new LinkedList<>();
		
		// Offer e Add -> Adicionam elementos na fila
		// A diferenca e o comportamento que ocorre quando a fila esta cheia		
		lista.add("Ana"); // Retorna false
		lista.offer("Bia"); // Lanca excecao
		lista.add("Carlos");
		lista.offer("Daniel");
		lista.add("Rafaela");
		lista.offer("Gui");
		
		lista.clear();
		
		// Peek e Element -> Obter o proximo elemento da fila (sem remover)
		// A diferenca e o comportamento ocorre quando a fila esta vazia
		System.out.println(lista.peek()); //retorna  null
		System.out.println(lista.element()); // Lanca excecao
		
		// Poll e Remove -> obter o proximo da fila e remove
		// Diferenca e o comportamento, ocorre quando a fila esta vazia
		
		System.out.println(lista.poll());// lanca null
		System.out.println(lista.remove()); // lanca excecao
		
//		lista.size();
//		lista.contains("...");
//		lista.isEmpty();
	}
}
