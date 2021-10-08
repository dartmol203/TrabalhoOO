package controle;

import modelo.*;

/**
 * Classe de Controle de dados do Cliente
 * 
 * @author Andre Correa e Vinicius Assumpcao
 * @version 1.0
 */
public class ControleCliente {
	private Cliente[] c;
	private int qtdClientes;

	/**
	 * metodo para salvar os dados dos clientes
	 * 
	 * @param d instancia de ControleDados
	 */
	public ControleCliente(ControleDados d) {
		c = d.getClientes();
		qtdClientes = d.getQtdClientes();

	}

	/**
	 * metodo que retorna os nomes dos Clientes em um vetor de Strings
	 * 
	 * @return vetor com nomes dos clientes
	 */
	public String[] getNomeCliente() {
		String[] s = new String[qtdClientes];
		for (int i = 0; i < qtdClientes; i++) {
			s[i] = c[i].getNome();
		}

		return s;
	}

	public int getQtd() {
		return qtdClientes;
	}

	public void setQtd(int qtd) {
		this.qtdClientes = qtd;
	}

	public String getNome(int i) {
		return c[i].getNome();
	}

	public String getCPF(int i) {
		String numCPF = String.valueOf(c[i].getCPF());
		return numCPF;
	}

	public String getID(int i) {
		String numID = String.valueOf(c[i].getNumID());
		return numID;
	}

	public Telefone getTelefone(int i) {
		return c[i].getNumTel();
	}

	public void setQtdClientes(int qtdClientes) {
		this.qtdClientes = qtdClientes;
	}

	public String getEndereco(int i) {
		return c[i].getEndereco();
	}

}
