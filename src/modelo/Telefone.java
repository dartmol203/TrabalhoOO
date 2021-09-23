package modelo;

public class Telefone {
	
	private int DDD;
	private int numero;
	

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
