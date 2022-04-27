package PacoteJava;

import java.util.Scanner;

public class Exemplo3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int idade;
		String nome;
		
		System.out.println("Entre com a sua idade");
		idade = ler.nextInt();
		
		System.out.println("Entre com o seu nome: ");
		//nome = ler.close();
		
		System.out.println("Sua idade é: "+ idade);
		//System.out.println("Seu nome é: "+ nome);
		
		if(idade>=18)
		{
			System.out.println("Você é maior de idade");
		}
		else 
		{
			System.out.println("Você é menor de idade");
		}
	}
}
