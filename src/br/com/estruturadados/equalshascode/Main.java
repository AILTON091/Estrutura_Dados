package br.com.estruturadados.equalshascode;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Carro> lista = new ArrayList<>();
		
		lista.add(new Carro("ford"));
		lista.add(new Carro("chervelot"));
		lista.add(new Carro("toyota"));

		System.out.println(lista.contains(new Carro("ford")));
		
		System.out.println(new Carro("ford").marca.hashCode());
	}

}
