package lojaOculos;

public class VendaDeOculos {

    // declaracoes
    private double valorFinal;
    private String idCliente, idFuncionario, idArmacao, idVenda;
    private int idLente;

    // getters e setters
    public String getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(String idVenda) {
        this.idVenda = idVenda;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(String idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public int getIdLente() {
        return idLente;
    }

    public void setIdLente(int idLente) {
        this.idLente = idLente;
    }

    public String getIdArmacao() {
        return idArmacao;
    }

    public void setIdArmacao(String idArmacao) {
        this.idArmacao = idArmacao;
    }

    // metodo de busca
    public boolean buscaVendaID(String vendaidbuscado) {

        if (idVenda.equalsIgnoreCase(vendaidbuscado))
            return true;
        else
            return false;
    }

}
