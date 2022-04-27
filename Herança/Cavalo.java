package Herança;

public class Cavalo extends Animal {

	private boolean correr;
	
	public void corridaCavalo ()
	{
		System.out.println("O cavalor está galopando.");
	}

	public boolean isCorrer() {
		return correr;
	}

	public void setCorrer(boolean correr) {
		this.correr = correr;
	}
}