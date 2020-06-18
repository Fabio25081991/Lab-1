package br.edu.univas.main;

public class Arrays {
	public static void main(String[] args) {
		
		int [] A = new int [5];
		int [] B = new int [5];
		
		A [0] = 1;
		A [1] = 2;
		A [2] = 3;
		A [3] = 4;
		A [4] = 5;
		
		B [0] = A [2];
		
		System.out.println("O valor de A é: " + A[2]);
		System.out.println("O valor de B é: " + B[0]);
		
		
	}

}
