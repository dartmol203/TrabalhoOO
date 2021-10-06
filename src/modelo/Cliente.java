package modelo;

public class Cliente extends Pessoa {
	private String dataPrimC;
	private String endereco;

	public Cliente() {
		super();
	}

	public Cliente(String n, String e, String dt, int id, int CPF, Telefone tel) {
		nome = n;
		endereco = e;
		dataPrimC = dt;
		this.CPF = CPF;
		this.numID = id;
		this.numTel = tel;
	}

	public String toString() {
		return "Nome do Cliente: " + nome;
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

	public String getDataPrimC() {
		return dataPrimC;
	}

	public void setDataPrimC(String dataAniver) {
		this.dataPrimC = dataAniver;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Telefone getNumTel() {
		return numTel;
	}

	public void setNumTel(Telefone numTel) {
		this.numTel = numTel;
	}
}
