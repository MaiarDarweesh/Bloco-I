package POO;

public class Cliente {
	// ATRIBUTOS >> CARACTERISTICAS.
	public String nome;
	public double rg, cpf, idade;

	public void testeCPF() {
		if (cpf > 999999999)
			System.out.println("CPF v�lido" + this.cpf);
		else
			System.out.println("CPF inv�lido");
	}

	public void teste() {
		System.out.println("O seu nome �: " + this.nome);
		System.out.println("Seu RG �: " + this.rg);
		System.out.println("O seu CPF �: " + this.cpf);
		System.out.println("E sua idade �: " + this.idade);
	}
}
