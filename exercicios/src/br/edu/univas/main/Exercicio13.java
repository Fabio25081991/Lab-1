package br.edu.univas.main;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);

		System.out.println("Por favor digite o 1� n�mero:");
		int primeiro = leitura.nextInt();

		System.out.println("Por favor digite o 2� n�mero:");
		int segundo = leitura.nextInt();

		System.out.println("Por favor digite o 3� n�mero:");
		int terceiro = leitura.nextInt();

		System.out.println("Por favor digite o 4� n�mero:");
		int quarto = leitura.nextInt();

		int total = (primeiro * segundo) - (terceiro * quarto);

		System.out.println("Resultado: " + total);
	}

}
