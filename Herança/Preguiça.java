package Heran�a;

public class Pregui�a extends Animal {

	private boolean comerFolha;
	
	public void subir ()
	{
		System.out.println("A pregui�a est� subindo a arvore.");
	}

	public boolean isComerFolha() {
		return comerFolha;
	}

	public void setComerFolha(boolean comerFolha) {
		this.comerFolha = comerFolha;
	}
	
}