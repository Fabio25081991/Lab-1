package br.edu.univas.main;

public class StartApp {

	public static void main(String[] args) {
		int idade = 7;
		
		if (idade == 5) {
			System.out.println("Pr�-II");
		} else if (idade == 6) {
			System.out.println("1� Ano");
		} else if (idade == 7) {
			System.out.println("2� Ano");
		} else if (idade == 8) {
			System.out.println("3� Ano");
		} else if (idade == 9) {
			System.out.println("4� Ano");
		} else {
			System.out.println("5� Ano");
		}
		
		//aceitos pelo switch :::
		//byte - short - int - char - String
		
		switch (idade) {
			case 5:
				System.out.println("Pr�-II");
				break;
			case 6:
				System.out.println("1� Ano");
				break;
			case 7:
				System.out.println("2� Ano");
				break;
			case 8:
				System.out.println("3� Ano");
				break;
			case 9:
				System.out.println("4� Ano");
				break;
			default:
				System.out.println("5� Ano");
				break;
		}
	}
	
}
