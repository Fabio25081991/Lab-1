package br.edu.univas.main;
import java.util.Scanner;
public class Questão6 {

	public static void main(String[] args) {
		
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Favor, informe o preço do etanol e da gasolina para sabermos qual deles compensa mais abastecer");
		System.out.println("Infome o preço do etanol primeiro: ");
		float etanol = leitura.nextFloat();
		
		System.out.println("Agora, o preço da gasolina");
		float gasolina = leitura.nextFloat();
		
		if(etanol / gasolina * 100 > 70) {
			System.out.println("Abasteça com gasolina.");
			
		}else if(etanol / gasolina * 100 < 70) {
			System.out.println("Abasteça com etanól.");
			
		}
		
	}
	
}
