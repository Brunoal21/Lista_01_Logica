package controller;

import util.Teclado;

public class Questao05 {

	public static void main(String[] args) {
		
		double salario, salFinal;
		
		//Entrada de dados
		
		salario = Teclado.lerDouble("Por Favor, informe o seu salário");
		
		//Processamento
		salFinal = salario + (salario * 15 / 100);
		
		//Saida de dados
		
		System.out.println("O salário com reajuste de 15% é R$ " + salFinal);
	}

}
