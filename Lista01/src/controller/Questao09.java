package controller;

import util.Teclado;

public class Questao09 {

	public static void main(String[] args) {
		
		double num, quadrado, raiz;
		
		num = Teclado.lerDouble("Por Favor, informe um número");
		
		quadrado = Math.pow(num, 2);
		raiz = Math.sqrt(num);
		
		System.out.println("a - O número inserido foi " + num);
		System.out.println("b - O quadrado de " + num + " é " + quadrado);
		System.out.println("c - A raiz quadrada de " + num + " é " + raiz);
	}

}
