package Herança;

public class Preguiça extends Animal {

	private boolean comerFolha;
	
	public void subir ()
	{
		System.out.println("A preguiça está subindo a arvore.");
	}

	public boolean isComerFolha() {
		return comerFolha;
	}

	public void setComerFolha(boolean comerFolha) {
		this.comerFolha = comerFolha;
	}
	
}