package br.edu.univas.main;
import java.util.Scanner;
public class Questao19 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		int ContadorMaria = 0;
		int ContadorJoao = 0;
		int ContadorJose = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Por favor, digite o seu voto: ");
			System.out.println ("Maria - (1)");
			System.out.println ("João  - (2)");
			System.out.println ("José  - (3)");
			int voto = leitura.nextInt();
			
			if (voto == 1){
				ContadorMaria ++;
					
			}else if (voto == 2) {
				ContadorJoao ++;
				
			}else {
				ContadorJose++;
			}
			
		}
		
		if(ContadorMaria > ContadorJoao && ContadorMaria > ContadorJose) {
			System.out.println("A representante de sala é Maria.");
			
		}else if (ContadorJoao > ContadorMaria && ContadorJoao > ContadorJose) {
			System.out.println("O representante é João.");
			
		}else {
			System.out.println("O representante é José.");
		
		}
	
	}
	
}
