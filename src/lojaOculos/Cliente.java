package lojaOculos;

public class Cliente extends Pessoa {// Classe Cliente que herda da classe abstrata Pessoa

	// declaracoes
	private String dataPrimeiraCompra;

	// getters e setters
	public String getDataprimeira() {// Primeira compra do cliente
		return dataPrimeiraCompra;
	}

	public void setDataprimeira(String dataPrimeiraCompra) {// Primeira compra do cliente
		this.dataPrimeiraCompra = dataPrimeiraCompra;
	}

	// metodo de busca
	public boolean buscaClienteID(String clienteidbuscado) {

		if (id.equalsIgnoreCase(clienteidbuscado))

			return true;

		else
			return false;
	}

}
