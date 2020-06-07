package br.edu.univas.main;
import java.util.Scanner;
public class Questao15 {
	public static void main(String[] Args) {
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Vamos calcular o seu IMC?");
		System.out.println("Para calcular o IMC serão necessário seu peso e altura. Vamos Começar?");
		System.out.println("Por favor, digite seu peso: ");
		float peso = leitura.nextFloat();
		
		System.out.println("Agora, coloque a sua altura: ");
		float altura = leitura.nextFloat();
		
		float imc = peso / (altura * altura); 
		
		if (imc < 18.5) {
			System.out.println("Abaixo do peso.");
			
		}else if (imc > 18.5 && imc < 24.9) {
			System.out.println("Peso normal.");
			
		}else if (imc > 25 && imc <= 29.9) {
			System.out.println("Sobrepeso");
			
		}else if (imc > 30 && imc < 34.9) {
			System.out.println("Obesidade grau 1.");
			
		}else if (imc > 35 && imc < 39.9 ) {
			System.out.println("Obesidade grau 2.");
			
		}else {
			System.out.println("Obesidade grau 3.");
			
		}
		
	}

}
