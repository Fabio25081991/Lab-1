package br.edu.univas.main;
import java.util.Scanner;
public class Questao21 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		int par = 0;
		int impar = 0;
		
			for(int i = 0; i < 10; i++) {
				System.out.println("Digite um numero: ");
				int numero = leitura.nextInt();
				
				if(numero % 2 == 0) {
					par++;
				}else {
					impar++;
				
				}
			
			}
		
		
		System.out.println("A quantidade de numeros pares digitados são: " + par);
		System.out.println("A quantidade de numero impares digitados são: " + impar);
	
	}

}
