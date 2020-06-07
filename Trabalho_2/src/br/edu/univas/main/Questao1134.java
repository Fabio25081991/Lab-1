package br.edu.univas.main;
import java.util.Scanner;
public class Questao1134 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		int alcool = 1;
		int gasolina = 2;
		int disel = 3;
		
		int numero = leitura.nextInt();
		
		while (true) {
			
			if(numero == 4) {
				break;
			}else if(numero == 1) {
				alcool++;
			}else if(numero == 2) {
				gasolina++;
			}else {
				disel++;
			}
			
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: "+alcool);
		System.out.println("Gasolina: "+gasolina);
		System.out.println("Diseil: "+disel);
	}
	
	
	

}
