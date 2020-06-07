package br.edu.univas.main;
import java.util.Scanner;
public class Questao12 {
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Por favor, digite o nome do aluno(a): ");
		String aluno = leitura.nextLine();
		
		System.out.println("Digite a nota da prova 1: ");
		float nota1 = leitura.nextFloat();
		
		System.out.println("Agora, a nota da prova 2: ");
		float nota2 = leitura.nextFloat();
		
		System.out.println("Digite o valor da prova 3: ");
		float nota3 = leitura.nextFloat();
		
		System.out.println("E por último, a nota da 4° prova: ");
		float nota4 = leitura.nextFloat();
		
		float resultado = ((nota1 + nota2 + nota3 + nota4) / 4);
		
		if (resultado > 59) {
			System.out.println("A nota do aluno " + aluno + " foi "+ resultado + " ,portanto está aprovado!");
			
		}else if(resultado >= 40 && resultado <= 59) {
			System.out.println("A nota do aluno " + aluno + " foi " + resultado + " portanto está de recuperação.");
			
		}else {
			System.out.println("O aluno " + aluno + " está reprovado!");
		}
		
	}
}
