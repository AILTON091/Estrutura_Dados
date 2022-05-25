package br.com.estruturadados.exercicio;

import java.util.List;

public class Contador {
	
	List<Integer> inteiro;

	public Contador(List<Integer> inteiro) {
		this.inteiro = inteiro;
	}

	public Contador() {
	}

	public List<Integer> getInteiro() {
		return inteiro;
	}

	public void setInteiro(List<Integer> inteiro) {
		this.inteiro = inteiro;
	}

	@Override
	public String toString() {
		return ""+inteiro+"";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((inteiro == null) ? 0 : inteiro.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contador other = (Contador) obj;
		if (inteiro == null) {
			if (other.inteiro != null)
				return false;
		} else if (!inteiro.equals(other.inteiro))
			return false;
		return true;
	}
}
