package br.edu.univas.main;
import java.util.Scanner;
public class Questao16 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Por favor, digite a quantidade de aluno que tem na classe: ");
		int totalDeAlunos = leitura.nextInt();
		
		int somaDasNotas = 0;
		
		
		for (int i = 0; i < totalDeAlunos; i++) {
			System.out.println("Digite a sua nota: ");
			
			float nota = leitura.nextFloat();
			somaDasNotas += nota;
			
		}	
		
		float media = somaDasNotas / totalDeAlunos;
		System.out.println("A média dos alunos são: "+ media + ".");
			
		
	}

}
