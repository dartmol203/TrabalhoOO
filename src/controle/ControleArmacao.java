package controle;

import modelo.*;

public class ControleArmacao {
	private Armacao[] a;
	private int qtdArmacao;

	public ControleArmacao(ControleDados d) {
		a = d.getArmacao();
		qtdArmacao = d.getQtdArmacao();

	}

	public String[] getNomeArmacao() {
		String[] s = new String[qtdArmacao];
		for (int i = 0; i < qtdArmacao; i++) {
			s[i] = a[i].getNomeArmacao();
		}
		return s;
	}

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
