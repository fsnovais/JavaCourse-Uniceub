package StringPersonalizada;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;  


public class StringPersonalizada {
	
	//vari�veis de instancia
	
	/**
	 * string atual.
	 */
	String minhaString;
	
	/**
	 * indica se a string atual minhaString j� foi definido
	 */
	boolean estaDefinido;
	
	//constructor
	
	/**
	 * Inicializa minhaString to null.
	 * Inicializa estaDefinido para falso.
	 */
	public StringPersonalizada() {
		// TODO Implemente o construtor
	}

	// m�todos 
	
    /**
     * Retorna a String atual.
     * Se a string atual � null, ou ainda n�o tiver um valor definido pelo m�todo defineString, deve retornar null.
     * @return string atual
     */
	public String pegaString() {
		// TODO Implemente o m�todo
		
		return null;
	}

	/**
	 * Define o valor da string atual e define this.estaDefinido para true.
	 * Se a string dada for null (se estiver vazia), define this.estaDefinido para falso.
     * @param string para ser definida
     */
	public void defineString(String string) {
		// TODO Implemente o m�todo
	}

    /**
     * Retorna uma nova vers�o da string onde os caracteres alfab�ticos dados no argumento, s�o removidos.
     * Todos os caracteres N�O ALFAB�TICOS n�o s�o afetados
     * Se a string atual � null, vazia, ou ainda n�o tem valor definido, esse m�todo deve retornar uma string vazia.
     * Se lembre: Esse m�todo constr�i e retorna uma nova string, e n�o modifica diretamente o campo minhaString.
     * @param arg	a string contendo os caracteres a serem removidos 
     * @return 		nova string no qual os caracteres especificados em arg s�o removidos
     */
	public String remove(String arg) {
		// TODO Implemente o m�todo
		
	  	return null;
	}
	
	/**
	 * Retorna uma nova string onde a capitaliza��o � revertida (i.e. mai�scula para mim�scula, e mim�scula para mai�scula) de acordo 
	 * com os caracteres espec�ficados no argumento (arg).
	 * TODOS os caracteres nao alfab�ticos s�o inafetados
	 * Se a string atual � null, vazia, ou seja, se ainda n�o tem valor definido, esse m�todo deve retornar uma string vazia.
	 *
	 * Examplo:
	 * - Para a string "abc, XYZ; 123.", chamar reverte("bcdxyz@3210.") retornaria "aBC, xyz; 123."
	 * 
	 * Se lembre: Esse m�todo constr�i e retorna uma nova string, e n�o modifica diretamente o campo minhaString.
	 * 
	 * @param arg a string contendo os caracteres a serem modificados
	 * @return uma nova string no qual capitaliza��o � revertida
	 */
	public String reverte(String arg) {
		// TODO Implemente o m�todo 
		
		return null;
	}

    /**
     * Retorna uma nova string em que todas as letras ou >= ou <= que o char n, s�o removidos.  
     * 
     * A letra fornecida pode ser a-z ou A-Z.
     * As letras a serem removidas n�o diferenciam mai�sculas de min�sculas.
     *
     * Se a string atual � null, vazia, ou seja, se ainda n�o tem valor definido, esse m�todo deve retornar uma string vazia.
     * 
     *
     * Se n n�o for uma letra (e a string atual n�o for nula), o m�todo deve retornar uma string vazia.
     *
     * Examplo:
     * - Para a string "Hello 90, bye 2", chamar filtraLetras('h', false) retornaria "llo 90, y 2"
     * 
     * Se lembre: Esse m�todo constr�i e retorna uma nova string, e n�o modifica diretamente o campo minhaString.
     *
     * @param n 		char para comparar 
     * @param more 		indica se letras >= ou <= ser�o removidas
     * @return nova string com as letras removidas
     */
	public String filtraLetras(char n, boolean mais) {
		// TODO Implemente o m�todo
		
		return null;
	}
}