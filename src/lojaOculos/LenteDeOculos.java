package lojaOculos;

import java.util.Date;

public class LenteDeOculos {
    private float grauLente;
    private double valorLente;
    private int idLente;
    private String formatoLente;
    private String indMedica;
    private String focoLente;
    private String laboratorio;
    private boolean protecaoUV;
    private Date dataProducao;
    //private armacaoDeOculos oculos;

    public float getGrau(){

        return grauLente;
    }

    public void setGrau(float grauLente){
        this.grauLente = grauLente;
    }
    
    public int getId(){

        return idLente;
    }

    public void setId( int idLente){
        
        this.idLente = idLente;
    }

    public String getFormato(){

        return formatoLente;
    }
    
    public void setFormato(String formatoLente){
        
        this.formatoLente = formatoLente;
    }

    public String getIndMedica(){

        return indMedica;
    }
    
    public void setIndMedica(String indMedica){
        
        this.indMedica = indMedica;
    }

    public String getFocoLente(){

        return focoLente;
    }
    
    public void setFocoLente(String focoLente){
        
        this.focoLente = focoLente;
    }

    public String getLaboratorio(){

        return laboratorio;
    }
    
    public void setLaboratorio( String laboratorio){
        
        this.laboratorio = laboratorio;
    }

    public boolean getprotecaoUV(){

        return protecaoUV;
    }
    
    public void setprotecaoUV( boolean protecaoUV){
        
        this.protecaoUV = protecaoUV;
    }

    public Date getDataProducao(){

        return dataProducao;
    }
    
    public void setDataProducao( Date dataProducao){
        
        this.dataProducao = dataProducao;
    }

    public double getValorLente() {
        return valorLente;
    }

    public void setValorLente(double valorLente) {
        this.valorLente = valorLente;
    }

    /*public armacaoDeOculos getArmacaoDeOculos(){

        return oculos;
    }
    
    public void setArmacaoDeOculos( armacaoDeOculos oculos){
        
        this.oculos = oculos;
    }
    */

    

}
