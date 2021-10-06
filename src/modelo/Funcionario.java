package modelo;

/**
 * Classe de modelo de armacao
 * 
 * @author Andre Correa e Vinicius Assumpcao
 * @version 1.0
 */
public class Funcionario extends Pessoa {
	private double Salario;
	private String endereco;

	public Funcionario() {
		super();
	}

	/**
	 * metodo construtor da classe Funcionario
	 * 
	 * @param n   String com o nome do funcionario
	 * @param e   String com o endereco do funcionario
	 * @param s   double com o salario desse
	 * @param CPF int com o endereco desse
	 * @param id  int com o id desse
	 * @param t   Telefone com os dados dele
	 */
	public Funcionario(String n, String e, double s, int CPF, int id, Telefone t) {
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
