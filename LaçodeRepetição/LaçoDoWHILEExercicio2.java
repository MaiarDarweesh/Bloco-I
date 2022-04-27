package LaçodeRepetição;

import java.util.Scanner;

public class LaçoDoWHILEExercicio2 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int x, soma = 0, media = 0, cont = 0;

		do {
			System.out.println("Escreve um número ai parceiro: ");
			x = ler.nextInt();
			if (x % 3 == 0) {
				soma = soma + x;
				cont++;
			}

		} while (x != 0);
		media = soma / cont++;
		System.out.println("A média é: " + media);
	}
}
