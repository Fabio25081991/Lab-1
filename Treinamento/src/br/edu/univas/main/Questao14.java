package br.edu.univas.main;
import java.util.Scanner;
public class Questao14 {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Por favor, digite o seu nome: ");
		String nome = leitura.nextLine();
		
		System.out.println("Agora, a quantidade de horas trabalhadas por dia: ");
		float horas = leitura.nextFloat();
		
		double valorHora = 4.70;
		
		double salario = (horas * valorHora);
		
		System.out.println("O funcionário " + nome + " irá receber R$" + salario + " de salário.");
		
	}
}
