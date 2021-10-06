package controle;

import modelo.Loja;
import modelo.Telefone;

/**
 * metodo para salvar os dados da loja
 * 
 * @param d
 */
public class ControleLoja {
    private Loja[] lControl;
    private int qntLojas;

    /**
     * metodo para salvar os dados da loja
     * 
     * @param d
     */
    public ControleLoja(ControleDados dados) {
        lControl = dados.getLojas();
        qntLojas = dados.getQntLojas();
    }

    public int getQntLojas() {
        return qntLojas;
    }

    public void setQntLojas(int qntLojas) {
        this.qntLojas = qntLojas;
    }

    /**
     * metodo que retorna os nomes das lojas em um vetor de Strings
     * 
     * @return vetor com nomes das lojas
     */
    public String[] getNomeLojas() {
        String[] s = new String[qntLojas];

        for (int i = 0; i < qntLojas; i++) {
            s[i] = lControl[i].getNomeLoja();
        }

        return s;
    }

    public String getNomeL(int i) {
        return lControl[i].getNomeLoja();
    }

    public int getCEP(int i) {
        return lControl[i].getCep();
    }

    public Telefone getTelefone(int i) {
        return lControl[i].getTelefone();
    }

    public String getEndereco(int i) {
        return lControl[i].getEndereco();
    }
}
