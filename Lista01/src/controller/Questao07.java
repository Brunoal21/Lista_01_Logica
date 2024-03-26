package controller;

import util.Teclado;

public class Questao07 {

	public static void main(String[] args) {
		
	double n1, n2, n3, media;
	
	n1 = Teclado.lerDouble("Digite o primeiro Numero:");
	n2 = Teclado.lerDouble("Digite o sugundo Numero:");
	n3 = Teclado.lerDouble("Digite o terceiro Numero:");
	
	media = (n1 + n2 + n3) / 3;
	
	System.out.println("A média dos 3 valores inseridos é de " + media);
	}

}
