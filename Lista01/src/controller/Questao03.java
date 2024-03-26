package controller;

import util.Teclado;

public class Questao03 {

	// 3) Fazer um programa que pergunte um valor em Dólares e apresente o
	// equivalente em Reais. Considere U$1,00 = R$3,80.

	public static void main(String[] args) {
		
double dolar, real;
		
		//Entrada de Dados
		
		dolar = Teclado.lerDouble("Informe um valor em Dólar:");
				
		// Processamento
		real = dolar * 3.80;
		
		//Saida de dados
		System.out.println("R$ " + real);


	}

}
