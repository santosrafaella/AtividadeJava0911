package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double n, par, impar;
		
		System.out.println("Digite um n�mero: ");
		n = entrada.nextDouble();
		
		impar = n * n;
		par = Math.sqrt(n);
		
		
		if(n % 2.0 == 0.0) {
		     System.out.println("O n�mero � par! A ra�z quadrada dele �: " + par);
		     
		}
		else{
			System.out.println("O n�mero � �mpar! A pot�ncia dele �: " + impar);
			
		}
		
		entrada.close();
	}
}
