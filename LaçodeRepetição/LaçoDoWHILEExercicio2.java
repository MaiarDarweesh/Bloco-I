package La�odeRepeti��o;

import java.util.Scanner;

public class La�oDoWHILEExercicio2 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int x, soma = 0, media = 0, cont = 0;

		do {
			System.out.println("Escreve um n�mero ai parceiro: ");
			x = ler.nextInt();
			if (x % 3 == 0) {
				soma = soma + x;
				cont++;
			}

		} while (x != 0);
		media = soma / cont++;
		System.out.println("A m�dia �: " + media);
	}
}
