package source;

public class Estudante {
	String nome;
	String ID;
	
	//construtor
	public Estudante(String nome, String ID) {
		this.nome = nome;
		this.ID = ID;
	}
	
	public String toString() {
		return this.nome;
	}
}
