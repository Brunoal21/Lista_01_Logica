package controller;

import util.Teclado;

public class Questao02 {
	
	//2) Elaborar um programa que pergunte quatro valores inteiros e apresente 2 resultados: 
	//a) Resultado de suas adições 
	//b) Resultado de suas multiplicações 


	public static void main(String[] args) {
		
int num1, num2, num3, num4, soma, mult;
		
		//Entrada de Dados
		num1 = Teclado.lerInt("Informe o primeiro numero");
		num2 = Teclado.lerInt("Informe o segundo numero");
		num3 = Teclado.lerInt("Informe o terceiro numero");
		num4 = Teclado.lerInt("Informe o quarto numero");
		
		//Processamento
		soma = num1 + num2 + num3 + num4;
		mult = num1 * num2 * num3 * num4;
		
		// Saida de Dados
		
		System.out.println("A somo dos quatro numers inseridos é: " + soma);
		System.out.println("A Multiplicação dos numeros é " + mult);

		
	}

}
