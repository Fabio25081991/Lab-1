package br.edu.univas.main;
import java.util.Scanner;
public class Questao22 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		int vitoriasBrasil = 0;
		int vitoriasArgentina = 0;
		int empates = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Gols do Brasil: ");
			int golsBrasil = leitura.nextInt();
			
			System.out.println("Gols da Argentina: ");
			int golsArgentina = leitura.nextInt();	
			
			if(golsBrasil > golsArgentina) {
				vitoriasBrasil++;
			}else if (golsArgentina > golsBrasil){
				vitoriasArgentina++;
			}else {
				empates++;
			}
			
		}
		
		System.out.println("Quantidade de vitórias do Brasil é: "+ vitoriasBrasil);
		System.out.println("Quantidade de vitorias da Argentina é: " + vitoriasArgentina);
		System.out.println("O número de empates entre Brasil e Argentina foram: " + empates);
		
	}

}
