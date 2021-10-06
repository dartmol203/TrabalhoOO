package controle;

import modelo.*;

public class ControleDados {
	private Dados d = new Dados();

	Validador v = new Validador();

	public ControleDados() {
		d.fillWithSomeData();
	}

	public Dados getDados() {
		return d;
	}

	public void setDados(Dados d) {
		this.d = d;
	}

	public Cliente[] getClientes() {
		return this.d.getClientes();
	}

	public int getQtdClientes() {
		return this.d.getQtdClientes();
	}

	public int getQtdFuncionarios() {
		return this.d.getQtdFuncionarios();
	}

	public Funcionario[] getFuncionarios() {
		return this.d.getFuncionarios();
	}

	public int getQtdArmacao() {
		return this.d.getQtdArmacao();
	}

	public Armacao[] getArmacao() {
		return this.d.getArmacao();
	}

	public int getQntLojas() {
		return this.d.getQntLojas();
	}

	public Loja[] getLojas() {
		return this.d.getLoja();
	}

	public boolean inserirEditarFuncionarios(String[] dadosFuncionarios) {
		if (!dadosFuncionarios[3].matches("[0-9]+") || !dadosFuncionarios[4].matches("[0-9]+")
				|| !dadosFuncionarios[5].matches("[0-9]+") || !dadosFuncionarios[6].matches("[0-9]+")) {
			return false;
		} else {
			if (v.validaCpf(dadosFuncionarios[3]) && v.validaTelefone(
					new Telefone(Integer.parseInt(dadosFuncionarios[5]), Integer.parseInt(dadosFuncionarios[6])))) {

				Funcionario p = new Funcionario(dadosFuncionarios[1], dadosFuncionarios[2],
						Double.parseDouble(dadosFuncionarios[7]), dadosFuncionarios[3],
						Integer.parseInt(dadosFuncionarios[4]),
						new Telefone(Integer.parseInt(dadosFuncionarios[5]), Integer.parseInt(dadosFuncionarios[6])));

				d.inserirEditarFuncionarios(p, Integer.parseInt(dadosFuncionarios[0]));

				return true;
			} else {
				return false;
			}

		}
	}

	public boolean inserirEditarClientes(String[] dadosClientes) {
		if (!dadosClientes[4].matches("[0-9]+") || !dadosClientes[5].matches("[0-9]+")
				|| !dadosClientes[6].matches("[0-9]+")) {
			return false;
		} else {

			if (v.validaCpf(dadosClientes[3]) && v.validaTelefone(
					new Telefone(Integer.parseInt(dadosClientes[5]), Integer.parseInt(dadosClientes[6])))) {

				Cliente c = new Cliente(dadosClientes[1], dadosClientes[2], dadosClientes[7],
						Integer.parseInt(dadosClientes[4]), dadosClientes[3],
						new Telefone(Integer.parseInt(dadosClientes[5]), Integer.parseInt(dadosClientes[6])));

				d.inserirEditarClientes(c, Integer.parseInt(dadosClientes[0]));

				return true;
			} else {
				return false;
			}

		}
	}

	public boolean inserirEditarArmacao(String[] dadosArmacao) {
		if (!dadosArmacao[3].matches("[0-9]+") || !dadosArmacao[4].matches("[0-9]+")
				|| !dadosArmacao[5].matches("[0-9.]+")) {
			return false;
		} else {
			Armacao a = new Armacao(dadosArmacao[6], dadosArmacao[1], dadosArmacao[2],
					Double.parseDouble(dadosArmacao[5]), Integer.parseInt(dadosArmacao[4]),
					Integer.parseInt(dadosArmacao[3]));
			d.inserirEditarArmacao(a, Integer.parseInt(dadosArmacao[0]));
			return true;
		}
	}

	public boolean removerCliente(int i) {

		String clienteRemovido = d.getClientes()[i].getNome();

		if (i == (d.getQtdClientes() - 1)) { // O Clientes a ser removido est� no final do array
			d.setQtdClientes(d.getQtdClientes() - 1);
			d.getClientes()[d.getQtdClientes()] = null;
			return true;
		} else { // o Cliente a ser removido est� no meio do array
			int cont = 0;
			while (d.getClientes()[cont].getNome().compareTo(clienteRemovido) != 0) {
				cont++;
			}
			// Rotina swap
			for (int j = cont; j < d.getQtdClientes() - 1; j++) {
				d.getClientes()[j] = null;
				d.getClientes()[j] = d.getClientes()[j + 1];
			}
			d.getClientes()[d.getQtdClientes()] = null;
			d.setQtdClientes(d.getQtdClientes() - 1);
			return true;
		}
	}

	public boolean removerFuncionarios(int i) {

		String funcionarioRemovido = d.getFuncionarios()[i].getNome();

		if (i == (d.getQtdFuncionarios() - 1)) { // O funcionario a ser removido est� no final do array
			d.setQtdFuncionarios(d.getQtdFuncionarios() - 1);
			d.getFuncionarios()[d.getQtdFuncionarios()] = null;
			return true;
		} else { // o funcionario a ser removido est� no meio do array
			int cont = 0;
			while (d.getFuncionarios()[cont].getNome().compareTo(funcionarioRemovido) != 0)
				cont++;
			// Rotina swap
			for (int j = cont; j < d.getQtdFuncionarios() - 1; j++) {
				d.getFuncionarios()[j] = null;
				d.getFuncionarios()[j] = d.getFuncionarios()[j + 1];
			}
			d.getFuncionarios()[d.getQtdFuncionarios()] = null;
			d.setQtdFuncionarios(d.getQtdFuncionarios() - 1);
			return true;
		}
	}

