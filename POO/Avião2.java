package POO;

public class Avião2 {
	public static void main(String[] args) {
		Avião1 teste = new Avião1();

		teste.numeroPassageiros = 450;
		teste.numeroVoo = 785;
		teste.modelo = "Ford";

		teste.limite();
		teste.escreva();
	}
}
