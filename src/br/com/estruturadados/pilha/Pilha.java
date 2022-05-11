package br.com.estruturadados.pilha;

public class Pilha {

	private No refEntrada;
	
	public Pilha() {
		this.refEntrada = null;
	}
	
	public No pop(){
		if(isEmpty()) {
			return null;
		}
		No poped = refEntrada;
		refEntrada = refEntrada.getRefNo();
		return poped;
	}
	
	public void push(No novoNo) {
		No aux = refEntrada;
		refEntrada = novoNo;
		novoNo.setRefNo(aux);		
	}
	
	public No top() {
		return this.refEntrada;
	}
	
	public boolean isEmpty() {
		return refEntrada == null? true:false; 
	}	
	
	@Override
	public String toString(){
		
		String stringRetorno = "----------------\n";
		stringRetorno += 	   "      Pilha  \n";
		stringRetorno += 	   "----------------\n";
	
		No noAuxiliar = refEntrada;
		
		while (true) {
			if (noAuxiliar !=null) {
				stringRetorno += 	   " [No {dado= "+noAuxiliar.getDado()+"}] "+" \n";
				noAuxiliar = noAuxiliar.getRefNo();
			}else {
				break;
			}
		}
		stringRetorno += 	   "=================\n";
		return stringRetorno;
	}
	
}
