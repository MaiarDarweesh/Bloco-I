package POO;

public class Eletronico2 {
	public static void main(String[] args) {
		
		Eletronico1 modeloNovo = new Eletronico1 ();
		
		modeloNovo.numeroResistor = 300;
		modeloNovo.numeroFios = 50;
		modeloNovo.modelo = "JS-Pro";
		
		modeloNovo.celular ();
		modeloNovo.escreva ();
		
				
	}
}
