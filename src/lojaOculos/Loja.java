package lojaOculos;

import java.util.Locale;
import java.util.Scanner;

public class Loja {
  static Scanner ler = new Scanner(System.in).useLocale(Locale.US);;

  private int cep;
  private int telefone;
  private VendaDeOculos[] historicoVendas = new VendaDeOculos[50];
  private String nomeLoja;
  private Armacao[] estoqueArmacao = new Armacao[50];
  private Cliente[] clientes = new Cliente[50];
  private Funcionario[] funcionarios = new Funcionario[10];
  private LenteDeOculos[] lentes = new LenteDeOculos[50];

  private boolean lojaCadastrada;
  private int qntClientes = 0;
  private int qntFuncionarios = 0;
  private int qntVendas = 0;
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

  public static Loja preCadastro(Loja loja) {

    loja.cep = 87654321;
    loja.telefone = 12345678;
    loja.nomeLoja = "oticas wanderer";
    loja.setLojaCadastrada(true);

    for (int i = 0; i <= 9; i++) {
      loja.clientes[i] = new Cliente();
      loja.clientes[i].setCPF("111.111.111-" + i * 10);
      ;
      loja.clientes[i].setNome("cliente" + (i + 1));
      ;
      loja.clientes[i].setTelefone(111111111 * i);
      loja.clientes[i].setEndereco("endereco" + (i + 1));
      ;
      loja.clientes[i].setID("id" + (i + 1));
      ;
      loja.clientes[i].setDataaniver("01/0" + (i + 1) + "/2001");
      ;
      loja.clientes[i].setDataprimeira("01/10/2021");
    }

    for (int i = 0; i <= 4; i++) {
      loja.funcionarios[i] = new Funcionario();
      loja.funcionarios[i].setCPF("111.111.111-" + i * 10);
      ;
      loja.funcionarios[i].setNome("funcionario" + (i + 1));
      ;
      loja.funcionarios[i].setTelefone(111111111 * i);
      loja.funcionarios[i].setEndereco("endereco" + (i + 1));
      ;
      loja.funcionarios[i].setID("id" + (i + 1));
      ;
      loja.funcionarios[i].setDataaniver("01/0" + (i + 1) + "/2001");
      ;
      loja.funcionarios[i].setDatacontrac("30/9/2021");
      loja.funcionarios[i].setSalario(1500.95);
    }
    loja.setQntClientes(10);
    loja.setQntFuncionarios(5);

    for (int i = 0; i <= 4; i++) {
      loja.estoqueArmacao[i] = new Armacao();
      loja.estoqueArmacao[i].setMarcaArmacao("marca" + (i + 1));
      loja.estoqueArmacao[i].setMatArmacao("material armacao" + (1 + i));
      loja.estoqueArmacao[i].setIDarmacao("idArmacao" + (1 + i));
      loja.estoqueArmacao[i].setModeloArmacao("modelorosto" + (i + 1));
      loja.estoqueArmacao[i].setMedidaaro(10 + 0.1 * i);
      loja.estoqueArmacao[i].setValorArmacao(500 + 15.15 * (i + 1));

    }

    for (int i = 0; i <= 4; i++) {
      loja.lentes[i] = new LenteDeOculos();
      loja.lentes[i].setDataProducao("01/0" + (i + 1) + "/2022");
      loja.lentes[i].setFocoLente("monofocal");
      loja.lentes[i].setFormato("quadrada");
      loja.lentes[i].setGrau(0.5 * (i + 1));
      loja.lentes[i].setId(500 + i);
      loja.lentes[i].setIdArmacao(loja.estoqueArmacao[i].getIDarmacao());
      loja.lentes[i].setIndMedica("correcao de estrabismo");
      loja.lentes[i].setLaboratorio("Hoya");
      loja.lentes[i].setValorLente(500 * (i + 1.1));
      loja.lentes[i].setprotecaoUV(true);

    }

    for (int i = 0; i <= 4; i++) {
      loja.historicoVendas[i] = new VendaDeOculos();
      loja.historicoVendas[i].setIdCliente("idC" + (i + 1));
      loja.historicoVendas[i].setIdFuncionario("idF" + (i + 1));
      loja.historicoVendas[i].setIdLente(loja.lentes[i].getId());
      loja.historicoVendas[i].setIdArmacao("idArmacao" + (1 + i));
      loja.historicoVendas[i].setValorFinal(loja.lentes[i].getValorLente() + loja.estoqueArmacao[i].getValorArmacao());
      loja.historicoVendas[i].setIdVenda("idVenda" + (i + 1));
    }

    loja.setQntVendas(5);
    loja.setQntArmacao(5);
    loja.setQntLentes(5);

    return loja;
  }

