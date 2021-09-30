package modelo;

public class Venda {
    private double valorFinal;
    private String apelidoVenda;
    private int idLente, idCliente, idArmacao, idFuncionario, idVenda;

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

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public int getIdArmacao() {
        return idArmacao;
    }

    public void setIdArmacao(int idArmacao) {
        this.idArmacao = idArmacao;
    }

    public int getIdLente() {
        return idLente;
    }

    public void setIdLente(int idLente) {
        this.idLente = idLente;
    }

    public Venda(double valorFinal, int idCliente, int idFuncionario, int idArmacao, String apelidoVenda, int idLente,
            int idVenda) {
        this.valorFinal = valorFinal;
        this.idCliente = idCliente;
        this.idFuncionario = idFuncionario;
        this.idArmacao = idArmacao;
        this.apelidoVenda = apelidoVenda;
        this.idLente = idLente;
        this.idVenda = idVenda;
    }

    // metodo de busca
    public boolean buscaVendaID(int vendaidbuscado) {

        if (idVenda == vendaidbuscado)
            return true;
        else
            return false;
    }

}
