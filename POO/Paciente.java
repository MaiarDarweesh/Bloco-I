package POO;

public class Paciente {
public int idade, altura;
public String nome, sintoma;

	public void medicamento ()
	{
		if (idade >= 18)
			System.out.println("A idade está apropriada para o medicamento.");
			else
			System.out.println("Menor de idade, sem permissão para o medicamento.");
	}
	public void escreva ()
	{
		System.out.println("Sua idade é: " + this.idade);
		System.out.println("Sua altura é de: " + this.altura);
		System.out.println("Seu nome é: " + this.nome);
		System.out.println("Sintoma apresentado: " + this.sintoma);
	}
}
