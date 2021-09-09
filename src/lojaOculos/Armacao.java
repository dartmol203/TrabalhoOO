package lojaOculos;

public class Armacao {//Classe arma��o
	
	
	private String marcaArmacao,matearmacao,modelorosto,idArmacao;
	private int medidaaro;
	
	
	public String getMarcaArmacao() {//Marca da arma��o
		return marcaArmacao;
	}
	public void setMarcaArmacao(String marcaArmacao) {//Marca da arma��o
		this.marcaArmacao = marcaArmacao;
	}
	public String getMatArmacao() {//Material da arma��o
		return matearmacao;
	}
	public void setMatArmacao(String matearmacao) {//Material da arma��o
		this.matearmacao = matearmacao;
	}
	public String getModeloArmacao() {//Modelo da arma��o
		return modelorosto;
	}
	public void setModeloArmacao(String modelorosto) {//Modelo da arma��o
		this.modelorosto = modelorosto;
	}
	public String getIDarmacao() {//Identifica��o da arma��o
		return idArmacao;
	}
	public void setIDarmacao(String idArmacao) {//Identifica��o da arma��o
		this.idArmacao = idArmacao;
	}
	public int getMedidaaro() {//Medida do aro da arma��o
		return medidaaro;
	}
	public void setMedidaaro(int medidaaro) {//Medida do aro da arma��o
		this.medidaaro = medidaaro;
	}
	public boolean buscaArmacaoID(String armacaoidbuscado) {//Busca identifica��es das armac��es para ganrantir que n�o haver�o dois iguais. armacaoidbuscado ser� declarado na main e definido pelo usu�rio do programa
		if (idArmacao.equalsIgnoreCase(armacaoidbuscado))
	     return true;
	     
		else
	    	 return false;
	}
	
	
	
	
	

}
