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
		
		System.out.println("Sua idade �: "+ idade);
		//System.out.println("Seu nome �: "+ nome);
		
		if(idade>=18)
		{
			System.out.println("Voc� � maior de idade");
		}
		else 
		{
			System.out.println("Voc� � menor de idade");
		}
	}
}
