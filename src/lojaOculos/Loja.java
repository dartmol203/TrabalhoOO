package lojaOculos;


import java.util.Scanner;

public class Loja {
  static Scanner ler = new Scanner(System.in);
  
  private int cep;
  private int telefone;
  private VendaDeOculos[] historicoVendas = new VendaDeOculos[50];
  private String nomeLoja;
  private Armacao[] estoqueArmacao = new Armacao[50];
  private Cliente[] clientes = new Cliente[50];
  private Funcionario[] funcionarios = new Funcionario[10];
  private LenteDeOculos[] lentes = new LenteDeOculos[50];

  private boolean lojaCadastrada;
  private int qntClientes=0;
  private int qntFuncionarios = 0;
  private int qntVendas=0;
  private int qntArmacao = 0;
  private int qntLentes = 0;

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

  public Armacao[] getEstoqueArmacao() {
  return estoqueArmacao;
  }

  public void setEstoqueArmacao(Armacao[] estoqueArmacao) {
  this.estoqueArmacao = estoqueArmacao;
  }

  public Cliente[] getClientes() {
  return clientes;
  }

  public void setClientes(Cliente[] clientes) {
  this.clientes = clientes;
  }

  public Funcionario[] getFuncionarios() {
  return funcionarios;
  } 

  public void setFuncionarios(Funcionario[] funcionarios) {
  this.funcionarios = funcionarios;
  }
  
  public int getQntArmacao() {
    return qntArmacao;
  }

  public void setQntArmacao(int qntArmacao) {
    this.qntArmacao = qntArmacao;
  }

  public int getQntLentes() {
    return qntLentes;
  }

  public void setQntLentes(int qntLentes) {
    this.qntLentes = qntLentes;
  }

  public static Loja preCadastro(Loja loja){
    
    loja.cep = 87654321;
    loja.telefone = 12345678;
    loja.nomeLoja = "oticas wanderer";
    loja.setLojaCadastrada(true);
    
    for(int i = 0; i<=9; i++){
      loja.clientes[i] = new Cliente();
      loja.clientes[i].setCPF("111.111.111-" + i*10);; 
      loja.clientes[i].setNome("cliente" + (i + 1));;
      loja.clientes[i].setTelefone(111111111*i);
      loja.clientes[i].setEndereco( "endereco" +(i+1));;
      loja.clientes[i].setID("id" + (i+1)); ;
      loja.clientes[i].setDataaniver("01/0"+(i+1)+"/2001");;
      loja.clientes[i].setDataprimeira("01/10/2021");
    }

    for(int i = 0; i<=4; i++){
      loja.funcionarios[i] = new Funcionario();
      loja.funcionarios[i].setCPF("111.111.111-" + i*10);; 
      loja.funcionarios[i].setNome("funcionario" + (i + 1));;
      loja.funcionarios[i].setTelefone(111111111*i);
      loja.funcionarios[i].setEndereco( "endereco" +(i+1));;
      loja.funcionarios[i].setID("id" + (i+1)); ;
      loja.funcionarios[i].setDataaniver("01/0"+(i+1)+"/2001");;
      loja.funcionarios[i].setDatacontrac("30/9/2021");
      loja.funcionarios[i].setSalario((float) 1500.95);
    }
    loja.setQntClientes(10);
    loja.setQntFuncionarios(5);

    for(int i = 0; i <=4; i++){
      loja.estoqueArmacao[i] = new Armacao();
      loja.estoqueArmacao[i].setMarcaArmacao("marca"+(i+1));
      loja.estoqueArmacao[i].setMatArmacao("material armacao" +(1+i));
      loja.estoqueArmacao[i].setIDarmacao("idArmacao"+(1+i));
      loja.estoqueArmacao[i].setModeloArmacao("modelorosto"+(i+1));
      loja.estoqueArmacao[i].setMedidaaro(10+0.1*i);
      loja.estoqueArmacao[i].setValorArmacao(500 + 15.15*(i+1));

    }

    for(int i = 0; i<=4; i++){
      loja.lentes[i] = new LenteDeOculos();
      loja.lentes[i].setDataProducao("01/0"+(i+1)+"/2022");
      loja.lentes[i].setFocoLente("monofocal");
      loja.lentes[i].setFormato("quadrada");
      loja.lentes[i].setGrau(0.5*(i+1));
      loja.lentes[i].setId(500+i);
      loja.lentes[i].setIdArmacao(loja.estoqueArmacao[i].getIDarmacao());
      loja.lentes[i].setIndMedica("correcao de estrabismo");
      loja.lentes[i].setLaboratorio("Hoya");
      loja.lentes[i].setValorLente(500*(i+1.1));
      loja.lentes[i].setprotecaoUV(true);

    }

    for(int i = 0; i<=4; i++){
      loja.historicoVendas[i] = new VendaDeOculos();
      loja.historicoVendas[i].setIdCliente("idC" + (i+1));
      loja.historicoVendas[i].setIdFuncionario("idF" + (i+1));
      loja.historicoVendas[i].setIdLente(loja.lentes[i].getId());
      loja.historicoVendas[i].setIdArmacao("idArmacao"+(1+i));
      loja.historicoVendas[i].setValorFinal(loja.lentes[i].getValorLente() + loja.estoqueArmacao[i].getValorArmacao());

    }

    loja.setQntVendas(5);
    loja.setQntArmacao(5);
    loja.setQntLentes(5);
    
    return loja;
  }

