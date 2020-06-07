package br.edu.univas.main;
import java.util.Scanner;
public class Questao13 {

	public static void main(String[] args) {
	
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite os valores para cada letra a seguir.");
		System.out.println("Letra A: ");
		int a = leitura.nextInt();
		
		System.out.println("Letra B: ");
		int b = leitura.nextInt();
		
		System.out.println("Letra C: ");
		int c = leitura.nextInt();
		
		System.out.println("Letra D: ");
		int d = leitura.nextInt();
		
		int resultado = ((a * b) - (c * d));
		
		System.out.println(resultado);
	}
	
}
