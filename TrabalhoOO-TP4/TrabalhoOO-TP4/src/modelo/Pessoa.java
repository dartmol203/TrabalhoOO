package modelo;

public abstract class Pessoa {
	protected String nome;
	protected int numID;
	protected int CPF; 
	protected Telefone numTel;
	
	public Pessoa() {
		super();
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getNumID() {
		return numID;
	}


	public void setNumID(int numID) {
		this.numID = numID;
	}


	public int getCPF() {
		return CPF;
	}


	public void setCPF(int cPF) {
		CPF = cPF;
	}


	public Telefone getNumTel() {
		return numTel;
	}


	public void setNumTel(Telefone numTel) {
		this.numTel = numTel;
	}

}
