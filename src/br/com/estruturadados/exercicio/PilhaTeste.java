package br.com.estruturadados.exercicio;

import java.util.List;

public class PilhaTeste {

	private No refEntrada;
	
	private int maiorGeral = 0; 
	
	public PilhaTeste() {
		this.refEntrada = null;
	}
	
	public void push(No novoNo) {
		No aux = refEntrada;
		refEntrada = novoNo;
		novoNo.setRefNo(aux);
	}
	
	@Override
	public String toString(){
		
		String stringRetorno = "----------------\n";
		stringRetorno += 	   "      Pilha  \n";
		stringRetorno += 	   "----------------\n";
		
		No noAuxiliar = refEntrada;
		int soma = 0;
		int maior = 0;
		while (true) {
			if (noAuxiliar !=null) {
				for (Integer valor : noAuxiliar.getValor()) {
					if (valor >= maior) maior = valor;						
				}
				if (maior > maiorGeral) maiorGeral = maior;
				stringRetorno += 	   " dado= "+noAuxiliar.getValor()+""+" maior é "+ maior+ " \n";
				noAuxiliar = noAuxiliar.getRefNo();				
			}else {
				break;
			}
		}
		
		stringRetorno += 	   "Maior Geral é "+maiorGeral +" \n";
		stringRetorno += 	   "=================\n";
		return stringRetorno;
	}
	
}
