package POO;

public class Ciente2 {

	public static void main(String[] args) {
		Cliente manutencao = new Cliente();

		manutencao.cpf = 46467588;
		manutencao.rg = 645892;
		manutencao.idade = 18;
		manutencao.nome = "Maiar Lindo";

		manutencao.teste();
		manutencao.testeCPF();

	}
}
