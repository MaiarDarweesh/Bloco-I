package POO;

public class ContaBancaria2 {
	public static void main(String[] args) {

		ContaBancaria teste = new ContaBancaria();
		teste.conta = 65812;
		teste.agencia = 459648;
		teste.usuario = "Maiar Lindo";

		teste.critério();
		teste.escreva();
	}
}
