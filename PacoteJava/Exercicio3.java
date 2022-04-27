package PacoteJava;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int a;

		System.out.println("Digite sua idade ai parceiro: ");
		a = ler.nextInt();

		if (a >= 10 && a <= 14) {
			System.out.println("Você faz parte da categoria infantil");
		} else if (a >= 15 && a <= 17) {
			System.out.println("Você faz parte da categoria juvenil");
		} else if (a >= 18 && a <= 25) {
			System.out.println("Você faz parte da categoria adulto");
		} else {
			System.out.println("Valor inválido");
		}

	}

}
