package PacoteJava;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		int a, b, c;

		Scanner ler = new Scanner(System.in);

		System.out.println("Entre com um n�mero ai parceiro: ");
		a = ler.nextInt();

		System.out.println("Entre com um outro n�mero ai parceiro: ");
		b = ler.nextInt();

		System.out.println("Entre com um outro n�mero ai parceiro: ");
		c = ler.nextInt();

		if (a > b && a > c && b > c) {
			System.out.println("Os maiores n�meros em ordem crescente �: " + a + " " + b + " " + c);
		} else if (a > b && a > c && c > b) {
			System.out.println("Os maiores n�meros em ordem crescente �: " + a + " " + c + " " + b);
		} else if (b > a && b > c && a > c) {
			System.out.println("Os maiores n�meros em ordem crescente �: " + b + " " + a + " " + c);
		} else if (b > a && b > c && c > a) {
			System.out.println("Os maiores n�meros em ordem crescente �: " + b + " " + c + " " + a);
		} else if (c > a && c > a && a > b) {
			System.out.println("Os maiores n�meros em ordem crescente �: " + c + " " + a + " " + b);
		} else {
			System.out.println("Os maiores n�meros em ordem crescente �: " + a + " " + b + " " + c);
		}
	}
}
