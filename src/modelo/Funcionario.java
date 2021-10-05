package modelo;

public class Funcionario extends Pessoa {
	private double Salario;
	private String endereco;

	public Funcionario() {
		super();
	}

	public Funcionario(String n, String e, double s, String CPF, int id, Telefone t) {
		this.nome = n;
		Salario = s;
		endereco = e;
		this.numTel = t;
		this.CPF = CPF;
		this.numID = id;

	}

	public String toString() {
		return "Nome d@ funvionario: " + nome + ", valor salario: R$" + Salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return Salario;
	}

	public void setSalario(double salario) {
		this.Salario = salario;
	}

	public Telefone getTel() {
		return numTel;
	}

	public void setTel(Telefone tel) {
		this.numTel = tel;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
