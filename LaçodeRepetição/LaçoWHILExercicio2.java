package LaçodeRepetição;

import java.util.Scanner;

public class LaçoWHILExercicio2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade, valormáximo = 0, contCalmas = 0, contNFeminino = 0, contIdosos = 0, contAMasculino = 0,
				contInfCalma = 0, contOutrosCalmos = 0;
		char sexo, opcao;
		while (valormáximo < 150) {
			System.out.println("Me conta sua idade aqui: ");
			idade = ler.nextInt();

			System.out.println("Qual seu sexo? \nMasculino \nFeminino \nOutros");
			// F para feminino, M para masculino, O para outros.
			sexo = ler.next().charAt(0);

			System.out.println(
					"Qual das categorias voçê se encaixa? \n1 para se a pessoa é Calma. \n2 para se a pessoa é nervosa. \n3 para se a pessoa é agressiva");
			// C para calma, N para nervosa, A para agressivo.
			opcao = ler.next().charAt(0);

			if (opcao == 'C') {
				contCalmas++;
			}
			;
			if (sexo == 'F' && opcao == 'N') {
				contNFeminino++;
			}
			;
			if (idade > 40 && opcao == 'N') {
				contIdosos++;
			}
			;
			if (sexo == 'M' && opcao == 'A') {
				contAMasculino++;
			}
			;
			if (opcao == 'C' && idade < 18) {
				contInfCalma++;
			}
			;
			if (opcao == 'C' && sexo == 'O') {
				contOutrosCalmos++;
			}
			;
			System.out.println("\n");
		}
		System.out.printf("\n\nTotal de pessoas consideradas calmas: " + contCalmas);
		System.out.printf("\nTotal de mulheres consideradas nervosas: " + contNFeminino);
		System.out.printf("\nTotal de homens consideradas agressivos: " + contAMasculino);
		System.out.printf("\nTotal de outros consideradas calmos: " + contOutrosCalmos);
		System.out.printf("\nTotal de jovens consideradas calmos: " + contInfCalma);
		System.out.printf("\nTotal de idosos consideradas nervosos: " + contIdosos);
	}
}
