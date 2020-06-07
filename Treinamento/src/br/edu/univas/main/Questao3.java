package br.edu.univas.main;

import java.util.Scanner;

public class Questao3 {
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Por favor, digite a sua idade para sabermos a que categoria de natação você se encaixa:");
			int idade = leitura.nextInt();
		
		if (idade <= 7) {
			System.out.println("Você se enquadra na categoria infatil A.");
			
		}else if (idade > 7 && idade <= 10) {
			System.out.println("Você se enquadra na categoria infatil B.");
			
	 	}else if(idade > 10 && idade <= 13) {
	 		System.out.println("Você se enquadra na categoria juvenil A.");
	 		
	 	}else if(idade > 13 && idade <= 17) {
	 		System.out.println("Você se enquadra na categoria juvenil B.");
	 		
	 	}else if(idade > 17 && idade <= 60) {
	 		System.out.println("Você se enquadra na categoria adulto.");
	 	}
			
	}
		
}


