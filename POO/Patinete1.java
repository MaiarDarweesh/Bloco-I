package POO;

public class Patinete1 {

	 public int rodas, pre�o;
	 public String nome;
	 
	 public void numeroRodas ()
	 {
		 if (rodas == 2)
			 System.out.println("O n�mero de rodas t� aprovado");
		 else
			 System.out.println("N�mero de rodas � maior ou menor que o ideal.");
	 }
	 
	 public void escreva ()
	 {
		 System.out.println("O n�mero de rodas � de: " + this.rodas);
		 System.out.println("O pre�o desse patinete ser� de: " + this.pre�o);
		 System.out.println("E o nome que se dar� ao Patinete ser�: " + this.nome);

	}
	 
}
