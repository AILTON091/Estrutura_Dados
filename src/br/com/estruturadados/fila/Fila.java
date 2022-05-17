package br.com.estruturadados.fila;

public class Fila {

	private No refEntrada;
	
	public Fila() {
		this.refEntrada = null;
	}
	
	public No first(No novoNo) {
		if(!isEmpty()) {
			No primeiro = refEntrada;	
			while(true) {
				if (primeiro.getNo() != null) {
					primeiro = primeiro.getNo();							
				}else {
					break;
				}
					
			}		
		}
		return null;
	}
	
	
	public No dequeue(No novoNo) {
		if(!isEmpty()) {
			No primeiro = refEntrada;
			No noAuxiliar = refEntrada;
			while(true) {
				if (primeiro.getNo() != null) {
					noAuxiliar = primeiro;
					primeiro = primeiro.getNo();							
				}else {
					noAuxiliar.setNo(null);
					break;
				}
			}	
			return primeiro;
		}
		return null;
	}
	
	
	public void enqueue(No novoNo) {
		novoNo.setNo(refEntrada);
		refEntrada = novoNo;
	}
	
	public boolean isEmpty() {
		return refEntrada == null?true:false;
	}
}
