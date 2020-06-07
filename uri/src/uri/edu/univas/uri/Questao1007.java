package uri.edu.univas.uri;
import java.util.Scanner;
public class Questao1007 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		int a = leitura.nextInt();
		int b = leitura.nextInt();
		int c = leitura.nextInt();
		int d = leitura.nextInt();
		
		int diferenca = (a * b) - (c * d);
		System.out.println("DIFERENCA = "  + diferenca);
		
	}

}
