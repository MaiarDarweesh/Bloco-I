package Heran�a;

public class Fazenda {

	public static void main(String[] args) {
		 Cachorro a = new Cachorro ();
		 Cavalo b = new Cavalo ();
		 Pregui�a c = new Pregui�a ();
		 
		 a.corrida();
		 a.setNome("Beda");
		 a.setIdade(15);
		
		 b.corridaCavalo();
		 b.setNome("Gilberto");
		 b.setIdade(26);
		 
		 c.subir();
		 c.setNome("Jorgina");
		 c.setIdade(95);
		 
		 System.out.println("O nome do cachorro �: " + a.getNome() + ". E ele tem " + a.getIdade() + " anos de idade");
		 System.out.println("O nome do cavalo � : " + b.getNome() + ". E ele tem " + b.getIdade() + " anos de idade");
		 System.out.println("O nome da pregui�a � : " + c.getNome() + ". E ela tem " + c.getIdade() + " anos de idade");
	}
}
