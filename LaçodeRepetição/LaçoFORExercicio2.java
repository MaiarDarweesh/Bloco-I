package La�odeRepeti��o;

import java.util.Scanner;

public class La�oFORExercicio2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int contPar = 0, contImpar = 0, y;

		for (int x = 1; x <= 10; x++) {
			System.out.println("Digite o " + x + " n�mero:");
			y = ler.nextInt();

			if (y % 2 != 0) {
				contImpar++;
			} else {
				contPar++;
			}
		}
		System.out.println("Voc� digitou " + contPar + " n�meros pares e " + contImpar + " n�meros impares.");

	}
}
