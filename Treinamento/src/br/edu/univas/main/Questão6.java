package br.edu.univas.main;
import java.util.Scanner;
public class Quest�o6 {

	public static void main(String[] args) {
		
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Favor, informe o pre�o do etanol e da gasolina para sabermos qual deles compensa mais abastecer");
		System.out.println("Infome o pre�o do etanol primeiro: ");
		float etanol = leitura.nextFloat();
		
		System.out.println("Agora, o pre�o da gasolina");
		float gasolina = leitura.nextFloat();
		
		if(etanol / gasolina * 100 > 70) {
			System.out.println("Abaste�a com gasolina.");
			
		}else if(etanol / gasolina * 100 < 70) {
			System.out.println("Abaste�a com etan�l.");
			
		}
		
	}
	
}
