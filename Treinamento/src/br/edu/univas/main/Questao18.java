package br.edu.univas.main;
import java.util.Scanner;
public class Questao18 {
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		int soma = 0;
		
		System.out.println("Favor, digite a quantiade de numeros que deseja fazer as opera��oes: ");
		int quantidadeNumero = leitura.nextInt();
		
		System.out.println("Voc� escolheu digitar " + quantidadeNumero + " n�meros.");
		System.out.println("Agora, digite o valor desses " + quantidadeNumero + " n�meros. Os valores devem ser entre 23 e 99. ");
		System.out.println("Pode digitar: ");
		
			for (int i = 0; i < quantidadeNumero; i++) {	
				int numero = leitura.nextInt();
			
				if (numero % 2 != 0 && numero >= 23 && numero <= 99) {
				soma += numero;
				
				}
			
				
			}
		
			System.out.println("As somas dos numeros impares s�o: " + soma + ".");
			leitura.close();
	 }
	
}


