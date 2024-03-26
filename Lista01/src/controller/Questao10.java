package controller;

import util.Teclado;

public class Questao10 {

	public static void main(String[] args) {
		
		double prestacao, valor, taxa, tempoDias;
		
		valor = Teclado.lerDouble("Informe o valor da prestação normal");
		taxa = Teclado.lerDouble("Informe a taxa de juros");
		tempoDias = Teclado.lerDouble("Quantos dias de atraso?");
		
		prestacao = valor + ( valor * (taxa / 100) * tempoDias );
		
		System.out.println("O valor da prestação em atraso é R$ " + prestacao);
		

	}

}
