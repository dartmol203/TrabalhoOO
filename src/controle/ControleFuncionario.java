package controle;

import modelo.*;

/**
 * Classe de Controle de dados de Funcionario
 * 
 * @author Andre Correa e Vinicius Assumpcao
 * @version 1.0
 */
public class ControleFuncionario {
	private Funcionario[] p;
	private int qtdFuncionarios;

	/**
	 * metodo para salvar os dados de Funcionarios
	 * 
	 * @param d instancia de ControleDados
	 */
	public ControleFuncionario(ControleDados d) {
		this.p = d.getFuncionarios();
		this.qtdFuncionarios = d.getQtdFuncionarios();
	}

	/**
	 * metodo que retorna os nomes dos funcionarios em um vetor de Strings
	 * 
	 * @return vetor com nomes dos funcionarios
	 */
	public String[] getNomeFuncionario() {
		String[] s = new String[qtdFuncionarios];
		for (int i = 0; i < qtdFuncionarios; i++) {
			s[i] = p[i].getNome();
		}

		return s;
	}

	public int getQtd() {
		return qtdFuncionarios;
	}

	public void setQtd(int qtd) {
		this.qtdFuncionarios = qtd;
	}

	public String getNome(int i) {
		return p[i].getNome();
	}

	public String getCPF(int i) {
		String numCPF = String.valueOf(p[i].getCPF());
		return numCPF;
	}

	public String getID(int i) {
		String numID = String.valueOf(p[i].getNumID());
		return numID;
	}

	public Telefone getNumTel(int i) {
		return p[i].getNumTel();
	}

	public double getSalario(int i) {
		return p[i].getSalario();
	}

	public String getEndereco(int i) {
		return p[i].getEndereco();
	}

}
