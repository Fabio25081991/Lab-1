package br.edu.univas.main;
import java.util.Scanner;
public class Questao_1933 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		int A = leitura.nextInt();
		int B = leitura.nextInt();
		
		if (A > B) {
			System.out.println(A);
		}else {
			System.out.println(B);
		}
	}
	

}
