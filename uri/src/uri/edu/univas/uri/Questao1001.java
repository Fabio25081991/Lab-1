package uri.edu.univas.uri;
import java.util.Scanner;
public class Questao1001 {
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		int a = leitura.nextInt();
		int b = leitura.nextInt();
		
		int x = a + b;
		
		System.out.println("Resuldo X = " + x);
		
		leitura.close();
	}
	
}
