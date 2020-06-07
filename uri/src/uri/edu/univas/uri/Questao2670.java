package uri.edu.univas.uri;
import java.util.Scanner;
public class Questao2670 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		    int A1 = leitura.nextInt();
	        int A2 = leitura.nextInt();
	        int A3 = leitura.nextInt();
	        int minutos = 0;
	        
	        if ((A2 >= A3 && A2 >= A1))
	        	System.out.println(minutos);
	        else if (A3 >= A1 && (A1 + A2) <= A3)
	        	System.out.println(minutos * 2);
	        else if (A1 >= A3 && (A3 + A2) <= A1)
	        	System.out.println(minutos * 3);
	        else 
	        	minutos = (A3 + A1) * 2;
	        System.out.println(minutos);
	        
	  }
}


