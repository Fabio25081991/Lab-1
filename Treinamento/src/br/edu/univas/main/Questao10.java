package br.edu.univas.main;
import java.util.Scanner;
public class Questao10 {
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Informe seu g�nero sendo que 0 para mulher e 1 se for homem:");
		int numero = leitura.nextInt();
		
		if(numero == 0) {
			System.out.println("G�nero feminino.");
			
		}else if (numero == 1) {
			System.out.println("G�nero masculino.");
		}
		
		System.out.println("Agora, informe a sua altura:  ");
		float altura = leitura.nextFloat();
		
		float PesoIdealMulher = (62.10f * altura - 44.7f);
		float PesoIdealHomem = (72.7f * altura - 58f);
		
		if(numero == 0) {
			System.out.println("Seu peso ideia �: " + PesoIdealMulher + ".");
		
		}else if(numero == 1) {
			System.out.println("Seu peso ideal �: " + PesoIdealHomem + ".");
		}
		
	}
}
