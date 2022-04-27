package PacoteJava;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double a, raiz, elevado;
		System.out.println("Escolhe um número ai parceiro: ");
		a = ler.nextInt();
		
		if (a%2 == 0)
		{
			System.out.println("Esse número é par parceiro ");
			raiz = Math.sqrt(a);
			System.out.println("A raiz quadrada desse bicho é: " + raiz);
		}
		else if (a%2 != 0)
		{
			System.out.println("Esse número é impar parceiro loko");
			elevado = a * a;
			System.out.println("Esse número ao quadrado é: " + elevado);
		}
	}
}
