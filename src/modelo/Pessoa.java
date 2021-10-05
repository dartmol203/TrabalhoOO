package modelo;

public abstract class Pessoa {
	protected String nome;
	protected int numID;
	protected String CPF;
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

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public Boolean validaCpf(String cpf) {
		if (cpf.length() == 11 && !CPF.equals("00000000000") && !CPF.equals("11111111111") && !CPF.equals("22222222222")
				&& !CPF.equals("33333333333") && !CPF.equals("44444444444") && !CPF.equals("55555555555")
				&& !CPF.equals("66666666666") && !CPF.equals("77777777777") && !CPF.equals("88888888888")
				&& !CPF.equals("99999999999")) {
			return true;
		} else {
			return false;
		}

	}

	public Telefone getNumTel() {
		return numTel;
	}

	public void setNumTel(Telefone numTel) {
		this.numTel = numTel;
	}

}
