package POO;

public class Eletronico1 {

	public int numeroResistor, numeroFios;
	public String modelo;
	
	public void celular()
	{
		if (numeroResistor >= 42)
		System.out.println("Quantidade de resistores superior que o limite desejado");
		else
		System.out.println("Produto aprovado pela Anvisa");
	}
	public void escreva ()
	{
		System.out.println("O n�mero de resistores no celular � de: " + this.numeroResistor);
		System.out.println("O n�mero de fios dentro do celular � de: " + this.numeroFios);
		System.out.println("O modelo do celular �: " + this.modelo);
	}
	
	
}