  public Loja cadastroLoja(Loja loja) {
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

  public Loja editarLoja(Loja loja) {
    int opcMenuEdit = 0;

    System.out.println("essas sao as informacoes atuais:");
    System.out.println(loja.toString());
    System.out.println("gostaria de alterar qual informacao? digite o numero desejado");
    do {
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

      switch (opcMenuEdit) {
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
          ler.nextLine();
          ler.nextLine();
          break;
        case 9:
          System.out.println("essas sao as novas informacoes:");
          loja.toString();
          break;
        default:
          System.out.println("opcao invalida, por favor digite um valor valido:");
      }
    } while (opcMenuEdit != 9);

    return loja;
  }

  public Loja cadastroCliente(Loja loja) {

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

    setQntClientes(getQntClientes() + 1);

    return loja;
  }

  public void showClientes(Loja loja) {
    for (int i = 0; i < getQntClientes(); i++) {
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

  public void findCliente(Loja loja) {

    String idProcurado;
    int flag = 0, posicaoId = 0;

    System.out.println("por favor, digite o id que deseja procurar: ");
    idProcurado = ler.nextLine();

    for (int i = 0; i < getQntClientes(); i++) {
      if (loja.clientes[i].buscaClienteID(idProcurado)) {
        System.out.println("achei!");
        posicaoId = i;
        flag = 1;
      }
    }

    if (flag == 1) {
      System.out.println("--------------------------------------");
      System.out.println("nome            : " + loja.clientes[posicaoId].getNome());
      System.out.println("CPF             : " + loja.clientes[posicaoId].getCPF());
      System.out.println("telefone        : " + loja.clientes[posicaoId].getTelefone());
      System.out.println("endereco        : " + loja.clientes[posicaoId].getEndereco());
      System.out.println("id              : " + loja.clientes[posicaoId].getID());
      System.out.println("aniversario     : " + loja.clientes[posicaoId].getDataaniver());
      System.out.println("primeira compra : " + loja.clientes[posicaoId].getDataprimeira());
      System.out.println("--------------------------------------");
      menuFindCliente(loja, posicaoId);
    } else {
      System.out.println("nao foi encontrado nenhum cliente com esse id");
    }
  }

  public void menuFindCliente(Loja loja, int posicaoId) {
    int opcMenu;
    System.out.println("gostaria de alterar alguma informacao? digite o numero desejado");
    do {
      System.out.println("-------------------------------------------------------");
      System.out.println("1- nome ");
      System.out.println("2- CPF");
      System.out.println("3- Telefone");
      System.out.println("4- endereco");
      System.out.println("5- id");
      System.out.println("6- aniversario");
      System.out.println("7- primeira compra");
      System.out.println("9- encerrar as alteracoes");
      System.out.println("-------------------------------------------------------");
      System.out.println("por favor digite a opcao que desejar: ");

      opcMenu = ler.nextInt();
      ler.nextLine();

      switch (opcMenu) {
        case 1:
          System.out.println("por favor, digite o novo nome:");
          loja.clientes[posicaoId].setNome(ler.nextLine());
          break;
        case 2:
          System.out.println("por favor, digite o novo cpf:");
          loja.clientes[posicaoId].setCPF(ler.nextLine());
          break;
        case 3:
          System.out.println("por favor, digite o novo telefone:");
          loja.clientes[posicaoId].setTelefone(ler.nextInt());
          ler.nextLine();
          break;
        case 4:
          System.out.println("por favor, digite o novo endereco:");
          loja.clientes[posicaoId].setEndereco(ler.nextLine());
          break;
        case 5:
          System.out.println("por favor, digite o novo ID:");
          loja.clientes[posicaoId].setID(ler.nextLine());
          break;
        case 6:
          System.out.println("por favor, digite a nova data de aniversario: (dd/mm/aaaa)");
          loja.clientes[posicaoId].setDataaniver(ler.nextLine());
          break;
        case 7:
          System.out.println("por favor, digite a nova data de primeira compra: (dd/mm/aaaa)");
          loja.clientes[posicaoId].setDataprimeira(ler.nextLine());
          break;
        case 9:
          break;
        default:
          System.out.println("opcao invalida, por favor digite um valor valido:");
      }
    } while (opcMenu != 9);
  }

  public Loja cadastroFuncionario(Loja loja) {

    loja.funcionarios[getQntFuncionarios()] = new Funcionario();
    System.out.println("por favor, digite o nome do funcionario:");
    loja.funcionarios[getQntFuncionarios()].setNome(ler.nextLine());
    System.out.println("por favor, digite o cpf do funcionario:");
    loja.funcionarios[getQntFuncionarios()].setCPF(ler.nextLine());
    System.out.println("por favor, digite o telefone do funcionario:");
    loja.funcionarios[getQntFuncionarios()].setTelefone(ler.nextInt());
    ler.nextLine();
    System.out.println("por favor, digite o endereco do funcionario:");
    loja.funcionarios[getQntFuncionarios()].setEndereco(ler.nextLine());
    System.out.println("por favor, digite o ID do funcionario:");
    loja.funcionarios[getQntFuncionarios()].setID(ler.nextLine());
    System.out.println("por favor, digite a data de aniversario: (dd/mm/aaaa)");
    loja.funcionarios[getQntFuncionarios()].setDataaniver(ler.nextLine());
    System.out.println("por favor, digite a data de contratacao: (dd/mm/aaaa)");
    loja.funcionarios[getQntFuncionarios()].setDatacontrac(ler.nextLine());
    System.out.println("por favor, digite o salario desse funcionario:");
    loja.funcionarios[getQntFuncionarios()].setSalario(ler.nextDouble());

    setQntFuncionarios(getQntFuncionarios() + 1);

    return loja;
  }

  public void showFuncionarios(Loja loja) {
    for (int i = 0; i < getQntFuncionarios(); i++) {
      System.out.println("--------------------------------------");
      System.out.println("nome             : " + loja.funcionarios[i].getNome());
      System.out.println("CPF              : " + loja.funcionarios[i].getCPF());
      System.out.println("telefone         : " + loja.funcionarios[i].getTelefone());
      System.out.println("endereco         : " + loja.funcionarios[i].getEndereco());
      System.out.println("id               : " + loja.funcionarios[i].getID());
      System.out.println("aniversario      : " + loja.funcionarios[i].getDataaniver());
      System.out.println("data contratacao : " + loja.funcionarios[i].getDatacontrac());
      System.out.println("salario          : " + loja.funcionarios[i].getSalario());
      System.out.println("--------------------------------------");
    }
  }

  public void findFuncionario(Loja loja) {

    String idProcurado;
    int flag = 0, posicaoId = 0;

    System.out.println("por favor, digite o id que deseja procurar: ");
    idProcurado = ler.nextLine();

    for (int i = 0; i < getQntFuncionarios(); i++) {
      if (loja.funcionarios[i].buscaFuncionarioID(idProcurado)) {
        System.out.println("achei!");
        posicaoId = i;
        flag = 1;
      }
    }

    if (flag == 1) {
      System.out.println("--------------------------------------");
      System.out.println("nome             : " + loja.funcionarios[posicaoId].getNome());
      System.out.println("CPF              : " + loja.funcionarios[posicaoId].getCPF());
      System.out.println("telefone         : " + loja.funcionarios[posicaoId].getTelefone());
      System.out.println("endereco         : " + loja.funcionarios[posicaoId].getEndereco());
      System.out.println("id               : " + loja.funcionarios[posicaoId].getID());
      System.out.println("aniversario      : " + loja.funcionarios[posicaoId].getDataaniver());
      System.out.println("data contratacao : " + loja.funcionarios[posicaoId].getDatacontrac());
      System.out.println("salario          : " + loja.funcionarios[posicaoId].getSalario());
      System.out.println("--------------------------------------");
      menuFindFuncionario(loja, posicaoId);
    } else {
      System.out.println("nao foi encontrado nenhum funcionario com esse id");
    }
  }

  public void menuFindFuncionario(Loja loja, int posicaoId) {
    int opcMenu;
    System.out.println("gostaria de alterar alguma informacao? digite o numero desejado");
    do {
      System.out.println("-------------------------------------------------------");
      System.out.println("1- nome ");
      System.out.println("2- CPF");
      System.out.println("3- Telefone");
      System.out.println("4- endereco");
      System.out.println("5- id");
      System.out.println("6- aniversario");
      System.out.println("7- data contratacao");
      System.out.println("8- salario");
      System.out.println("9- encerrar as alteracoes");
      System.out.println("-------------------------------------------------------");
      System.out.println("por favor digite a opcao que desejar: ");

      opcMenu = ler.nextInt();
      ler.nextLine();

      switch (opcMenu) {
        case 1:
          System.out.println("por favor, digite o novo nome:");
          loja.funcionarios[posicaoId].setNome(ler.nextLine());
          break;
        case 2:
          System.out.println("por favor, digite o novo cpf:");
          loja.funcionarios[posicaoId].setCPF(ler.nextLine());
          break;
        case 3:
          System.out.println("por favor, digite o novo telefone:");
          loja.funcionarios[posicaoId].setTelefone(ler.nextInt());
          ler.nextLine();
          break;
        case 4:
          System.out.println("por favor, digite o novo endereco:");
          loja.funcionarios[posicaoId].setEndereco(ler.nextLine());
          break;
        case 5:
          System.out.println("por favor, digite o novo ID:");
          loja.funcionarios[posicaoId].setID(ler.nextLine());
          break;
        case 6:
          System.out.println("por favor, digite a nova data de aniversario: (dd/mm/aaaa)");
          loja.funcionarios[posicaoId].setDataaniver(ler.nextLine());
          break;
        case 7:
          System.out.println("por favor, digite a nova data de contratacao: (dd/mm/aaaa)");
          loja.funcionarios[posicaoId].setDatacontrac(ler.nextLine());
          break;
        case 8:
          System.out.println("por favor, digite o novo salario:");
          loja.funcionarios[getQntFuncionarios()].setSalario(ler.nextDouble());
          ler.nextLine();
          break;
        case 9:
          break;
        default:
          System.out.println("opcao invalida, por favor digite um valor valido:");
      }
    } while (opcMenu != 9);
  }

  public Loja cadastroArmacao(Loja loja) {
    loja.estoqueArmacao[getQntArmacao()] = new Armacao();
    System.out.println("por favor, digite a marca da armacao:");
    loja.estoqueArmacao[getQntArmacao()].setMarcaArmacao(ler.nextLine());
    System.out.println("por favor, digite o material da armacao:");
    loja.estoqueArmacao[getQntArmacao()].setMatArmacao(ler.nextLine());
    System.out.println("por favor, digite o id da armacao:");
    loja.estoqueArmacao[getQntArmacao()].setIDarmacao(ler.nextLine());
    System.out.println("por favor, digite o modelo da armacao:");
    loja.estoqueArmacao[getQntArmacao()].setModeloArmacao(ler.nextLine());
    System.out.println("por favor, digite a medida da armacao:");
    loja.estoqueArmacao[getQntArmacao()].setMedidaaro(ler.nextDouble());
    System.out.println("por favor, digite o preco da armacao:");
    loja.estoqueArmacao[getQntArmacao()].setValorArmacao(ler.nextDouble());
    setQntArmacao(getQntArmacao() + 1);

    return loja;
  }

  public void showArmacoes(Loja loja) {
    for (int i = 0; i < getQntArmacao(); i++) {
      System.out.println("--------------------------------------");
      System.out.println("marca      : " + loja.estoqueArmacao[i].getMarcaArmacao());
      System.out.println("material   : " + loja.estoqueArmacao[i].getMatArmacao());
      System.out.println("id         : " + loja.estoqueArmacao[i].getIDarmacao());
      System.out.println("modelo     : " + loja.estoqueArmacao[i].getModeloArmacao());
      System.out.println("medida     : " + loja.estoqueArmacao[i].getMedidaaro());
      System.out.println("preco      : " + loja.estoqueArmacao[i].getValorArmacao());
      System.out.println("--------------------------------------");

    }
  }

  public void findArmacao(Loja loja) {
    String idProcurado;
    int flag = 0, posicaoId = 0;

    System.out.println("por favor, digite o id que deseja procurar: ");
    idProcurado = ler.nextLine();

    for (int i = 0; i < getQntArmacao(); i++) {
      if (loja.estoqueArmacao[i].buscaArmacaoID(idProcurado)) {
        System.out.println("achei!");
        posicaoId = i;
        flag = 1;
      }
    }

    if (flag == 1) {
      System.out.println("--------------------------------------");
      System.out.println("marca      : " + loja.estoqueArmacao[posicaoId].getMarcaArmacao());
      System.out.println("material   : " + loja.estoqueArmacao[posicaoId].getMatArmacao());
      System.out.println("id         : " + loja.estoqueArmacao[posicaoId].getIDarmacao());
      System.out.println("modelo     : " + loja.estoqueArmacao[posicaoId].getModeloArmacao());
      System.out.println("medida     : " + loja.estoqueArmacao[posicaoId].getMedidaaro());
      System.out.println("preco      : " + loja.estoqueArmacao[posicaoId].getValorArmacao());
      System.out.println("--------------------------------------");
      menuFindArmacao(loja, posicaoId);
    } else {
      System.out.println("nao foi encontrado nenhuma armacao com esse id");
    }
  }

  public void menuFindArmacao(Loja loja, int posicaoId) {
    int opcMenu;
    System.out.println("gostaria de alterar alguma informacao? digite o numero desejado");
    do {
      System.out.println("-------------------------------------------------------");
      System.out.println("1- marca ");
      System.out.println("2- material");
      System.out.println("3- id");
      System.out.println("4- modelo");
      System.out.println("5- medida");
      System.out.println("6- preco");
      System.out.println("9- encerrar as alteracoes");
      System.out.println("-------------------------------------------------------");
      System.out.println("por favor digite a opcao que desejar: ");

      opcMenu = ler.nextInt();
      ler.nextLine();

      switch (opcMenu) {
        case 1:
          System.out.println("por favor, digite a nova marca:");
          loja.estoqueArmacao[posicaoId].setMarcaArmacao(ler.nextLine());
          break;
        case 2:
          System.out.println("por favor, digite o novo material:");
          loja.estoqueArmacao[posicaoId].setMatArmacao(ler.nextLine());
          break;
        case 3:
          System.out.println("por favor, digite o novo id:");
          loja.estoqueArmacao[posicaoId].setIDarmacao(ler.nextLine());
          ler.nextLine();
          break;
        case 4:
          System.out.println("por favor, digite o novo modelo:");
          loja.estoqueArmacao[posicaoId].setModeloArmacao(ler.nextLine());
          break;
        case 5:
          System.out.println("por favor, digite a nova medida:");
          loja.estoqueArmacao[posicaoId].setMedidaaro(ler.nextDouble());
          break;
        case 6:
          System.out.println("por favor, digite o novo preco:");
          loja.estoqueArmacao[posicaoId].setValorArmacao(ler.nextDouble());
          break;
        case 9:
          break;
        default:
          System.out.println("opcao invalida, por favor digite um valor valido:");
      }
    } while (opcMenu != 9);
  }

  public Loja cadastroVenda(Loja loja) {

    loja.historicoVendas[getQntVendas()] = new VendaDeOculos();
    loja.lentes[getQntLentes()] = new LenteDeOculos();

    System.out.println("por favor, digite o id da venda: ");
    loja.historicoVendas[getQntVendas()].setIdVenda(ler.nextLine());

    System.out.println("por favor, digite o id do cliente relacionado: ");
    loja.historicoVendas[getQntVendas()].setIdCliente(ler.nextLine());

    System.out.println("por favor, digite o id do funcionario relacionado: ");
    loja.historicoVendas[getQntVendas()].setIdFuncionario(ler.nextLine());

    System.out.println("por favor, digite o id da lente: ");
    loja.historicoVendas[getQntVendas()].setIdLente(ler.nextInt());
    ler.nextLine();

    System.out.println("por favor, digite a indicacao medica:");
    loja.lentes[getQntLentes()].setIndMedica(ler.nextLine());

    System.out.println("por favor, digite o tipo de foco:");
    loja.lentes[getQntLentes()].setFocoLente(ler.nextLine());

    System.out.println("por favor, digite o grau da lente:");
    loja.lentes[getQntLentes()].setGrau(ler.nextDouble());

    System.out.println("por favor, digite a protecao uv: 1- sim 0- nao");
    int uV = ler.nextInt();
    ler.nextLine();
    if (uV == 1) {
      loja.lentes[getQntLentes()].setprotecaoUV(true);
    } else {
      loja.lentes[getQntLentes()].setprotecaoUV(false);
    }

    System.out.println("por favor, digite o id de armacao:");
    loja.lentes[getQntLentes()].setIdArmacao(ler.nextLine());

    System.out.println("por favor, digite o formato da lente:");
    loja.lentes[getQntLentes()].setFormato(ler.nextLine());

    System.out.println("por favor, digite o laboratorio:");
    loja.lentes[getQntLentes()].setLaboratorio(ler.nextLine());

    System.out.println("por favor, digite o valor da lente:");
    loja.lentes[getQntLentes()].setValorLente(ler.nextDouble());
    ler.nextLine();

    System.out.println("por favor, digite a data de producao:");
    loja.lentes[getQntLentes()].setDataProducao(ler.nextLine());

    System.out.println("por favor, digite o id da armacao: ");
    loja.historicoVendas[getQntVendas()].setIdArmacao(ler.nextLine());

    System.out.println("por favor, digite o valor final da venda: ");
    loja.historicoVendas[getQntVendas()].setValorFinal(ler.nextDouble());

    setQntVendas(getQntVendas() + 1);
    setQntLentes(getQntLentes() + 1);

    return loja;
  }

  public void showVenda(Loja loja) {
    for (int i = 0; i < qntVendas; i++) {
      System.out.println("--------------------------------------");
      System.out.println("id venda       : " + loja.historicoVendas[i].getIdVenda());
      System.out.println("id cliente     : " + loja.historicoVendas[i].getIdCliente());
      System.out.println("id funcionario : " + loja.historicoVendas[i].getIdFuncionario());
      System.out.println("id lente       : " + loja.historicoVendas[i].getIdLente());
      System.out.println("id armacao     : " + loja.historicoVendas[i].getIdArmacao());
      System.out.println("valor final    : " + loja.historicoVendas[i].getValorFinal());
      System.out.println("--------------------------------------");
    }
  }

  public void findVenda(Loja loja) {
    String idProcurado;
    int flag = 0, posicaoId = 0;

    System.out.println("por favor, digite o id que deseja procurar: ");
    idProcurado = ler.nextLine();

    for (int i = 0; i < getQntArmacao(); i++) {
      if (loja.historicoVendas[i].buscaVendaID(idProcurado)) {
        System.out.println("achei!");
        posicaoId = i;
        flag = 1;
      }
    }

    if (flag == 1) {
      System.out.println("--------------------------------------");
      System.out.println("id venda       : " + loja.historicoVendas[posicaoId].getIdVenda());
      System.out.println("id cliente     : " + loja.historicoVendas[posicaoId].getIdCliente());
      System.out.println("id funcionario : " + loja.historicoVendas[posicaoId].getIdFuncionario());
      System.out.println("id lente       : " + loja.historicoVendas[posicaoId].getIdLente());
      System.out.println("id armacao     : " + loja.historicoVendas[posicaoId].getIdArmacao());
      System.out.println("valor final    : " + loja.historicoVendas[posicaoId].getValorFinal());
      System.out.println("--------------------------------------");
      menuFindVenda(loja, posicaoId);
    } else {
      System.out.println("nao foi encontrado nenhuma Venda com esse id");
    }
  }

  public void menuFindVenda(Loja loja, int posicaoId) {
    int opcMenu;
    System.out.println("gostaria de alterar alguma informacao? digite o numero desejado");
    do {
      System.out.println("-------------------------------------------------------");
      System.out.println("1- id venda ");
      System.out.println("2- id cliente");
      System.out.println("3- id funcionario");
      System.out.println("4- id lente");
      System.out.println("5- id armacao");
      System.out.println("6- valor final");
      System.out.println("9- encerrar as alteracoes");
      System.out.println("-------------------------------------------------------");
      System.out.println("por favor digite a opcao que desejar: ");

      opcMenu = ler.nextInt();
      ler.nextLine();

      switch (opcMenu) {
        case 1:
          System.out.println("por favor, digite o novo id de venda:");
          loja.historicoVendas[posicaoId].setIdVenda(ler.nextLine());
          break;
        case 2:
          System.out.println("por favor, digite o novo id de cliente:");
          loja.historicoVendas[posicaoId].setIdCliente(ler.nextLine());
          break;
        case 3:
          System.out.println("por favor, digite o novo id de funcionario:");
          loja.historicoVendas[posicaoId].setIdFuncionario(ler.nextLine());
          break;
        case 4:
          System.out.println("por favor, digite o novo id lente:");
          loja.historicoVendas[posicaoId].setIdLente(ler.nextInt());
          ler.nextLine();
          break;
        case 5:
          System.out.println("por favor, digite o novo id de armacao:");
          loja.historicoVendas[posicaoId].setIdArmacao(ler.nextLine());
          break;
        case 6:
          System.out.println("por favor, digite o novo preco:");
          loja.historicoVendas[posicaoId].setValorFinal(ler.nextDouble());
          break;
        case 9:
          break;
        default:
          System.out.println("opcao invalida, por favor digite um valor valido:");
      }
    } while (opcMenu != 9);
  }

  public void showLente(Loja loja) {
    for (int i = 0; i < qntLentes; i++) {
      System.out.println("--------------------------------------");
      System.out.println("id                : " + loja.lentes[i].getId());
      System.out.println("indicacao medica  : " + loja.lentes[i].getIndMedica());
      System.out.println("foco da lente     : " + loja.lentes[i].getFocoLente());
      System.out.println("grau da lente     : " + loja.lentes[i].getGrau());
      System.out.println("protecao UV       : " + loja.lentes[i].getprotecaoUV());
      System.out.println("id Armacao        : " + loja.lentes[i].getIdArmacao());
      System.out.println("formato da lente  : " + loja.lentes[i].getFormato());
      System.out.println("laboratorio       : " + loja.lentes[i].getLaboratorio());
      System.out.println("valor da lente    : " + loja.lentes[i].getValorLente());
      System.out.println("data Producao     : " + loja.lentes[i].getDataProducao());
      System.out.println("--------------------------------------");
    }
  }

  public void findLente(Loja loja) {
    int idProcurado;
    int flag = 0, posicaoId = 0;

    System.out.println("por favor, digite o id que deseja procurar: ");
    idProcurado = ler.nextInt();
    ler.nextLine();

    for (int i = 0; i < getQntLentes(); i++) {
      if (loja.lentes[i].buscaLenteID(idProcurado)) {
        System.out.println("achei!");
        posicaoId = i;
        flag = 1;
      }
    }

    if (flag == 1) {
      System.out.println("--------------------------------------");
      System.out.println("id                : " + loja.lentes[posicaoId].getId());
      System.out.println("indicacao medica  : " + loja.lentes[posicaoId].getIndMedica());
      System.out.println("foco da lente     : " + loja.lentes[posicaoId].getFocoLente());
      System.out.println("grau da lente     : " + loja.lentes[posicaoId].getGrau());
      System.out.println("protecao UV       : " + loja.lentes[posicaoId].getprotecaoUV());
      System.out.println("id Armacao        : " + loja.lentes[posicaoId].getIdArmacao());
      System.out.println("formato da lente  : " + loja.lentes[posicaoId].getFormato());
      System.out.println("laboratorio       : " + loja.lentes[posicaoId].getLaboratorio());
      System.out.println("valor da lente    : " + loja.lentes[posicaoId].getValorLente());
      System.out.println("data Producao     : " + loja.lentes[posicaoId].getDataProducao());
      System.out.println("--------------------------------------");
      menuFindLente(loja, posicaoId);
    } else {
      System.out.println("nao foi encontrado nenhuma lente com esse id");
    }
  }

  public void menuFindLente(Loja loja, int posicaoId) {
    int opcMenu;
    int uV;
    System.out.println("gostaria de alterar alguma informacao? digite o numero desejado");
    do {
      System.out.println("-------------------------------------------------------");
      System.out.println("1-  id                 ");
      System.out.println("2-  indicacao medica   ");
      System.out.println("3-  foco da lente      ");
      System.out.println("4-  grau da lente      ");
      System.out.println("5-  protecao UV        ");
      System.out.println("6-  id Armacao         ");
      System.out.println("7-  formato da lente   ");
      System.out.println("8-  laboratorio        ");
      System.out.println("9-  valor da lente     ");
      System.out.println("10- data Producao      ");
      System.out.println("99- encerrar as alteracoes");
      System.out.println("-------------------------------------------------------");
      System.out.println("por favor digite a opcao que desejar: ");

      opcMenu = ler.nextInt();
      ler.nextLine();

      switch (opcMenu) {
        case 1:
          System.out.println("por favor, digite o novo id:");
          loja.lentes[posicaoId].setId(ler.nextInt());
          ler.nextLine();
          break;
        case 2:
          System.out.println("por favor, digite a nova indicacao:");
          loja.lentes[posicaoId].setIndMedica(ler.nextLine());
          break;
        case 3:
          System.out.println("por favor, digite o novo foco:");
          loja.lentes[posicaoId].setFocoLente(ler.nextLine());
          ler.nextLine();
          break;
        case 4:
          System.out.println("por favor, digite o novo grau:");
          loja.lentes[posicaoId].setGrau(ler.nextDouble());
          break;
        case 5:
          System.out.println("por favor, digite a nova protecao uv: 1- sim 0- nao");
          uV = ler.nextInt();
          ler.nextLine();
          if (uV == 1) {
            loja.lentes[posicaoId].setprotecaoUV(true);
          } else {
            loja.lentes[posicaoId].setprotecaoUV(false);
          }
          break;
        case 6:
          System.out.println("por favor, digite o novo id de armacao:");
          loja.lentes[posicaoId].setIdArmacao(ler.nextLine());
          break;
        case 7:
          System.out.println("por favor, digite o novo formato da lente:");
          loja.lentes[posicaoId].setFormato(ler.nextLine());
          break;
        case 8:
          System.out.println("por favor, digite o novo laboratorio:");
          loja.lentes[posicaoId].setLaboratorio(ler.nextLine());
          break;
        case 9:
          System.out.println("por favor, digite o novo valor da lente:");
          loja.lentes[posicaoId].setValorLente(ler.nextDouble());
          break;
        case 10:
          System.out.println("por favor, digite a nova data de producao:");
          loja.lentes[posicaoId].setDataProducao(ler.nextLine());
          break;
        case 99:

          break;
        default:
          System.out.println("opcao invalida, por favor digite um valor valido:");
      }
    } while (opcMenu != 99);
  }

  @Override
  public String toString() {
    return " o CEP da loja " + nomeLoja + " e: " + cep + "\n o numero de telefone da loja e: " + telefone + "\n tem "
        + qntClientes + " clientes cadastrados " + "\n tem " + qntFuncionarios + " funcionarios cadastrados \n tem "
        + qntVendas + " vendas cadastradas";
  }

}
