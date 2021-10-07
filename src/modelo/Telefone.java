package modelo;

/**
 * Classe de armazenamento de dados do telefone
 * 
 * @author Vinicius Assumpcao e Andre Correa 
 * @version 1.0
 */
public class Telefone {

	private int DDD;
	private int numero;

	/**
	 * Definicao de diferentes atributos da classe Telefone
	 * 
	 * @param cod int que indica numero do DDD
	 * @param num int que indica o numero do telefone sem DDD
	 */

	public Telefone(int cod, int num) {
		DDD = cod;
		numero = num;
	}

	public Telefone() {

	}

	public String toString() {
		return "Telefone: (" + DDD + ") " + numero;
	}

	public int getDDD() {
		return DDD;
	}

	public void setDDD(int dDD) {
		DDD = dDD;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
