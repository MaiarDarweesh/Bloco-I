package PacoteJava;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {

		int a, b, c;

		Scanner ler = new Scanner(System.in);

		System.out.println("Entre com um numero: ");
		a = ler.nextInt();

		System.out.println("Entre com um outro numero: ");
		b = ler.nextInt();

		System.out.println("Entre com um numero: ");
		c = ler.nextInt();

		if (a > b && a > c) {
			System.out.println("O numero " + a + " � o maior dentre os escritos");
		} else if (b > a && b > c) {
			System.out.println("O n�mero " + b + " � o maior dentre os escritos");
		} else {
			System.out.println("O n�mero" + c + " � o maior dentre os escritos");
		}

	}

}
