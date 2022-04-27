package POO;

public class Funcionario2 {

	public static void main(String[] args) {
		Funcionario1 candidato = new Funcionario1();
		
		candidato.idade = 52;
		candidato.cargo = "T.I";
		candidato.setor = "T.I";
		
		candidato.critério();
		candidato.escrever();
		
		
		
		
	}
}
