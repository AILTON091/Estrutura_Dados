package br.com.estruturadados.exercicio;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		// 5, 	

		List<Integer> lista1  = new ArrayList<>();
		lista1.add(1);
		lista1.add(2);
		lista1.add(4);
		lista1.add(3);
		lista1.add(4);
		
		List<Contador> contador = new ArrayList<>();
		contador.add(new Contador(lista1));
		 		
		int entrada = 1;
		int x = lista1.size()/entrada; 	
		boolean sair = true;
		
		List<Contador> novoContador = new ArrayList<>();
		for (int i = 0; i < x; i++) {
			int count = 1;
			int inicio = 1;
			int fim  = x;
			
			List<Integer> nov = new ArrayList<>();
			for (Contador cont : contador) {
				for (Integer integer2 : cont.inteiro) {
					if (count >= inicio && count <= fim) {
						nov.add(integer2);
						count++;
						inicio++;
						fim++;
					}
				}
			}
			System.err.println(nov);
			novoContador.add(new Contador(nov));
		}
		
		while (sair) {		
			int maior = 0;
			int maiorGeral = 0;
			
			List<Contador> auxCont = new ArrayList<>();
			for (Contador cont : novoContador) {
				int xcont = 0;
				for (Integer integer2 : cont.inteiro) {
					if (integer2 >= maior) {
						maior = integer2;
					}
					xcont++;
				}
				if(xcont == 1) {
					auxCont.add(new Contador(new ArrayList<>(maior)));
				}else {
					if (maiorGeral >= maior) {
						maiorGeral = maior;
					}
				}	
			}			
			novoContador = auxCont;
			if(maiorGeral > 0) novoContador.add(new Contador(new ArrayList<>(maiorGeral)));
			novoContador.forEach(e->{
				System.out.println(e);
			});		
			
			if(novoContador.size()==1) {
				novoContador.forEach(e->{
					System.out.println(e);
				});
				sair = false;
			}
		}
	}

}
