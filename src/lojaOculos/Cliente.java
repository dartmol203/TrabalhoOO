package lojaOculos;

import java.util.Date;


public class Cliente extends Pessoa{//Classe Cliente que herda da classe abstrata Pessoa
	
	private Date dataPrimeiraCompra;
	
	public Date getDataprimeira() {//Primeira compra do cliente
		return dataPrimeiraCompra;
	}
	public void setDataprimeira(Date dataPrimeiraCompra) {//Primeira compra do cliente
		this.dataPrimeiraCompra = dataPrimeiraCompra;
	}
	
	public boolean buscaClienteID(String clienteidbuscado) {//Busca nomes dos clientes para ganrantir que n�o haver�o dois iguais. clienteidbuscado ser� declarado na main e definido pelo usu�rio do programa
		if (id.equalsIgnoreCase(clienteidbuscado))
	     return true;
	     
		else
	    	 return false;
	}

}
