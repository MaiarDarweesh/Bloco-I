package LaçodeRepetição;

import java.util.Scanner;

public class LaçoWHILExercicio1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int idade = 0, cont21 = 0, cont50 = 0;
		// System.out.println("Digite a sua idade ai ");
		// idade = ler.nextInt();

		while (idade != -99) {
			System.out.println("Digite a sua idade ai ");
			idade = ler.nextInt();

			if (idade <= 21) {
				cont21++;
			} else if (idade >= 50) {
				cont50++;
			}
		}
		System.out.println("O valor de seres humanos menores que 21 anos é: " + cont21);
		System.out.println("O valor de seres humanos maiores que 50 anos é: " + cont50);
	}

}
