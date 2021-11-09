package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double n, par, impar;
		
		System.out.println("Digite um número: ");
		n = entrada.nextDouble();
		
		impar = n * n;
		par = Math.sqrt(n);
		
		
		if(n % 2.0 == 0.0) {
		     System.out.println("O número é par! A raíz quadrada dele é: " + par);
		     
		}
		else{
			System.out.println("O número é ímpar! A potência dele é: " + impar);
			
		}
		
		entrada.close();
	}
}
