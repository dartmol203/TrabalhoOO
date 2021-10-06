package testes;

/** Classe que verifica os dados da classe validador
 * @author Vinicius Assumpção e André Corréa 
 * @versão 1.0
 */
import static org.junit.jupiter.api.Assertions.*;
import controle.*;
import org.junit.jupiter.api.Test;





class Testes {

	Validador v = new Validador();
	
	
	@Test
	void testValidaCpf() {
		assertTrue(v.validaCpf("2365478954"));
		assertFalse(v.validaCpf("22365478954"));
		assertTrue(v.validaCpf("9999999999"));
		
		
		
		
	}

	@Test
	void testValidaCep() {
		assertTrue(v.validaCep(26567587));
		assertFalse(v.validaCep(265675875));
		assertFalse(v.validaCep(22222222));
	}

	@Test
	void testValidaData() {
		assertTrue(v.validaData("23/08/2022"));
		assertFalse(v.validaData("32/07/2025"));
		assertFalse(v.validaData("30/07/2032"));
		
	}

}
