package lojaOculos;

import java.util.Date;

public class Funcionario extends Pessoa{//Classe Funcion�rio que herda da classe abstrata Pessoa
	
	private float salario;
	private Date dataContratacao;

	
	public float getSalario() {//Valor do sal�rio
		return salario;
	}
	public void setSalario(float salario) {//Valor do sal�rio
		this.salario = salario;
	}
	public Date getDatacontrac() {//Data da contrata��o
		return dataContratacao;
	}
	public void setDatacontrac(Date dataContratacao) {//Data da contrata��o
		this.dataContratacao = dataContratacao;
	}
	public boolean buscaFuncionarioID(String funcionarioidbuscado) {//Busca nomes dos funcion�rios para ganrantir que n�o haver�o dois iguais. funcionarioidbuscado ser� declarado na main e definido pelo usu�rio do programa
		if (id.equalsIgnoreCase(funcionarioidbuscado))
	     return true;
	     
		else
	    	 return false;
	}
		
}
