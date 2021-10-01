package Listas;

public class Principal {

	public static void main(String[] args) {
	//	ListaDeGerentes gerentes = new ListaDeGerentes();
		// Criar dois gerentes
		//Gerente paulo = new Gerente("Paulo","1111");
	//	Gerente maria = new Gerente("Maria","2222");
		
		// Adicionar a lista
	//	gerentes.cadastrar(paulo);
	//	gerentes.cadastrar(maria);
		
		// Listar elementos
	//	System.out.println(gerentes.listar().toString());
		
		// Modificar maria
	//	Gerente novaMaria = new Gerente("Maria","3333");
		
		//gerentes.editar(novaMaria);
		
		// Listar elementos
			//	System.out.println(gerentes.listar().toString());
	
	// Remoção
//	gerentes.remover(maria);
//	gerentes.remover(paulo);
	
	// Listar elementos
	//System.out.println(gerentes.listar());

	ListaDeContas banco = new ListaDeContas() ;
	
	// Cadastrar as conta
		Conta conta1 = new Conta(1,200);
		Conta conta2 = new Conta(2,1000);
		
		banco.cadastrar(conta1);
		banco.cadastrar(conta2);
		
		Conta contaEditada = new Conta(1,500);
		
	// lista de conta
		System.out.println(banco.listar());
		
		banco.editar(contaEditada);
		
		// lista de conta
				System.out.println(banco.listar());
	}
}
