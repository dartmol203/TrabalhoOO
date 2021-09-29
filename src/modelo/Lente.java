package modelo;

public class Lente {

    // declaracoes
    private double grauLente;
    private double valorLente;
    private int idLente;
    private String formatoLente;
    private String indMedica;
    private String focoLente;
    private String laboratorio;
    private boolean protecaoUV;
    private String dataProducao;
    private int idArmacao;
    private String apelidoLente;

    /**
     * 
     * constructor
     * 
     * @param grauLente
     * @param valorLente
     * @param idLente
     * @param formatoLente
     * @param indMedica
     * @param focoLente
     * @param laboratorio
     * @param protecaoUV
     * @param dataProducao
     * @param idArmacao
     */
    public Lente(double grauLente, double valorLente, int idLente, String formatoLente, String indMedica,
            String focoLente, String laboratorio, boolean protecaoUV, String dataProducao, int idArmacao) {

        this.grauLente = grauLente;
        this.valorLente = valorLente;
        this.idLente = idLente;
        this.formatoLente = formatoLente;
        this.indMedica = indMedica;
        this.focoLente = focoLente;
        this.laboratorio = laboratorio;
        this.protecaoUV = protecaoUV;
        this.dataProducao = dataProducao;
        this.idArmacao = idArmacao;
    }

    // getters e setters
    public double getGrauLente() {
        return grauLente;
    }

    public void setGrauLente(double grauLente) {
        this.grauLente = grauLente;
    }

    public double getValorLente() {
        return valorLente;
    }

    public void setValorLente(double valorLente) {
        this.valorLente = valorLente;
    }

    public int getIdLente() {
        return idLente;
    }

    public void setIdLente(int idLente) {
        this.idLente = idLente;
    }

    public String getFormatoLente() {
        return formatoLente;
    }

    public void setFormatoLente(String formatoLente) {
        this.formatoLente = formatoLente;
    }

    public String getIndMedica() {
        return indMedica;
    }

    public void setIndMedica(String indMedica) {
        this.indMedica = indMedica;
    }

    public String getFocoLente() {
        return focoLente;
    }

    public void setFocoLente(String focoLente) {
        this.focoLente = focoLente;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public boolean isProtecaoUV() {
        return protecaoUV;
    }

    public void setProtecaoUV(boolean protecaoUV) {
        this.protecaoUV = protecaoUV;
    }

    public String getDataProducao() {
        return dataProducao;
    }

    public void setDataProducao(String dataProducao) {
        this.dataProducao = dataProducao;
    }

    public int getIdArmacao() {
        return idArmacao;
    }

    public void setIdArmacao(int idArmacao) {
        this.idArmacao = idArmacao;
    }

    public String getApelidoLente() {
        return apelidoLente;
    }

    public void setApelidoLente(String apelidoLente) {
        this.apelidoLente = apelidoLente;
    }

    // metodo de busca
    public boolean buscaLenteID(int lenteBuscada) {// Busca identifica��es das lentes
        if (idLente == lenteBuscada)
            return true;

        else
            return false;
    }

}
