package POO;

public class ContaBancaria {

	public int conta, agencia;
	public String usuario;

	public void critério() {
		if (conta > 99999)
			System.out.println("Conta inválida, valor maior que o ideal");
		else if (conta < 9999)
			System.out.println("Conta inválida, valor menor que o ideal");
		else
			System.out.println("Conta válida");
	}

	public void escreva() {
		System.out.println("Número da conta: " + this.conta);
		System.out.println("Número da agencia: " + this.agencia);
		System.out.println("Nome do usuario: " + this.usuario);

	}

}