  public Loja cadastroLoja(Loja loja){
    System.out.println("vamos cadastrar a sua loja!");
    System.out.println("por favor digite o nome da loja:");
    loja.setNomeLoja(ler.nextLine());
    System.out.println("por favor digite o CEP da loja:");
    loja.setCep(ler.nextInt());
    ler.nextLine();
    System.out.println("por favor digite o telefone da loja:");
    loja.setTelefone(ler.nextInt());
    ler.nextLine();
    loja.setLojaCadastrada(true);

    return loja;
  }

  public Loja editarLoja(Loja loja){
    int opcMenuEdit = 0;

    System.out.println("essas sao as informacoes atuais:");
    System.out.println(loja.toString());
    System.out.println("gostaria de alterar qual informacao? digite o numero desejado");
    do{
      System.out.println("-------------------------------------------------------");
      System.out.println("1- nome da loja ");
      System.out.println("2- CEP");
      System.out.println("3- Telefone");
      System.out.println("(para alterar outras informacoes va no menu especifico)");
      System.out.println("9- encerrar as alteracoes");
      System.out.println("-------------------------------------------------------");
      System.out.println("por favor digite a opcao que desejar: ");
      
      opcMenuEdit = ler.nextInt();
      ler.nextLine();

      switch (opcMenuEdit){
          case 1:
            System.out.println("por favor, digite o novo nome:");
            loja.setNomeLoja(ler.nextLine());          
            break;
          case 2:
            System.out.println("por favor, digite o novo CEP:");
            loja.setCep(ler.nextInt());
            ler.nextLine();
            break;
          case 3:
            System.out.println("por favor, digite o novo telefone:");
            loja.setTelefone(ler.nextInt());
            ler.nextLine();ler.nextLine();
            break;
          case 9:
            System.out.println("essas sao as novas informacoes:");
            loja.toString();
            break;
          default:
            System.out.println("opcao invalida, por favor digite um valor valido:");
      }
  } while (opcMenuEdit!= 9);

    return loja;
  }

  public Loja cadastroCliente(Loja loja){

    loja.clientes[getQntClientes()] = new Cliente();
    System.out.println("por favor, digite o nome do cliente:");
    loja.clientes[getQntClientes()].setNome(ler.nextLine());
    System.out.println("por favor, digite o cpf do cliente:");
    loja.clientes[getQntClientes()].setCPF(ler.nextLine());
    System.out.println("por favor, digite o telefone do cliente:");
    loja.clientes[getQntClientes()].setTelefone(ler.nextInt());
    ler.nextLine();
    System.out.println("por favor, digite o endereco do cliente:");
    loja.clientes[getQntClientes()].setEndereco(ler.nextLine());
    System.out.println("por favor, digite o ID do cliente:");
    loja.clientes[getQntClientes()].setID(ler.nextLine());
    System.out.println("por favor, digite a data de aniversario: (dd/mm/aaaa)");
    loja.clientes[getQntClientes()].setDataaniver(ler.nextLine());
    System.out.println("por favor, digite a data de primeira compra: (dd/mm/aaaa)");
    loja.clientes[getQntClientes()].setDataprimeira(ler.nextLine());

    setQntClientes(getQntClientes()+1);

    return loja;
  }

  public void showClientes(Loja loja){
    for(int i=0; i<getQntClientes(); i++){
      System.out.println("--------------------------------------");
      System.out.println("nome            : " + loja.clientes[i].getNome());
      System.out.println("CPF             : " + loja.clientes[i].getCPF());
      System.out.println("telefone        : " + loja.clientes[i].getTelefone());
      System.out.println("endereco        : " + loja.clientes[i].getEndereco());
      System.out.println("id              : " + loja.clientes[i].getID());
      System.out.println("aniversario     : " + loja.clientes[i].getDataaniver());
      System.out.println("primeira compra : " + loja.clientes[i].getDataprimeira());
      System.out.println("--------------------------------------");
    }
  }

  @Override
  public String toString() {
    return " o CEP da loja "+nomeLoja+" e: " + cep  + "\n o numero de telefone da loja e: "
     + telefone +"\n tem " + qntClientes + " clientes cadastrados "+ "\n tem "
     + qntFuncionarios + " funcionarios cadastrados \n tem " + qntVendas
     + " vendas cadastradas";
  }
  
}
