package modelo;

public class Venda {
    private double valorFinal;
    private String idCliente, idFuncionario, idArmacao, apelidoVenda;
    private int idLente, idVenda;

    public String getApelidoVenda() {
        return apelidoVenda;
    }

    public void setApelidoVenda(String apelidoVenda) {
        this.apelidoVenda = apelidoVenda;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
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

    public String getIdArmacao() {
        return idArmacao;
    }

    public void setIdArmacao(String idArmacao) {
        this.idArmacao = idArmacao;
    }

    public int getIdLente() {
        return idLente;
    }

    public void setIdLente(int idLente) {
        this.idLente = idLente;
    }

    // metodo de busca
    public boolean buscaVendaID(int vendaidbuscado) {

        if (idVenda == vendaidbuscado)
            return true;
        else
            return false;
    }

}
