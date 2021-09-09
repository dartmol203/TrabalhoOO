package lojaOculos;

import java.util.Date;

public class Pessoa {//classe abstrata Pessoa
	
	protected String nome,endereco,id;
	protected int cpf,telefone;
	protected Date dataaniversario;

	
	public String getNome() {//Nome da pessoa
		return nome;
	}
	public void setNome(String nome) {//Nome da pessoa
		this.nome = nome;
	}
	public String getEndereco() {//Endere�o da pessoa
		return endereco;
	}
	public void setEndereco(String endereco) {//Endere�o da pessoa
		this.endereco = endereco;
	}
	public String getID() {//Identifica��o da pessoa
		return endereco;
	}
	public void setID(String id) {//Identifica��o  da pessoa
		this.id = id;
	}
	public int getTelefone() {//telefone da pessoa
		return telefone;
	}
	public void setTelefone(int telefone) {//telefone da pessoa
		this.telefone = telefone;
	}
	public int getCPF() {//CPF da pessoa
		return cpf;
	}
	public void setCPF(int cpf) {//CPF da pessoa
		this.cpf = cpf;
	}
	public Date getDataaniver() {//Anivers�rio da pessoa
		return dataaniversario;
	}
	public void setDataaniver(Date dataaniversario) {//Anivers�rio da pessoa
		this.dataaniversario = dataaniversario;
	}
	
}
