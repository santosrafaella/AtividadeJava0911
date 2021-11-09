package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite sua idade: ");
		idade = entrada.nextInt();
		
				
		if(idade >= 10 && idade <= 14) {
		    System.out.println("\nVocê está na categoria infantil!");
		}
		else if(idade == 15 && idade <= 17) {
			System.out.println("\nVocê está na categoria juvenil!");
		}
		else if(idade == 18 && idade <= 25) {
			System.out.println("\nVocê está na categoria adulto!");
		}
		entrada.close();
	}

}
