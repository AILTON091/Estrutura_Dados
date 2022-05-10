package br.com.estruturadados.no;

public class Main {

	public static void main(String[] args) {
		 
		No<String> no1 = new No<>("no1");
		
		No<String> no2 = new No<>("no2");
		no1.setProximo(no2);
		
		No<String> no3 = new No<>("no3");
		no2.setProximo(no3);
		
		//no1 que aponta para no2 e assim sucessivamente
		// no1->no2->no3-null
		
		System.out.println(no1);
		System.out.println(no1.getProximo());
		System.out.println(no1.getProximo().getProximo());
		System.out.println(no1.getProximo().getProximo().getProximo());		
	}

}
