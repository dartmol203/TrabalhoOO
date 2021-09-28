package controle;

import modelo.*;

public class ControleFuncionario {
	private Funcionario[] p;
	private int qtdFuncionarios;

	public ControleFuncionario(ControleDados d) {
		this.p = d.getFuncionarios();
		this.qtdFuncionarios = d.getQtdFuncionarios();
	}

	public String[] getNomeProf() {
		String[] s = new String[qtdFuncionarios];
		for(int i = 0; i < qtdFuncionarios; i++) {
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

	
	public double getSalario (int i) {
		return p[i].getSalario();
	}
	
	public String getEndereco(int i) {		
		return p[i].getEndereco();
	}	
	
}
