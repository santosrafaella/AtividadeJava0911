package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercício01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int n1, n2, n3, maior = 0;
		
		System.out.println("Digite o 1º número: ");
		n1 = entrada.nextInt();
		System.out.println("\nDigite o 2º número: ");
		n2 = entrada.nextInt();
		System.out.println("\nDigite o 3º número: ");
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
		
		System.out.println("O maior número é: " + maior);
		
		entrada.close();
	}

}
