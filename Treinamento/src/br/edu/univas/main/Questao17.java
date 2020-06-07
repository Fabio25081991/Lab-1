package br.edu.univas.main;
import java.util.Scanner;
public class Questao17 {
			
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Qual o valor da mensalidade a ser paga?");
		float mensalidade = leitura.nextFloat();
		
		System.out.println("Agora, a quantidade de semestres: ");
		int quantidadeSemestre = leitura.nextInt();
		
		System.out.println("Qual a porcentagem por semestre: ");
		float porcentagemAumento = leitura.nextFloat();
		
		for (int i = 0; i < quantidadeSemestre - 1; i++) {
			float valorDeAumento = mensalidade * porcentagemAumento / 100;
			mensalidade += valorDeAumento;
			
		}
		
		System.out.println("O valor da mensalidade no ultimo semstre será de: " + mensalidade + ".");
	}
}
	