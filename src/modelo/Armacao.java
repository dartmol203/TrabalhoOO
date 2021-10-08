package modelo;

/**
 * Classe de modelo de armacao
 * 
 * @author Andre Correa e Vinicius Assumpcao
 * @version 1.0
 */
public class Armacao {
	private String nomeArmacao;
	private String marcaArmacao;
	private String mateArmacao;
	private int medidaaro;
	private int idArmacao;
	private double valorArmacao;

	/**
	 * metodo construtor da classe armacao
	 * 
	 * @param n   String com nome da armacao
	 * @param mar String com a marca da armacao
	 * @param mta String com o material da armacao
	 * @param va  double com o valor da armacao
	 * @param ma  int com a medida do aro
	 * @param id  int com o id da armacao
	 */
	public Armacao(String n, String mar, String mta, double va, int ma, int id) {
		nomeArmacao = n;
		this.marcaArmacao = mar;
		medidaaro = ma;
		valorArmacao = va;
		this.mateArmacao = mta;
		this.idArmacao = id;

	}

	public String getNomeArmacao() {
		return nomeArmacao;
	}

	public void setNomeArmacao(String nomeArmacao) {
		this.nomeArmacao = nomeArmacao;
	}

	public String getMarcaArmacao() {
		return marcaArmacao;
	}

	public void setMarcaArmacao(String marcaArmacao) {
		this.marcaArmacao = marcaArmacao;
	}

	public String getMateArmacao() {
		return mateArmacao;
	}

	public void setMateArmacao(String mateArmacao) {
		this.mateArmacao = mateArmacao;
	}

	public int getIDArmacao() {
		return idArmacao;
	}

	public void setIDArmacao(int idArmacao) {
		this.idArmacao = idArmacao;
	}

	public int getMedidaaro() {
		return medidaaro;
	}

	public void setMedidaaro(int medidaaro) {
		this.medidaaro = medidaaro;
	}

	public double getValorArmacao() {
		return valorArmacao;
	}

	public void setValorArmacao(double valorArmacao) {
		this.valorArmacao = valorArmacao;
	}

}
