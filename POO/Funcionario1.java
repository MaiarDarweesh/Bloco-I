package POO;

public class Funcionario1 {

	public int idade;
	public String cargo, setor;
	
	public void crit�rio()
	{
		if (idade >= 18)
			System.out.println("Idade apropriada.");
		else
			System.out.println("Menor de idade n�o � aceito para a vaga: ");
	}
	public void escrever ()
	{
		System.out.println("Sua idade �: " + this.idade);
		System.out.println("E o cargo que vc est� concorrendo � o: " + this.cargo);
		System.out.println("Do setor: " + this.setor);
	}
	
}
