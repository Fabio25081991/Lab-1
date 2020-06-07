package uri.edu.univas.uri;
import java.util.Scanner;
public class Questao2235 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		int a,b,c;
		a = leitura.nextInt();
		b = leitura.nextInt();
		c = leitura.nextInt();
		
		if(a==b || a==c || b==a || b==c )
			System.out.println("S");
		else if(a+b==c || a+c==b || b+c==a )
			System.out.println("S");
		else
			System.out.println("N");
			
		leitura.close();
	}
}
