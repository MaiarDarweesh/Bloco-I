package POO;

public class ContaBancaria {

	public int conta, agencia;
	public String usuario;

	public void crit�rio() {
		if (conta > 99999)
			System.out.println("Conta inv�lida, valor maior que o ideal");
		else if (conta < 9999)
			System.out.println("Conta inv�lida, valor menor que o ideal");
		else
			System.out.println("Conta v�lida");
	}

	public void escreva() {
		System.out.println("N�mero da conta: " + this.conta);
		System.out.println("N�mero da agencia: " + this.agencia);
		System.out.println("Nome do usuario: " + this.usuario);

	}

}
