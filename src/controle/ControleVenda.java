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

    public String getIdLente(int i) {
        return vendas[i].getNomeLente();
    }

    public String getIdCliente(int i) {
        return vendas[i].getNomeCliente();
    }

    public String getIdArmacao(int i) {
        return vendas[i].getNomeArmacao();
    }

    public String getIdFuncionario(int i) {
        return vendas[i].getNomeFuncionario();
    }

    public int getIdVenda(int i) {
        return vendas[i].getIdVenda();
    }
}
