package br.edu.univas.main;

import java.util.Scanner;

public class Questao2 {
	
	public static void main(String[]args ) {
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Por favor, digite um numero de 0 a 10 e lhe diremos por extenso qual foi o número digitado.");
			int numero =  leitura.nextInt(); 
		
		if(numero == 0) {
			System.out.println("O numero digitado foi o zero.");
			
		}else if(numero == 1) {
			System.out.println("O numero digitado foi o um.");
			
		}else if(numero == 2) {
			System.out.println("O numero digitado foi o dois.");
			
		}else if(numero == 3) {
			System.out.println("O numero digitado foi o trêsc");
			
		}else if(numero == 4) {
			System.out.println("O numero digitado foi o quatro");
			
		}else if(numero == 5) {
			System.out.println("O numero digitado foi o cinco.");
			
		}else if(numero == 6) {
			System.out.println("O numero digitado foi o seis.");
			
		}else if(numero == 7) {
			System.out.println("O numero digitado foi o sete.");
			
		}else if(numero == 8) {
			System.out.println("O numero digitado foi o oito.");
			
		}else if(numero == 9) {
			System.out.println("O numero digitado foi o nove.");
			
		}else if(numero == 10) {
			System.out.println("O numero digitado foi o dez.");
		}
	}
}


