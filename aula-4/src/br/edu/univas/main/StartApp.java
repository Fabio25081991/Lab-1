package br.edu.univas.main;

public class StartApp {

	public static void main(String[] args) {
		
		int idade = 67;
		
		if (idade > 65) {
			System.out.println(
					"Voc� pode votar mas n�o � obrigado!");
			
		} else if (idade >= 18) {
			System.out.println("Voc� � obrigado a votar!");
		
		} else if (idade >= 16) {
			System.out.println(
					"Voc� pode votar mas n�o � obrigado!");
		
		} else {
		//} else if (idade < 16) {
			System.out.println("Voc� n�o pode votar!");
		}
		
		
		int saldo = 300;
		int valorMochila = 199;
		
		if (saldo >= valorMochila) {
			System.out.println("Voc� pode comprar a mochila!");
		} else {
			System.out.println("Voc� n�o pode comprar a mochila!");
		}
		
		
		int valorSaque = 105;
		
		if (valorSaque <= saldo) {
			System.out.println("Voc� pode sacar");
		} else {
			System.out.println("Saldo insuficiente");
		}
		
		idade = 50;
		if (idade == 65) {
			System.out.println("Voc� pode se aposentar!");
		}
		
		if (idade != 65) {
			System.out.println("Voc� ainda precisa trabalhar!");
		}
		
		saldo = 12;
		float valorSalgado = 2.5f;
		float valorSuco = 2;
		float valorTotal = valorSalgado + valorSuco;
		float valorOnibus = 3.9f;
		
		if (saldo >= valorTotal && saldo >= valorOnibus) {
			System.out.println("Voc� pode comprar o lanche");
		}
		
		if (saldo >= valorSalgado || saldo >= valorSuco) {
			System.out.println(
					"Voc� pode comprar ao menos 1 lanche");
		}
		
	}
	
}
