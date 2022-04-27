package Projeto;

import java.util.Scanner;

public class Cadastro {

	public static void main(String[] args) 
	    	{
			
			String nome,endereco,login, email, segredo, segredo2;
			int idade,op,senha, teste, user;
			long cpf,telefone;
			char resp=' ';
			
			 
			Scanner ler=new Scanner(System.in);
		
			
			System.out.println("Para acessar a plataforma GenFlix, digite: ");
	
			System.out.println("1- Para se cadsatrar \n2- Se já é casatrado");
			teste = ler.nextInt();
				
			switch (teste) {	
			case 1:
			{
					System.out.println("Digite seu nome:");
					nome = ler.next();
				
					System.out.println("Digite seu email:");
					email = ler.next();
				
					System.out.println("Digite seu numero de celular:");
					telefone = ler.nextLong();
				
					System.out.println("Digite sua senha");
					segredo = ler.next();
					System.out.println("FIM DO PROGRAMA ");
					break;
					//System.out.println("Cadastrado realizado com sucesso. Entre com seu login e senha");;
			}
				case 2:
				{
					System.out.println("Digite seu email: ");
					email = ler.next();
					System.out.println("Digite sua senha maravilhosa: ");
					segredo = ler.next();
					System.out.println("FIM DO PROGRAMA ");
				}
			}
	    	}
}
	 

