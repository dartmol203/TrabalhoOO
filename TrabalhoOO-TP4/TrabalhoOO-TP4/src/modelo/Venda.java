package modelo;

/** Classe de armazenamento de dados da venda
 * @author Vinicius Assumpção e André Corréa 
 * @versão 1.0
 */

public class Venda {
    private double valorFinal;
    private String apelidoVenda, nomeLente, nomeCliente, nomeArmacao, nomeFuncionario;
    private int idVenda;

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

    public String getNomeLente() {
        return nomeLente;
    }

    public void setNomeLente(String nomeLente) {
        this.nomeLente = nomeLente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeArmacao() {
        return nomeArmacao;
    }

    public void setNomeArmacao(String nomeArmacao) {
        this.nomeArmacao = nomeArmacao;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    
    /**Definição de diferentes atributos da classe venda
     * @param valorFinal double que indica valor final da venda
     * @param idCliente String que indica identificação do cliente relacionado
     * @param idFuncionario String que indica identificação do funcionário relacionado
     * @param idArmacao String que indica identificação da armação relacionada
     * @param apelidoVenda String que indica identificação alternativa da venda
     * @param idLente String que indica identificação da lente relacionada
     * @param idVenda String que indica identificação da venda
     */ 
    
    public Venda(double valorFinal, String idCliente, String idFuncionario, String idArmacao, String apelidoVenda,
            String idLente, int idVenda) {
        this.valorFinal = valorFinal;
        this.nomeCliente = idCliente;
        this.nomeFuncionario = idFuncionario;
        this.nomeArmacao = idArmacao;
        this.apelidoVenda = apelidoVenda;
        this.nomeLente = idLente;
        this.idVenda = idVenda;
    }

    /**Busca pelo id da venda registrada
     * @param vendaidbuscado
     * @return verdadeiro ou falso,o que indica se a venda foi de fato cadastrada
     */
    public boolean buscaVendaID(int vendaidbuscado) {

        if (idVenda == vendaidbuscado)
            return true;
        else
            return false;
    }

}
