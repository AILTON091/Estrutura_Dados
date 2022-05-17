package br.com.estruturadados.exercicio;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		PilhaTeste pilha = new PilhaTeste();
		
		
		List<Integer> listaInst = new ArrayList<>();
		
		listaInst.add(1);
		listaInst.add(2);
		listaInst.add(4);
		listaInst.add(3);
		listaInst.add(4);
		
		int tamanho = listaInst.size();
		
		int x = 3;

		for (int i = 0; i < x; i++) {
			int count = 0;
			int totalcount = 0;
			
			List<Integer> nov = new ArrayList<>();
			for (Integer integer : listaInst) {
				if (count < tamanho && count >=i && totalcount < x) {
					nov.add(integer);					
					totalcount++;
				}
				count ++;
			}
			pilha.push(new No(nov));
		}
		
		System.out.println(pilha);
		
		
		
	}

}
