package Listas;

public class Cliente {
	
	private String cpf;
	private String nome;
	
	public Cliente(String nome,String cpf) {
		this.cpf = cpf;
		this.nome = nome;
	}	
		public Cliente(String cpf) {
			this.cpf = cpf;
	}
	//Getter
		public String getNome() {
			return nome;
		
		}
		public String getCpf() {
			return cpf;
		}
		
		@Override
		public String toString() {
			return String.format("Nome do cliente: %s\nCPF do cliente: %s\n\n", this.nome,this.cpf);
		}
}