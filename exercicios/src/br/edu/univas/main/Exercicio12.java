package br.edu.univas.main;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Por favor digite seu nome:");
		String aluno = leitura.nextLine();
		
		System.out.println("Por favor digite a 1� nota:");
		float nota1Bimestre = leitura.nextFloat();
		
		System.out.println("Por favor digite a 2� nota:");
		float nota2Bimestre = leitura.nextFloat();
		
		System.out.println("Por favor digite a 3� nota:");
		float nota3Bimestre = leitura.nextFloat();
		
		System.out.println("Por favor digite a 4� nota:");
		float nota4Bimestre = leitura.nextFloat();
		
		float total = nota1Bimestre + nota2Bimestre + nota3Bimestre + nota4Bimestre;
		
		if (total > 59) {
			System.out.println("Aprovado");
		} else if (total >= 40 && total <= 59) {
			System.out.println("Recupera��o");
		} else {
			System.out.println("Rerovado");
		}
	}
	
}
