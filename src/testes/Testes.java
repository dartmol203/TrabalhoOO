package testes;

import static org.junit.jupiter.api.Assertions.*;
import controle.*;
import org.junit.jupiter.api.Test;
import modelo.Telefone;

/** Classe que verifica os dados da classe validador
 * @author Vinicius Assump��o e Andr� Corr�a 
 * @vers�o 1.0
 */
class Testes {

	Validador v = new Validador();

	@Test
	void testValidaCpf() {
		assertTrue(v.validaCpf("22365478954"));  // valido
		assertFalse(v.validaCpf("99999999999")); // invalido pelos digitos iguais
		assertFalse(v.validaCpf("2365478954"));  // invalido menor que deveria
	
	}

	@Test
	void testValidaCep() {
		assertTrue(v.validaCep(26567587));   // valido
		assertFalse(v.validaCep(265675875)); // invalido pela quantidade ser maior
		assertFalse(v.validaCep(22222222));  // invalido pelos digitos iguais
		
	}

	@Test
	void testValidaData() {
		assertTrue(v.validaData("23/08/2022"));  // valido
		assertFalse(v.validaData("32/07/2025")); // invalido pelo dia
		assertFalse(v.validaData("30/07/2032")); // invalido pelo ano
		assertFalse(v.validaData("1515151512")); // formato invalido
		assertFalse(v.validaData("15/02/20"));   // ano incompleto


	}
	
	@Test
	void testValidaTelefone() {
		assertTrue(v.validaTelefone(new Telefone(61, 555555555)));   // valido
		assertFalse(v.validaTelefone(new Telefone(555, 123456789))); // invalido pelo ddd
		assertFalse(v.validaTelefone(new Telefone(61, 12345678)));   // invalido pelo numero menor
		assertFalse(v.validaTelefone(new Telefone(561, 55555555)));  // invalido pelos dois verificadores
		
	}

}
