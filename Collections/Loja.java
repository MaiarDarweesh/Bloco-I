package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Loja {

	public static void main(String[] args) {

		String teste1 = "Camiseta";
		String teste2 = "Camisola";
		String teste3 = "Calça";
		String adicionar;
		int selecao, opcao;
		char resposta = ' ';

		Scanner ler = new Scanner(System.in);

		ArrayList<String> estoque = new ArrayList<>();

		estoque.add(teste1);
		estoque.add(teste2);
		estoque.add(teste3);

		do {
			System.out.println("Os produtos disponiveis em estoque são: \r\n\n" + estoque);
			System.out.println("\nGostaria de remover ou adicionar um item?\n");
			System.out.println("Digite 1 para remover e 2 para adicionar");
			opcao = ler.nextInt();

			switch (opcao) {

			case 1: {

				System.out.println("Qual item Gostaria de remover?\n");
				System.out.println(estoque.get(0) + "\n" + estoque.get(1) + "\n" + estoque.get(2));
			}
				selecao = ler.nextInt();
				if (selecao == 1)
					estoque.remove(0);
				else if (selecao == 2)
					estoque.remove(1);
				else
					estoque.remove(2); {
				System.out.println(estoque);
				System.out.println("Estoque atualizado");
			}
			// break;

			case 2:

				System.out.println("Digite o nome do item: ");

				adicionar = ler.next();
				estoque.add(adicionar);

				System.out.println("\nItem adicionado ao estoque!");
				System.out.println(estoque);

				System.out.println("\nDeseja sair?\nDigite 's' para sair ou digite outra para retornar ao inicio.");
			}
			resposta = ler.next().charAt(0);
		} while (resposta != 's');
		System.out.println("Fim do programa");
	}
}