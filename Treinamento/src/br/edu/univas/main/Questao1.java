package br.edu.univas.main;

import java.util.Scanner;

public class Questao1 {
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Quanto � seu sal�rio?");
		float salario = leitura.nextFloat();
		
		
		if (salario <= 1903.98f) {
			System.out.println("Voc� est� isento de IR");
		
		}else if ( salario <= 2826.66f ) {
			     System.out.println("A sua al�quota de IR � 7,5%");
		
		}else if (salario <= 3751.05f ) {
			System.out.println("A sua al�quota � de 15%");
								
		}else if(salario <= 4664.68f) {
			System.out.println("A sua al�quota � de 22,5%");
			
		}else if(salario > 4664.68f) {
			System.out.println("Sua al�quota � de 27,5%");
		
			
		   }
			
		}
	}


