package br.edu.univas.main;
import java.util.Scanner;
public class Questao9 {
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite O valor do celular desejado: ");
		float valor = leitura.nextFloat();
		
		if (valor > 100 && valor < 1000) {
			System.out.println("Os celulares disponíveis nesse valor são: ");
			System.out.println("Celular 1. ");
			System.out.println("Celular 2. ");
			System.out.println("Celular 3. ");
			System.out.println("Celular 4. ");
			System.out.println("Celular 5. ");
			System.out.println("Celular 6. ");
			
			if(valor > 100 && valor <= 250) {
				System.out.println(" é o celular1.");
				
			}
			
			if(valor > 250 && valor <= 350) {
				System.out.println(" é o celular 1 e");
				System.out.println(" celular 2");
			}
			
			if(valor > 350 && valor <=500) {
				System.out.println(" é o celular3.");
			}
			
			if(valor > 500 && valor <= 650) {
				System.out.println(" é o celular 4.");
			}
			
			if(valor > 650 && valor <= 750) {
				System.out.println("é o celular 5.");
			}
			
			if(valor > 750 && valor <=1000) {
				System.out.println("é o celular 6.");
			}
			
		}else if(valor > 1000 && valor <=1999) {
			System.out.println("Os celulares disponiveis nessa faixa são: ");
			
			if(valor > 1001 && valor <= 1250) {
				System.out.println("é o celular 1 das lista 2.");
			}
			
			if(valor > 1250 && valor <= 1350) {
				System.out.println("é o celular 2.");
			}
			
			if(valor > 1350 && valor <= 1500) {
				System.out.println("é o celular 3.");
			}
			
			if(valor > 1500 && valor <= 1650) {
				System.out.println("é o celular 4.");
			}
			
			if(valor > 1500 && valor <= 1750) {
				System.out.println("é o celular 5.");
			}
			
			if(valor > 1750 && valor <= 2000) {
				System.out.println("é o celular 6.");
			}
		}else if (valor > 2000f) {
			System.out.println("Os celulares disponiveis são:");
			
		}
	}
}
