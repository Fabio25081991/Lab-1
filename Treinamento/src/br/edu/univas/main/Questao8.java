package br.edu.univas.main;
import java.util.Scanner;
public class Questao8 {
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite um valor para A: ");
		int a = leitura.nextInt();
		
		System.out.println("Agora, digite um valor para B: ");
		int b = leitura.nextInt();
		
		int c = a;
		a = b;
		b = c;
		
		System.out.println("A = " + a);
		System.out.println("B = " + b);
	}

}
