package controller;

import util.Teclado;

public class Questao01 {

	// 1) Desenvolver um programa que pergunte ao usuário o seu nome completo e seu
	// sexo. Em seguida, o programa deve apresentar os dados anteriormente
	// informados.

	public static void main(String[] args) {
		
String nome, sexo;
		
		//Entrada dde dados
		nome = Teclado.lerTexto("Infotme seu nome completo:");
		sexo = Teclado.lerTexto("Informe seu sexo");
		
		//Saída de dados
		
		System.out.println("Seu nome é " + nome + " E o sexo informado é: " + sexo);
		
	}

}

