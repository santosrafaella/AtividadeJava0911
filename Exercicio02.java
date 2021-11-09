package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
	double n1, n2, n3;
	
	System.out.println("Digite o 1º número: ");
	n1 = entrada.nextDouble();
	System.out.println("\nDigite o 2º número: ");
	n2 = entrada.nextDouble();
	System.out.println("\nDigite o 3º número: ");
	n3 = entrada.nextDouble();
	
	if(n1 <= n2 && n2 <= n3) {
		System.out.println("A ordem crescente é: " + n1 + ", " + n2 + ", " + n3 + ".");
	}
	else if(n1 <= n3 && n3 <= n2) {
		System.out.println("A ordem crescente é: " + n1 + ", " + n3 + ", " + n2 + "." ); 
	}
	else if(n2 <= n1 && n1 <= n3) {
		System.out.println("A ordem crescente é: " + n2 + ", " + n1 + ", " + n3 + "." );
	}
	else if(n2 <= n3 && n3 <= n1) {
		System.out.println("A ordem crescente é: " + n2 + ", " + n3 + ", " + n1 + "." );
	}
	else if(n3 <= n1 && n1 <= n2) {
		System.out.println("A ordem crescente é: " + n3 + ", " + n1 + ", " + n2 + "." );
	}
	else if(n3 <= n2 && n2 <= n1) {
		System.out.println("A ordem crescente é: " + n3 + ", " + n2 + ", " + n1 + "." );
	}
	entrada.close();
	}

}
