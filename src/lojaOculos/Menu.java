package lojaOculos;

import java.util.Locale;
import java.util.Scanner;

public class Menu {
    static Scanner ler = new Scanner(System.in).useLocale(Locale.US);;

    public static void Opcoes() {

        Loja[] loja = new Loja[1]; // passivel de cadastro de novas lojas
        // int qntLojas = 0;
        loja[0] = new Loja();
        loja[0] = Loja.preCadastro(loja[0]);

        int opcMenu;

        do {
            System.out.println("essas são as opçoes disponiveis no momento:");
            System.out.println("------------------------------");
            System.out.println("1-  opcoes da loja");
            System.out.println("2-  opcoes de clientes");
            System.out.println("3-  opcoes de funcionarios");
            System.out.println("4-  opcoes de estoque");
            System.out.println("5-  opcoes de vendas");
            System.out.println("6-  opcoes de lentes");
            System.out.println("99- encerrar o programa");
            System.out.println("------------------------------");
            System.out.println("por favor digite a opcao que desejar: ");
            opcMenu = ler.nextInt();
            ler.nextLine();

            switch (opcMenu) {
                case 1:
                    Loja(loja[0]);
                    break;

                case 2:
                    Cliente(loja[0]);
                    break;

                case 3:
                    Funcionarios(loja[0]);
                    break;

                case 4:
                    Estoque(loja[0]);
                    break;

                case 5:
                    Vendas(loja[0]);
                    break;

                case 6:
                    Lentes(loja[0]);
                    break;

                case 99:

                    break;
                default:
                    System.out.println("opcao invalida, por favor digite um valor valido:");
            }
        } while (opcMenu != 99);

    }

    public static void Loja(Loja loja) {
        int opcMenuLoja = 0;
        do {
            System.out.println("--------------------------------------");
            System.out.println("1- cadastrar loja ");
            System.out.println("2- ver informacoes da loja");
            System.out.println("3- editar informacoes da loja");
            System.out.println("9- voltar para o menu anterior");
            System.out.println("--------------------------------------");
            System.out.println("por favor digite a opcao que desejar: ");

            opcMenuLoja = ler.nextInt();
            ler.nextLine();

            switch (opcMenuLoja) {
                case 1:
                    Cruds.cadastroLoja(loja);
                    break;
                case 2:
                    Cruds.infoLoja(loja);
                    break;
                case 3:
                    Cruds.editLoja(loja);
                    break;
                case 9:
                    break;
                default:
                    System.out.println("opcao invalida, por favor digite um valor valido:");
            }
        } while (opcMenuLoja != 9);

    }

    public static void Cliente(Loja loja) {
        int opcMenuCliente = 0;
        do {
            System.out.println("--------------------------------------");
            System.out.println("1- cadastrar Clientes");
            System.out.println("2- ver informacoes dos clientes");
            System.out.println("3- buscar clientes por ID");
            System.out.println("9- voltar para o menu anterior");
            System.out.println("--------------------------------------");
            System.out.println("por favor digite a opcao que desejar: ");

            opcMenuCliente = ler.nextInt();
            ler.nextLine();

            switch (opcMenuCliente) {
                case 1:
                    Cruds.cadastroCliente(loja);
                    break;
                case 2:
                    Cruds.infoCliente(loja);
                    break;
                case 3:
                    Cruds.buscaCliente(loja);
                    break;
                default:
                    System.out.println("opcao invalida, por favor digite um valor valido:");
            }

        } while (opcMenuCliente != 9);
    }

    public static void Funcionarios(Loja loja) {
        int opcMenuFuncionarios = 0;
        do {
            System.out.println("--------------------------------------");
            System.out.println("1- cadastrar funcionarios");
            System.out.println("2- ver informacoes dos funcionarios");
            System.out.println("3- buscar clientes por ID");
            System.out.println("9- voltar para o menu anterior");
            System.out.println("--------------------------------------");
            System.out.println("por favor digite a opcao que desejar: ");

            opcMenuFuncionarios = ler.nextInt();
            ler.nextLine();

            switch (opcMenuFuncionarios) {
                case 1:
                    Cruds.cadastroFuncionario(loja);
                    break;
                case 2:
                    Cruds.infoFuncionario(loja);
                    break;
                case 3:
                    Cruds.buscaFuncionario(loja);
                    break;
                case 9:
                    break;
                default:
                    System.out.println("opcao invalida, por favor digite um valor valido:");
            }

        } while (opcMenuFuncionarios != 9);
    }

    public static void Estoque(Loja loja) {
        int opcMenuEstoque = 0;
        do {
            System.out.println("--------------------------------------");
            System.out.println("1- cadastrar armacoes de oculos");
            System.out.println("2- ver informacoes das armacoes");
            System.out.println("3- buscar armacoes por id");
            System.out.println("9- voltar para o menu anterior");
            System.out.println("--------------------------------------");
            System.out.println("por favor digite a opcao que desejar: ");

            opcMenuEstoque = ler.nextInt();
            ler.nextLine();

            switch (opcMenuEstoque) {
                case 1:
                    Cruds.cadastroArmacao(loja);
                    break;
                case 2:
                    Cruds.infoArmacao(loja);
                    break;
                case 3:
                    Cruds.buscaArmacao(loja);
                case 9:
                    break;
                default:
                    System.out.println("opcao invalida, por favor digite um valor valido:");
            }

        } while (opcMenuEstoque != 9);
    }

    public static void Vendas(Loja loja) {
        int opcMenuVendas = 0;
        do {
            System.out.println("--------------------------------------");
            System.out.println("1- cadastrar vendas");
            System.out.println("2- ver informacoes das vendas");
            System.out.println("3- buscar venda por id");
            System.out.println("9- voltar para o menu anterior");
            System.out.println("--------------------------------------");
            System.out.println("por favor digite a opcao que desejar: ");

            opcMenuVendas = ler.nextInt();
            ler.nextLine();

            switch (opcMenuVendas) {
                case 1:
                    break;
                case 2:
                    Cruds.infoVenda(loja);
                    break;
                case 9:
                    Cruds.buscaVenda(loja);
                    break;
                default:
                    System.out.println("opcao invalida, por favor digite um valor valido:");
            }

        } while (opcMenuVendas != 9);

    }

    public static void Lentes(Loja loja) {
        int opcMenuLentes = 0;
        do {
            System.out.println("--------------------------------------");
            System.out.println("1- ver informacoes dos pedidos de lente");
            System.out.println("2- buscar lentes por id");
            System.out.println("9- voltar para o menu anterior");
            System.out.println("--------------------------------------");
            System.out.println("por favor digite a opcao que desejar: ");

            opcMenuLentes = ler.nextInt();
            ler.nextLine();

            switch (opcMenuLentes) {
                case 1:
                    Cruds.infoLente(loja);
                    break;
                case 2:
                    Cruds.buscaLente(loja);
                    break;
                case 9:
                    break;
                default:
                    System.out.println("opcao invalida, por favor digite um valor valido:");
            }

        } while (opcMenuLentes != 9);

    }
}
