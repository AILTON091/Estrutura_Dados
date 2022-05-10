package br.com.estruturadados.atribuicaoreferencia;

public class Main {

	public static void main(String[] args) {
		
		// tipos primitivos 
		int intA = 1;
		int intB = intA;
		intA = 2;
		System.out.println("intA= "+intA +" intB= "+intB );
		// saida: intA= 2 intB= 1
		
		
		//Objetos apontam para a mesma referencia na memoria  , 
		//ou seja os dois objs vão apontar para o mesmo valor
		
		MeuObj objA = new MeuObj(1);
		MeuObj objB = objA;
		// saida: intA= 1 intB= 1
		
		objA.setNum(2);
		System.out.println("objA "+ objA+" objB "+objB);
		// saida: intA= 2 intB= 2
		
	}

}
