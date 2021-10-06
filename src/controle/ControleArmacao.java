package controle;

import modelo.*;

/**
 * Classe de Controle de dados da armacao
 * 
 * @author Andre Correa e Vinicius Assumpcao
 * @version 1.0
 */
public class ControleArmacao {
	private Armacao[] a;
	private int qtdArmacao;

	/**
	 * metodo para salvar os dados da armacao
	 * 
	 * @param d
	 */
	public ControleArmacao(ControleDados d) {
		a = d.getArmacao();
		qtdArmacao = d.getQtdArmacao();

	}

	/**
	 * metodo que retorna os nomes das armacoes em um vetor de Strings
	 * 
	 * @return vetor com nomes das armacoes
	 */
	public String[] getNomeArmacao() {
		String[] s = new String[qtdArmacao];
		for (int i = 0; i < qtdArmacao; i++) {
			s[i] = a[i].getNomeArmacao();
		}
		return s;
	}

	/**
	 * metodo que retorna o nome da armacao na posicao indicada
	 * 
	 * @param i int que indica a posicao do nome a ser retornado
	 * @return String com o nome da armacao buscada
	 */
	public String getNomeArmacao(int i) {
		return a[i].getNomeArmacao();
	}

	public int getQtd() {
		return qtdArmacao;
	}

	public void setQtd(int qtd) {
		this.qtdArmacao = qtd;
	}

	public String getMarcaArmacao(int i) {
		return a[i].getMarcaArmacao();
	}

	public String getMateArmacao(int i) {
		return a[i].getMateArmacao();
	}

	public double getValorArmacao(int i) {
		return a[i].getValorArmacao();
	}

	public int getIDArmacao(int i) {
		return a[i].getIDArmacao();
	}

	public int getMedidaaro(int i) {
		return a[i].getMedidaaro();
	}

}
