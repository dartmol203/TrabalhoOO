package controle;

import modelo.Venda;

/**
 * Classe de Controle de dados da venda
 * 
 * @author Andre Correa e Vinicius Assumpcao
 * @version 1.0
 */
public class ControleVenda {

    private Venda[] vendas;
    private int qntVendas;

    /**
     * metodo para salvar os dados da venda
     * 
     * @param d
     */
    public ControleVenda(ControleDados d) {
        vendas = d.getVendas();
        qntVendas = d.getQntVendas();
    }

    /**
     * metodo que retorna os nomes das vendas em um vetor de Strings
     * 
     * @return vetor com nomes das vendas
     */
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
