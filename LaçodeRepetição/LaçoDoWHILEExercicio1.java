package La�odeRepeti��o;

import java.util.Scanner;

public class La�oDoWHILEExercicio1 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int x, somaValores = 0;

		do {
			System.out.println("Escreve um n�mero ai parceiro: ");
			x = ler.nextInt();
			somaValores = somaValores + x;

		} while (x != 0);
		System.out.println("Fim do programa\n" + somaValores + " � o valor da soma dos n�meros digitados");
	}
}
