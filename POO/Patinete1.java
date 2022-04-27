package POO;

public class Patinete1 {

	 public int rodas, preço;
	 public String nome;
	 
	 public void numeroRodas ()
	 {
		 if (rodas == 2)
			 System.out.println("O número de rodas tá aprovado");
		 else
			 System.out.println("Número de rodas é maior ou menor que o ideal.");
	 }
	 
	 public void escreva ()
	 {
		 System.out.println("O número de rodas é de: " + this.rodas);
		 System.out.println("O preço desse patinete será de: " + this.preço);
		 System.out.println("E o nome que se dará ao Patinete será: " + this.nome);

	}
	 
}
