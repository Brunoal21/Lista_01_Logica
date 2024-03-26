package controller;

import util.Teclado;

public class Questao06 {

	public static void main(String[] args) {
		
		double f, c; 
		f = Teclado.lerDouble("Informe a temperatura em Graus Fahrenheit:");
		c = (f - 32) * 5 / 9;
		System.out.println("A temperatura convertida em Graus Celsius é " + c);

	}

}
