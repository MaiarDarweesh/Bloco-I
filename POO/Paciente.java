package POO;

public class Paciente {
public int idade, altura;
public String nome, sintoma;

	public void medicamento ()
	{
		if (idade >= 18)
			System.out.println("A idade est� apropriada para o medicamento.");
			else
			System.out.println("Menor de idade, sem permiss�o para o medicamento.");
	}
	public void escreva ()
	{
		System.out.println("Sua idade �: " + this.idade);
		System.out.println("Sua altura � de: " + this.altura);
		System.out.println("Seu nome �: " + this.nome);
		System.out.println("Sintoma apresentado: " + this.sintoma);
	}
}
