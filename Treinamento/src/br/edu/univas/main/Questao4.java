package br.edu.univas.main;

import java.util.Scanner;

public class Questao4 {
	
	public static void main(String[] args) {
		
		
			Scanner leitura = new Scanner(System.in);
			
			System.out.println("Digite um numero: ");
			float numero1 = leitura.nextFloat();
			
			System.out.println("Digite um segundo numero: ");
			float numero2 = leitura.nextFloat();
			
			float x = numero1 % numero2;
			
			if(x == 0) {
				System.out.println("Essa divisão é perfeita!");
				
			} else if (x != 0f) {
				System.out.println("A sobra do primeiro número pelo segundo é :"+ x);
	
		}	
		
	}

}