package POO;

public class Funcionario1 {

	public int idade;
	public String cargo, setor;
	
	public void critério()
	{
		if (idade >= 18)
			System.out.println("Idade apropriada.");
		else
			System.out.println("Menor de idade não é aceito para a vaga: ");
	}
	public void escrever ()
	{
		System.out.println("Sua idade é: " + this.idade);
		System.out.println("E o cargo que vc está concorrendo é o: " + this.cargo);
		System.out.println("Do setor: " + this.setor);
	}
	
}
