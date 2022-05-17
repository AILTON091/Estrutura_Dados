package br.com.estruturadados.exercicio;

import java.util.List;

public class No {
	
	private List<Integer> valor;	
	private No refNo;
	
	public No() {
	}
	
	public No(List<Integer> valor) {
		this.valor = valor;
		this.refNo = null;
	}
	
	public List<Integer> getValor() {
		return valor;
	}
	public void setValor(List<Integer> valor) {
		this.valor = valor;
	}
	public No getRefNo() {
		return refNo;
	}
	public void setRefNo(No refNo) {
		this.refNo = refNo;
	}     
	
}
