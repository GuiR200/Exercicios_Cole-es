package Listas;

public class Gerente {
	
	private String nome;
	private String telefone;
	
	public Gerente(String nome,String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}
	public Gerente(String nome) {
		this.nome = nome;
	}
	//Getter
	public String getNome() {
		return nome;
	
	}
	public String getTelefone() {
		return telefone;
}
}
