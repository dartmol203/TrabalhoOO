package controle;

import modelo.Lente;

public class ControleLente {
    private Lente[] lentes;
    private int qntLentes;

    public ControleLente(ControleDados d) {
        lentes = d.getLentes();
        qntLentes = d.getQntLentes();
    }

    public String[] getApelidoLente() {
        String[] apelido = new String[qntLentes];
        for (int i = 0; i < qntLentes; i++) {
            apelido[i] = lentes[i].getApelidoLente();
        }
        return apelido;
    }

    public int getIdLente(int i) {

        return lentes[i].getIdArmacao();
    }

    public int getQntLentes() {
        return qntLentes;
    }

    public void setQntLentes(int qntLentes) {
        this.qntLentes = qntLentes;
    }

    public double getGrauLente(int i) {
        return lentes[i].getGrauLente();

    }

    public double getValorLente(int i) {
        return lentes[i].getValorLente();
    }

    public String getFormatoLente(int i) {
        return lentes[i].getFormatoLente();
    }

    public String getIndMedica(int i) {
        return lentes[i].getIndMedica();
    }

    public String getFocoLente(int i) {
        return lentes[i].getFocoLente();
    }

    public String getLaboratorio(int i) {
        return lentes[i].getLaboratorio();
    }

    public boolean getProtecaoUV(int i) {
        return lentes[i].isProtecaoUV();
    }

    public String getDataProducao(int i) {
        return lentes[i].getDataProducao();
    }

    public int getIdArmacao(int i) {
        return lentes[i].getIdArmacao();
    }
}
