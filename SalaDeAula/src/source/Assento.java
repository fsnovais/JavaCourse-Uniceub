package source;
/**
 * Representa uma cadeira em uma sala de aula
 * Cada posição da cadeira é representada por uma linha e coluna 
 * E cada cadeira pode ter um estudante
 * @author felip
 *
 */
public class Assento {
	
	int linha;
	int coluna;
	
	Estudante estudanteNaCadeira;
	
	//construtor
	
	public Assento(int linha, int coluna) {
		this.coluna = coluna;
		this.linha = linha;
	}
	
	//Designa uma cadeira ao estudante
	
	public void poeEstudanteNaCadeira(Estudante estudante) {
		this.estudanteNaCadeira = estudante;
	}
	
	//tem que ser definido EXATAMENTE assim
	public String toString() {
		return this.linha+", "+this.coluna+": "+this.estudanteNaCadeira;
	}

}
