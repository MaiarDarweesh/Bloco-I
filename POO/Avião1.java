package POO;

public class Avi�o1 {

	public int numeroVoo, numeroPassageiros;
	public String modelo;

	public void limite() {
		if (numeroPassageiros > 500)
			System.out.println("N�mero de passageiros acima do limite recomendado");
		else
			System.out.println("Voo liberado pelo suporte");
	}

	public void escreva() {
		System.out.println("O n�mero do voo �: " + this.numeroVoo);
		System.out.println("O n�mero de passageiros � de exatamente: " + this.numeroPassageiros);
		System.out.println("O modelo do avi�o �: " + this.modelo);
	}
}
