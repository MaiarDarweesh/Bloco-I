package POO;

public class Cliente {
	// ATRIBUTOS >> CARACTERISTICAS.
	public String nome;
	public double rg, cpf, idade;

	public void testeCPF() {
		if (cpf > 999999999)
			System.out.println("CPF válido" + this.cpf);
		else
			System.out.println("CPF inválido");
	}

	public void teste() {
		System.out.println("O seu nome é: " + this.nome);
		System.out.println("Seu RG é: " + this.rg);
		System.out.println("O seu CPF é: " + this.cpf);
		System.out.println("E sua idade é: " + this.idade);
	}
}
