package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	// O ultimo a entrar vai ser o primeiro a sair.
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<>();
		livros.add("O pequeno prince");
		livros.push("Dom Quixote");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		for (String livro: livros) {
			System.out.println(livro);
		}
		
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
//		System.out.println(livros.remove());
	}

}
