package Heran�a;

public class Cavalo extends Animal {

	private boolean correr;
	
	public void corridaCavalo ()
	{
		System.out.println("O cavalor est� galopando.");
	}

	public boolean isCorrer() {
		return correr;
	}

	public void setCorrer(boolean correr) {
		this.correr = correr;
	}
}