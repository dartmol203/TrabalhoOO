package lojaOculos;

public class VendaDeOculos {
    private double valorFinal;
    private String idCliente, idFuncionario, idArmacao, idVenda;
    private int idLente;

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

    public boolean buscaVendaID(String vendaidbuscado) {// Busca nomes dos funcion�rios para ganrantir que n�o
                                                        // haver�o dois iguais. funcionarioidbuscado ser�
                                                        // declarado na main e definido pelo usu�rio do programa
        if (idVenda.equalsIgnoreCase(vendaidbuscado))
            return true;
        else
            return false;
    }

}
