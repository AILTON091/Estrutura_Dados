package br.com.estruturadados.fila;


// No de criacao da Fila 
public class No {
	
	private Object object;
	private No no;
	
	public No() {		
	}
	
	public No(Object object) {		
		this.no = null; 
		this.object = object;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public No getNo() {
		return no;
	}

	public void setNo(No no) {
		this.no = no;
	}

	@Override
	public String toString() {
		return "No [object=" + object + "]";
	}
		

}
