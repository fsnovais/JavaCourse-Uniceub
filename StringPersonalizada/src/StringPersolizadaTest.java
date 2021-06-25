package StringPersonalizada;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringPersonalizadaTest {

	// declara uma string personazliada para teste
	StringPersonalizada minhaStringPersonalizada;

	@BeforeEach
	public void setUp() throws Exception {
		//inicializa uma string personalizada
		this.minhaStringPersonalizada = new StringPersonalizada();
	}

	@Test
	void testGetString() {
		
		//string deve ser null para começar, antes de inicia-la
		assertNull(this.minhaStringPersonalizada.getString());
		
		this.minhaStringPersonalizada.DefineString("hello");
		assertEquals("hello", this.minhaStringPersonalizada.getString());
		
		// TODO escreva pelo menos 3 casos de teste adicionais
	}
	
	@Test
	void testDefineString() {
		
		//string deve ser null para começar, antes de inicia-la
		assertNull(this.minhaStringPersonalizada.getString());
		
		this.minhaStringPersonalizada.DefineString("Good-bye!");
		assertEquals("Good-bye!", this.minhaStringPersonalizada.getString());
		
		// TODO escreva pelo menos 3 casos de teste adicionais
	}
	
	@Test
	void testRemove() {
		assertEquals("", this.minhaStringPersonalizada.remove(""));
		
		this.minhaStringPersonalizada.DefineString(null);
		assertEquals("", this.minhaStringPersonalizada.remove(""));
		
		this.minhaStringPersonalizada.DefineString("Estudo no Ceub em 2021");
		assertEquals("Etud n Ceub em 2021", this.minhaStringPersonalizada.remove("so2"));
		
		// TODO escreva pelo menos 3 casos de teste adicionais
	}

	@Test
	void testReverse() {
		assertEquals("", this.minhaStringPersonalizada.reverse(""));
		
		this.minhaStringPersonalizada.DefineString(null);
		assertEquals("", this.minhaStringPersonalizada.reverse(""));
		
		this.minhaStringPersonalizada.DefineString("abc, XYZ; 123.");
		assertEquals("aBC, xyz; 123.", this.minhaStringPersonalizada.reverse("bcdxyz@3210."));
		
		// TODO escreva pelo menos 3 casos de teste adicionais
	}

	@Test
	void testfiltraLetras() {
		assertEquals("", this.minhaStringPersonalizada.filtraLetras('E', false));
		
		this.minhaStringPersonalizada.DefineString(null);
		assertEquals("", this.minhaStringPersonalizada.filtraLetras('E', false));
		
		// TODO escreva pelo menos 3 casos de teste adicionais
	}

}