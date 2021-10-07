package modelo;

/**
 * Classe de modelo de armacao
 * 
 * @author Andre Correa e Vinicius Assumpcao
 * @version 1.0
 */
public class Cliente extends Pessoa {
	private String dataPrimC;
	private String endereco;

	/**
	 * construtor padrao da classe
	 */
	public Cliente() {
		super();
	}

	/**
	 * metodo construtor da classe Cliente
	 * 
	 * @param n   String nome do cliente
	 * @param e   String endereco do cliente
	 * @param dt  String data primeira Compra
	 * @param id  int id do cliente
	 * @param CPF int com o cpf do cliente
	 * @param tel Telefone do cliente
	 */
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
