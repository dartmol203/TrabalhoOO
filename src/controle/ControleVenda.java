package controle;

import modelo.Venda;

public class ControleVenda {

    private Venda[] vendas;
    private int qntVendas;

    public ControleVenda(ControleDados d) {
        vendas = d.getVendas();
        qntVendas = d.getQntVendas();
    }

    public String[] getApelidoVenda() {
        String[] apelido = new String[qntVendas];
        for (int i = 0; i < qntVendas; i++) {
            apelido[i] = vendas[i].getApelidoVenda();
        }
        return apelido;
    }

    public double getValorFinal(int i) {
        return vendas[i].getValorFinal();
    }

    public int getQntVendas() {
        return qntVendas;
    }

    public String getApelidoVenda(int i) {
        return vendas[i].getApelidoVenda();
    }

    public int getIdLente(int i) {
        return vendas[i].getIdLente();
    }

    public int getIdCliente(int i) {
        return vendas[i].getIdCliente();
    }

    public int getIdArmacao(int i) {
        return vendas[i].getIdArmacao();
    }

    public int getIdFuncionario(int i) {
        return vendas[i].getIdFuncionario();
    }

    public int getIdVenda(int i) {
        return vendas[i].getIdVenda();
    }
}
