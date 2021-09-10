package lojaOculos;

public class LenteDeOculos {

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
    private String idArmacao;

    // getters e setters
    public double getGrau() {

        return grauLente;
    }

    public void setGrau(double grauLente) {
        this.grauLente = grauLente;
    }

    public int getId() {

        return idLente;
    }

    public void setId(int idLente) {

        this.idLente = idLente;
    }

    public String getFormato() {

        return formatoLente;
    }

    public void setFormato(String formatoLente) {

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

    public boolean getprotecaoUV() {

        return protecaoUV;
    }

    public void setprotecaoUV(boolean protecaoUV) {

        this.protecaoUV = protecaoUV;
    }

    public String getDataProducao() {

        return dataProducao;
    }

    public void setDataProducao(String dataProducao) {

        this.dataProducao = dataProducao;
    }

    public double getValorLente() {
        return valorLente;
    }

    public void setValorLente(double valorLente) {
        this.valorLente = valorLente;
    }

    public String getIdArmacao() {
        return idArmacao;
    }

    public void setIdArmacao(String idArmacao) {
        this.idArmacao = idArmacao;
    }

    // metodo de busca
    public boolean buscaLenteID(int lenteBuscada) {// Busca identifica��es das lentes
        if (idLente == lenteBuscada)
            return true;

        else
            return false;
    }

}
