package controller;

import util.Teclado;

public class Questao08 {

	public static void main(String[] args) {
		
		double distancia, consumoMedio, litro;
		
		distancia = Teclado.lerDouble("Informe a distancia a percorrer na viagem em KM:");
		consumoMedio = Teclado.lerDouble("Informe o consumo Médio do seu carro em KM");
		
		litro = distancia / consumoMedio;
		
		System.out.println("Voce precisará de " + litro + " litro de combustível");
	}

}
