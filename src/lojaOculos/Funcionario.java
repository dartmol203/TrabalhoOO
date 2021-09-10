package lojaOculos;

public class Funcionario extends Pessoa {// Classe Funcion�rio que herda da classe abstrata Pessoa

	// declaracoes
	private double salario;
	private String dataContratacao;

	// getters e setters
	public double getSalario() {// Valor do sal�rio
		return salario;
	}

	public void setSalario(double salario) {// Valor do sal�rio
		this.salario = salario;
	}

	public String getDatacontrac() {// Data da contrata��o
		return dataContratacao;
	}

	public void setDatacontrac(String dataContratacao) {// Data da contrata��o
		this.dataContratacao = dataContratacao;
	}

	// metodo de busca
	public boolean buscaFuncionarioID(String funcionarioidbuscado) {
		if (id.equalsIgnoreCase(funcionarioidbuscado))
			return true;

		else
			return false;
	}

}
