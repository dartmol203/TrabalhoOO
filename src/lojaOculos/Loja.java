package lojaOculos;

import java.util.Arrays;

public class Loja {
  
  private int cep;
  private int telefone;
  private VendaDeOculos[] historicoVendas = new VendaDeOculos[50];
  private String nomeLoja;
  //private armacaoDeOculos estoqueArmacao[];
  //private Cliente clientes[];
  //private funcionario funcionarios[];

  private boolean lojaCadastrada;
  private int qntClientes=0;
  private int qntFuncionarios = 0;
  private int qntVendas=0;

  public int getCep() {
  return cep;
  }

  public void setCep(int cep) {
  this.cep = cep;
  }

  public int getTelefone() {
  return telefone;
  }

  public void setTelefone(int telefone) {
  this.telefone = telefone;
  }

  public VendaDeOculos[] getHistoricoVendas() {
  return historicoVendas;
  }

  public void setHistoricoVendas(VendaDeOculos[] historicoVendas) {
  this.historicoVendas = historicoVendas;
  }

  public String getNomeLoja() {
      return nomeLoja;
  }

  public void setNomeLoja(String nomeLoja) {
      this.nomeLoja = nomeLoja;
  }

  public boolean isLojaCadastrada() {
    return lojaCadastrada;
  }

  public void setLojaCadastrada(boolean lojaCadastrada) {
    this.lojaCadastrada = lojaCadastrada;
  }

  public int getQntClientes() {
    return qntClientes;
  }

  public void setQntClientes(int qntClientes) {
    this.qntClientes = qntClientes;
  }

  public int getQntFuncionarios() {
    return qntFuncionarios;
  }

  public void setQntFuncionarios(int qntFuncionarios) {
    this.qntFuncionarios = qntFuncionarios;
  }

  public int getQntVendas() {
    return qntVendas;
  }

  public void setQntVendas(int qntVendas) {
    this.qntVendas = qntVendas;
  }

/*
  public armacaoDeOculos[] getEstoqueArmacao() {
  return estoqueArmacao;
  }

  public void setEstoqueArmacao(armacaoDeOculos[] estoqueArmacao) {
  this.estoqueArmacao = estoqueArmacao;
  }

  public Cliente[] getClientes() {
  return clientes;
  }

  public void setClientes(Cliente[] clientes) {
  this.clientes = clientes;
  }

  public funcionario[] getFuncionarios() {
  return funcionarios;
  } 

  public void setFuncionarios(funcionario[] funcionarios) {
  this.funcionarios = funcionarios;
  }
  */
  
  

}
