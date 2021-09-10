package lojaOculos;

public class Pessoa {// classe abstrata Pessoa

	protected String nome, endereco, id, cpf, dataaniversario;
	protected long telefone;

	public String getNome() {// Nome da pessoa
		return nome;
	}

	public void setNome(String nome) {// Nome da pessoa
		this.nome = nome;
	}

	public String getEndereco() {// Endere�o da pessoa
		return endereco;
	}

	public void setEndereco(String endereco) {// Endere�o da pessoa
		this.endereco = endereco;
	}

	public String getID() {// Identifica��o da pessoa
		return id;
	}

	public void setID(String id) {// Identifica��o da pessoa
		this.id = id;
	}

	public long getTelefone() {// telefone da pessoa
		return telefone;
	}

	public void setTelefone(long telefone) {// telefone da pessoa
		this.telefone = telefone;
	}

	public String getCPF() {// CPF da pessoa
		return cpf;
	}

	public void setCPF(String cpf) {// CPF da pessoa
		this.cpf = cpf;
	}

	public String getDataaniver() {// Anivers�rio da pessoa
		return dataaniversario;
	}

	public void setDataaniver(String dataaniversario) {// Anivers�rio da pessoa
		this.dataaniversario = dataaniversario;
	}

}
