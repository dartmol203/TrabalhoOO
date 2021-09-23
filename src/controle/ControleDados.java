package controle;

import modelo.*;

public class ControleDados {
	private Dados d = new Dados();
	
	public ControleDados() {
		d.fillWithSomeData();
	}
	
	public Dados getDados() {
		return d;
	}
	public void setDados(Dados d) {
		this.d = d;
	}

	public Aluno[] getAlunos() {
		return this.d.getAlunos();
	}
	
	public int getQtdAlunos() {
		return this.d.getQtdAlunos();
	}
	
	public int getQtdProfs() {
		return this.d.getQtdProfs();
	}
	
	public Professor[] getProfessores() {
		return this.d.getProfs();
	}
	


	public boolean inserirEditarProf(String[] dadosProfs) {
		if(!dadosProfs[3].matches("[0-9]+") || !dadosProfs[4].matches("[0-9]+") || 
				!dadosProfs[5].matches("[0-9]+") || !dadosProfs[6].matches("[0-9]+")) {
			return false;
		} else {
				Professor p = new Professor(dadosProfs[1],dadosProfs[2], Double.parseDouble(dadosProfs[7]), 
						Integer.parseInt(dadosProfs[3]), Integer.parseInt(dadosProfs[4]), 
						new Telefone(Integer.parseInt(dadosProfs[5]), Integer.parseInt(dadosProfs[6])));
				d.inserirEditaProf(p, Integer.parseInt(dadosProfs[0]));
				return true;
		}
	}
	// a posicao 0 do vetor dadosAlunos indica onde os dados devem ser inseridos
	public boolean inserirEditarAluno(String[] dadosAlunos) {
		if(!dadosAlunos[3].matches("[0-9]+") || !dadosAlunos[4].matches("[0-9]+") || 
				!dadosAlunos[5].matches("[0-9]+") || !dadosAlunos[6].matches("[0-9]+")) {
			return false;
		} else {
				Aluno a = new Aluno(dadosAlunos[1], dadosAlunos[2],dadosAlunos[7], Integer.parseInt(dadosAlunos[3]), 
						Integer.parseInt(dadosAlunos[4]), new Telefone(Integer.parseInt(dadosAlunos[5]),
								Integer.parseInt(dadosAlunos[6])));
				d.inserirEditarAluno(a, Integer.parseInt(dadosAlunos[0]));
				return true;
		}
	}
	
	public boolean removerAluno(int i) {

		String alunoRemovido = d.getAlunos()[i].getNome();
	
		
		if(i == (d.getQtdAlunos() - 1)) { // O aluno a ser removido está no final do array
			d.setQtdAlunos(d.getQtdAlunos() - 1);
			d.getAlunos()[d.getQtdAlunos()] = null;
			return true;
		} else { // o aluno a ser removido está no meio do array
			int cont = 0;
			while(d.getAlunos()[cont].getNome().compareTo(alunoRemovido) != 0) {
				cont++;
			}
			//Rotina swap
			for(int j = cont; j < d.getQtdAlunos() - 1; j++) {
				d.getAlunos()[j] = null;
				d.getAlunos()[j] = d.getAlunos()[j+1];
			}
			d.getAlunos()[d.getQtdAlunos()] = null;
			d.setQtdAlunos(d.getQtdAlunos() - 1);
			return true;
		}
	}
	
	public boolean removerProfessor(int i) {

		String profRemovido = d.getProfs()[i].getNome();


		if(i == (d.getQtdProfs() - 1)) { // O prof a ser removido está no final do array
			d.setQtdProfs(d.getQtdProfs() - 1);
			d.getProfs()[d.getQtdProfs()] = null;
			return true;
		} else { // o prof a ser removido está no meio do array
			int cont = 0;
			while(d.getProfs()[cont].getNome().compareTo(profRemovido) != 0)
				cont++;
			//Rotina swap
			for(int j = cont; j < d.getQtdProfs() - 1; j++) {
				d.getProfs()[j] = null;
				d.getProfs()[j] = d.getProfs()[j+1];
			}
			d.getProfs()[d.getQtdProfs()] = null;
			d.setQtdProfs(d.getQtdProfs() - 1);
			return true;
		}
	}
}
