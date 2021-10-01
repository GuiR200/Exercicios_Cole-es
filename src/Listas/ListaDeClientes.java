package Listas;

import java.util.ArrayList;

public class ListaDeClientes {
	
	ArrayList<Cliente> listaDeClientes = new ArrayList<Cliente>();
	
	public void cadastro(Cliente cliente) {
		if(cliente != null) {
			listaDeClientes.add(cliente);		
		}
	}
		// Remoção
		public void remover(Cliente cliente) {
			listaDeClientes.removeIf((elemento)->elemento.getCpf().equals(cliente.getCpf()));
			
			
		}
		// Buscar
		public Cliente buscar(Cliente cliente) {
			for(Cliente elemento : listaDeClientes) {
				if(elemento.getCpf().equals(cliente.getCpf())) {
					return elemento;
					
				}
			}
		return cliente;
		}
		
		// Editar
		
		public void editar(Cliente novoCliente) {
			int indice = listaDeClientes.indexOf(this.buscar(novoCliente));
			if(indice != -1) {
				listaDeClientes.set(indice, novoCliente);
			}
		}
		public String listar() {
			StringBuilder builder = new StringBuilder();
			for(Cliente cliente : this.listaDeClientes) {
				builder.append(cliente.toString());
			}
			return builder.toString();
		}
	}
