package br.com.generation.exercicios;

import java.util.Scanner;

public class Exerc�cio01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int n1, n2, n3, maior = 0;
		
		System.out.println("Digite o 1� n�mero: ");
		n1 = entrada.nextInt();
		System.out.println("\nDigite o 2� n�mero: ");
		n2 = entrada.nextInt();
		System.out.println("\nDigite o 3� n�mero: ");
		n3 = entrada.nextInt();
		
		if(n1 > maior) {
			maior = n1;
		}
		if(n2 > maior && n1 < n2) {
			maior = n2;
		}
		if(n3 > maior && n2 < n3) {
			maior = n3;
		}
		
		System.out.println("O maior n�mero �: " + maior);
		
		entrada.close();
	}

}
