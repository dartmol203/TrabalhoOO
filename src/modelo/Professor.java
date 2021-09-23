package modelo;

public class Professor extends Pessoa {
	private double valorHoraAula;
	private String endereco;
	
	public Professor(){
		super();
	}
	
	public Professor(String n, String e, double v, int CPF, int id, Telefone t) {
		this.nome = n;
		valorHoraAula = v;
		endereco = e;
		this.numTel = t;
		this.CPF = CPF;
		this.numID = id;
				
	}
	
		public String toString() {
		return "Nome d@ professor@: " + nome + ", valor salario: R$" + valorHoraAula;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValorHoraAula() {
		return valorHoraAula;
	}

	public void setValorHoraAula(double valorHoraAula) {
		this.valorHoraAula = valorHoraAula;
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
