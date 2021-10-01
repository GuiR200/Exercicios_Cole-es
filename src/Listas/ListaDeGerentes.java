package Listas;

import java.util.ArrayList;

public class ListaDeGerentes {

	ArrayList<Gerente> listaDeGerentes = new ArrayList<Gerente>();

	public void cadastrar(Gerente gerente) {
		if(gerente != null) {
			listaDeGerentes.add(gerente);
		}
	}
    //Remover
	public void remover(Gerente gerente) {
		listaDeGerentes.removeIf((elemento)->elemento.getNome().equalsIgnoreCase(gerente.getNome()));
		
	}
	//Buscar
	public Gerente buscar(Gerente gerente) {
		for(Gerente elemento : listaDeGerentes) {
			if(elemento.getNome().equalsIgnoreCase(gerente.getNome())) {
				return elemento;
			}
		}
		
		return null;
	}
	//Editar
	public void editar(Gerente novoGerente) {
		int indice = listaDeGerentes.indexOf(this.buscar(novoGerente));
		if(indice != -1) {
		    listaDeGerentes.set(indice, novoGerente);
		}
	}
	public String listar() {
		StringBuilder builder = new StringBuilder();
		for(Gerente gerente : this.listaDeGerentes) {
			builder.append("Nome:"+gerente.getNome()+" - Telefone:"+gerente.getTelefone()+"\n");
		}
		return builder.toString();
	}
}

	
