package br.edu.univas.main;
import java.util.Scanner;
public class Questão7 {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");	
		int a = leitura.nextInt();
		
		System.out.println("Digite um numero: ");
		int b = leitura.nextInt();
		
		System.out.println("Digite um numero: ");
		int c = leitura.nextInt();
		
		System.out.println("Digite um numero: ");
		int d = leitura.nextInt();
		
		System.out.println("Digite um numero: ");
		int e = leitura.nextInt();
		
		int soma = 0;
		
		if (a % 2 == 0) {
			soma += a;
		}
		
		if (b % 2 == 0) {
			soma += b;
		}
		
		if (c % 2 == 0) {
			soma += c;
		}
		
		if (d % 2 == 0) {
			soma += d;
		}
		
		if (e % 2 == 0) {
			soma += e;
		}
		
		System.out.println("A soma dos números pares é: " + soma);
	}
	
}