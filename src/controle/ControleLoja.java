package controle;

import modelo.Loja;
import modelo.Telefone;

public class ControleLoja {
    private Loja[] lControl;
    private int qntLojas;

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
