package br.edu.univas.main;
import java.util.Scanner;
public class Questao11 {
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite o nome da primeira pessoa: ");
		String pessoa1 = leitura.nextLine();
		
		System.out.println("Agora, digite o ano de nascimento dela: ");
		int idade1 = leitura.nextInt();
		leitura.nextLine(); // É para a leitura do ENTER
		
		System.out.println("Digite o nome da segunda pessoa: ");
		String pessoa2 = leitura.nextLine();
		
		System.out.println("Digite o ano de nascimento da segunda pessoa: ");
		int idade2 = leitura.nextInt();
		leitura.nextLine(); // É para a leitura do ENTER
		
		System.out.println("Agora, o nome da última pessoa: ");
		String pessoa3 = leitura.nextLine();
		
		System.out.println("e seu ano de nascimemto: ");
		int idade3 = leitura.nextInt();
		leitura.nextLine();	// É para a leitura do ENTER
		
		int anoAtual = 2020;
	
		if(idade1 < idade2 && idade1 < idade3) {
			int idade = anoAtual - idade1;
			System.out.println("Nome: " + pessoa1);
			System.out.println("Ano de nascimento: " + idade);
			System.out.println("E sua idade é :" + (anoAtual - idade1));
		
		}else if (idade2 < idade1 && idade2 < idade3) {
			int idade = anoAtual - idade2;
			System.out.println("Nome: " + pessoa2);
			System.out.println("Ano de nascimento: "+ idade2);
			System.out.println("E sua idade é :" + (anoAtual - idade2));
			
		}else {
			int idade = anoAtual - idade3;
			System.out.println("Nome: " + pessoa3);
			System.out.println("Ano de nascimento: " + idade3);
			System.out.println("E sua idade é :" + (anoAtual - idade3));
		}
			
			
		
	}

}
