package br.com.estruturadados.stack;

import java.util.Stack;

public class Main {

	public static void main (String[] args) {

		// pilha
		Stack<Carro> stackCarros = new Stack<>();
		
		stackCarros.push(new Carro("ford")); // push - adiciona
		stackCarros.push(new Carro("chervelot"));
		stackCarros.push(new Carro("Fiat"));
		
		System.out.println(stackCarros);
		System.out.println(stackCarros.pop()); // remove 
		System.out.println(stackCarros);
		
		System.out.println(stackCarros.peek());//Top
		
		
	}
	
	
}
