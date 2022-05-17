package br.com.estruturadados.pilha;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * --- Pilha ----- 
		 * [No {dado =6}]
		 * [No {dado =5}] 
		 * [No {dado =4}] 
		 * [No {dado =3}] 
		 * [No {dado =2}] 
		 * [No {dado =1}]
		 */		
		
		Pilha minhaPilha = new Pilha();
		
		// Push -- adiciona elemento na pilha  (onde o 1 vai para o final da fila)
		minhaPilha.push(new No(1));
		minhaPilha.push(new No(2));
		minhaPilha.push(new No(3));
		minhaPilha.push(new No(4));
		minhaPilha.push(new No(5));
		minhaPilha.push(new No(6));
		System.out.println(minhaPilha);
		
		// Pop -- remove o último elemento na pilha 
		System.out.println(minhaPilha.pop());
		
		// Top -- mostra o último elemento na pilha 
		System.out.println(minhaPilha.top());
		
		// Push  - adiciona o 99 no inicio da fila
		minhaPilha.push(new No(99));
		System.out.println(minhaPilha);		
	}

}
