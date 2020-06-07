package br.edu.univas.main;
import java.util.Scanner;
public class Questao5 {
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite um numero entre 1 e 7 e lhe diremos o dia da semana: ");
		float numero = leitura.nextInt();
		
		if(numero <= 0) {
			System.out.println("Número inválido. Digite um número entre 1 e 7.");
			
		}else if(numero > 7) {
			System.out.println("Número inválido. Digite um número entre 1 e 7.");
			
		}else if(numero ==1) {
			System.out.println("Domingo.");
			
		}else if(numero ==2) {
			System.out.println("Segunda-feira.");
				
		}else if(numero ==3) {
			System.out.println("Terça-feira.");
			
		}else if(numero ==4) {
			System.out.println("Quarta-feira.");
			
		}else if(numero ==5) {
			System.out.println("Quinta-feira.");
			
		}else if(numero ==6) {
			System.out.println("Sexta-feira.");
			
		}else if(numero ==7) {
			System.out.println("Sábado.");
			
		}
			
	}
		

}
