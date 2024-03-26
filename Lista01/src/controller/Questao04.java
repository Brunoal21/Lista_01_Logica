package controller;

import util.Teclado;

public class Questao04 {

	// 4) Fazer um programa que pergunte um número inteiro e apresente o seu
	// antecessor e seu sucessor.

	public static void main(String[] args) {
		
		int num, ant, suc;
		
		//Entrada de dados
		
		num = Teclado.lerInt("Por Favor, digite um numero");
		
		//processamento
		
		ant = num - 1;
		suc = num + 1;
		
		//Saida de dados
		
		System.out.println("O antecessor é " + ant + " e o sucessor é " + suc);

	}

}
