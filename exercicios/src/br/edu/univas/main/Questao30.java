package br.edu.univas.main;
import java.util.Scanner;
public class Questao30 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
			 
		    int[] a = new int[10];
		    int[] b = new int[10];
		    int[] c = new int[10];
		
		    System.out.println("Dados 1° array: ");
			for(int i = 0; i < 10; i++) {
				System.out.println("Digite um numero: ");
				int x = leitura.nextInt();
				
				a[i] = leitura.nextInt();
			}
			
			System.out.println("Dados do 2° array: ");
			for(int i = 0; i < 10; i++) {
				System.out.println("Digite um numero: ");
				b[i] = leitura.nextInt();
			}
			
			System.out.println("Resultado de A X B:");
			for (int i = 0; i < 10; i++) {
				c[i] = a [i] * b[i];
				System.out.println(c[i]);
			}
			
			leitura.close();
	}

}
