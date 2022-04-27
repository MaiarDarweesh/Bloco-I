package LaçodeRepetição;

import java.util.Scanner;

public class LaçoFORExercicio2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int contPar = 0, contImpar = 0, y;

		for (int x = 1; x <= 10; x++) {
			System.out.println("Digite o " + x + " número:");
			y = ler.nextInt();

			if (y % 2 != 0) {
				contImpar++;
			} else {
				contPar++;
			}
		}
		System.out.println("Você digitou " + contPar + " números pares e " + contImpar + " números impares.");

	}
}
