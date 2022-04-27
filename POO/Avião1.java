package POO;

public class Avião1 {

	public int numeroVoo, numeroPassageiros;
	public String modelo;

	public void limite() {
		if (numeroPassageiros > 500)
			System.out.println("Número de passageiros acima do limite recomendado");
		else
			System.out.println("Voo liberado pelo suporte");
	}

	public void escreva() {
		System.out.println("O número do voo é: " + this.numeroVoo);
		System.out.println("O número de passageiros é de exatamente: " + this.numeroPassageiros);
		System.out.println("O modelo do avião é: " + this.modelo);
	}
}
