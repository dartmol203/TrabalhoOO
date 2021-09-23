package controle;

import modelo.*;

public class ControleProfessor {
	private Professor[] p;
	private int qtdProfs;

	public ControleProfessor(ControleDados d) {
		this.p = d.getProfessores();
		this.qtdProfs = d.getQtdProfs();
	}

	public String[] getNomeProf() {
		String[] s = new String[qtdProfs];
		for(int i = 0; i < qtdProfs; i++) {
			s[i] = p[i].getNome();
		}

		return s;
	}
	public int getQtd() {
		return qtdProfs;
	}

	public void setQtd(int qtd) {
		this.qtdProfs = qtd;
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

	public void setQtdAlunos(int qtdProfs) {
		this.qtdProfs = qtdProfs;
	}
	
	public double getValorHoraAula (int i) {
		return p[i].getValorHoraAula();
	}
	
	public String getEndereco(int i) {		
		return p[i].getEndereco();
	}	
	
}