	public boolean removerArmacao(int i) {
		String armacaoRemovida = d.getArmacao()[i].getNomeArmacao();

		if (i == (d.getQtdArmacao() - 1)) { // A Armacao a ser removida est� no final do array
			d.setQtdArmacao(d.getQtdArmacao() - 1);
			d.getArmacao()[d.getQtdArmacao()] = null;
			return true;
		} else { // a Armacao a ser removido est� no meio do array
			int cont = 0;

			while (d.getArmacao()[cont].getNomeArmacao().compareTo(armacaoRemovida) != 0) {
				cont++;
			}
			// Rotina swap
			for (int j = cont; j < d.getQtdArmacao() - 1; j++) {
				d.getArmacao()[j] = null;
				d.getArmacao()[j] = d.getArmacao()[j + 1];
			}
			d.getArmacao()[d.getQtdArmacao()] = null;
			d.setQtdArmacao(d.getQtdArmacao() - 1);
			return true;
		}
	}

	public boolean inserirEditarLojas(String[] novoDado) {
		if (!novoDado[3].matches("[0-9]+") || !novoDado[4].matches("[0-9]+") || !novoDado[5].matches("[0-9]+")) {
			return false;
		} else {
			if (v.validaCep(Integer.parseInt(novoDado[3]))
					&& v.validaTelefone(new Telefone(Integer.parseInt(novoDado[4]), Integer.parseInt(novoDado[5])))) {

				Loja l = new Loja(novoDado[1], novoDado[2], Integer.parseInt(novoDado[3]),
						new Telefone(Integer.parseInt(novoDado[4]), Integer.parseInt(novoDado[5])));

				d.inserirEditarLoja(l, Integer.parseInt(novoDado[0]));
				return true;
			} else {
				return false;
			}
		}
	}

	public int getQntLentes() {
		return this.d.getQntLentes();
	}

	public Lente[] getLentes() {
		return this.d.getLentes();
	}

	public boolean inserirEditarLente(String[] novoDado) {
		if (!novoDado[5].matches("[0-9]+") || !novoDado[6].matches("[0-9.]+") || !novoDado[7].matches("[0-9.]+")
				|| !novoDado[11].matches("[0-9]+")) {

			return false;
		} else {
			if (v.validaData(novoDado[2])) {

				Lente l = new Lente(Double.parseDouble(novoDado[7]), Double.parseDouble(novoDado[6]),
						Integer.parseInt(novoDado[5]), novoDado[4], novoDado[8], novoDado[3], novoDado[9],
						Boolean.parseBoolean(novoDado[10]), novoDado[2], Integer.parseInt(novoDado[11]), novoDado[1]);
				d.inserirEditarlente(l, Integer.parseInt(novoDado[0]));
				return true;
			} else {
				return false;
			}
		}

	}

	public boolean removerLente(int i) {
		String LenteRemovida = d.getLentes()[i].getApelidoLente();

		if (i == (d.getQntLentes() - 1)) { // A lente a ser removida est� no final do array
			d.setQntLentes(d.getQntLentes() - 1);
			d.getLentes()[d.getQntLentes()] = null;
			return true;
		} else { // a lente a ser removido est� no meio do array
			int cont = 0;

			while (d.getLentes()[cont].getApelidoLente().compareTo(LenteRemovida) != 0) {
				cont++;
			}
			// Rotina swap
			for (int j = cont; j < d.getQntLentes() - 1; j++) {
				d.getLentes()[j] = null;
				d.getLentes()[j] = d.getLentes()[j + 1];
			}
			d.getLentes()[d.getQntLentes()] = null;
			d.setQntLentes(d.getQntLentes() - 1);
			return true;
		}
	}

	public Venda[] getVendas() {
		return this.d.getVendas();
	}

	public int getQntVendas() {
		return this.d.getQntVendas();
	}

	public boolean inserirEditarVenda(String[] novoDado) {
		if (!novoDado[8].matches("[0-9.]+")) {

			return false;
		} else {
			Venda v = new Venda(Double.parseDouble(novoDado[8]), novoDado[5], novoDado[3], novoDado[2], novoDado[6],
					novoDado[4], Integer.parseInt(novoDado[1]));

			d.inserirEditarVenda(v, Integer.parseInt(novoDado[0]));
			return true;
		}
	}

	public boolean removerVenda(int posicao) {
		String vendaRemovida = d.getVendas()[posicao].getApelidoVenda();

		if (posicao == (d.getQntVendas() - 1)) { // A lente a ser removida est� no final do array
			d.setQntVendas(d.getQntVendas() - 1);
			d.getVendas()[d.getQntVendas()] = null;
			return true;
		} else { // a lente a ser removido est� no meio do array
			int cont = 0;

			while (d.getVendas()[cont].getApelidoVenda().compareTo(vendaRemovida) != 0) {
				cont++;
			}
			// Rotina swap
			for (int j = cont; j < d.getQntVendas() - 1; j++) {
				d.getVendas()[j] = null;
				d.getVendas()[j] = d.getVendas()[j + 1];
			}
			d.getVendas()[d.getQntVendas()] = null;
			d.setQntVendas(d.getQntVendas() - 1);
			return true;
		}
	}

}
