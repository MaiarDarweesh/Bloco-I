package LaçodeRepetição;

import java.util.Scanner;

public class LaçoDoWHILEExercicio1 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int x, somaValores = 0;

		do {
			System.out.println("Escreve um número ai parceiro: ");
			x = ler.nextInt();
			somaValores = somaValores + x;

		} while (x != 0);
		System.out.println("Fim do programa\n" + somaValores + " é o valor da soma dos números digitados");
	}
}
