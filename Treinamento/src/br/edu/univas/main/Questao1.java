package br.edu.univas.main;

import java.util.Scanner;

public class Questao1 {
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Quanto é seu salário?");
		float salario = leitura.nextFloat();
		
		
		if (salario <= 1903.98f) {
			System.out.println("Você está isento de IR");
		
		}else if ( salario <= 2826.66f ) {
			     System.out.println("A sua alíquota de IR é 7,5%");
		
		}else if (salario <= 3751.05f ) {
			System.out.println("A sua alíquota é de 15%");
								
		}else if(salario <= 4664.68f) {
			System.out.println("A sua alíquota é de 22,5%");
			
		}else if(salario > 4664.68f) {
			System.out.println("Sua alíquota é de 27,5%");
		
			
		   }
			
		}
	}


