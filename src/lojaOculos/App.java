package lojaOculos;

import java.util.Scanner;

public class App {
    static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        //declaraçoes

        System.out.println("bem vindo ao programa de gerenciamento de uma loja de oculos!");
        
        menuOpcoes();

        System.out.println("obrigado, espero que o programa tenha sido util, ate mais!");


    }

    private static void menuOpcoes(){
        
        Loja[] loja = new Loja[1]; // passivel de cadastro de novas lojas
        //int qntLojas = 0;
        loja[0]= new Loja();
        loja[0] = Loja.preCadastro(loja[0]);

        
        int opcMenu;

        do{
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
        
            switch(opcMenu){
                case 1:
                    menuLoja(loja[0]);
                    break;

                case 2:
                    menuCliente(loja[0]);
                    break;

                case 3:
                    menuFuncionarios(loja[0]);
                    break;

                case 4:
                    menuEstoque(loja[0]);
                    break;

                case 5:
                    menuVendas(loja[0]);
                    break;

                case 6:
                    menuLentes(loja[0]);
                    break;

                case 99:

                    break;
                default:
                    System.out.println("opcao invalida, por favor digite um valor valido:");
            }
        }while(opcMenu != 99);

    }

    private static void menuLoja(Loja loja){
        int opcMenuLoja=0;
        do{
            System.out.println("--------------------------------------");
            System.out.println("1- cadastrar loja ");
            System.out.println("2- ver informacoes da loja");
            System.out.println("3- editar informacoes da loja");
            System.out.println("9- voltar para o menu anterior");
            System.out.println("--------------------------------------");
            System.out.println("por favor digite a opcao que desejar: ");
            
            opcMenuLoja = ler.nextInt();
            ler.nextLine();

            switch (opcMenuLoja){
                case 1:
                    cadastroLoja(loja);
                    break;
                case 2:
                    infoLoja(loja);
                    break;
                case 3:
                    editLoja(loja);
                    break;
                case 9:
                    break;
                default:
                    System.out.println("opcao invalida, por favor digite um valor valido:");
            }
        } while (opcMenuLoja!= 9);
        
    }

    private static void menuCliente(Loja loja){
        int opcMenuCliente=0;
        do{
            System.out.println("--------------------------------------");
            System.out.println("1- cadastrar Clientes");
            System.out.println("2- ver informacoes dos clientes");
            System.out.println("3- editar informacoes de clientes");
            System.out.println("4- deletar clientes");
            System.out.println("5- buscar clientes por ID");
            System.out.println("9- voltar para o menu anterior");
            System.out.println("--------------------------------------");
            System.out.println("por favor digite a opcao que desejar: ");

            opcMenuCliente = ler.nextInt();
            ler.nextLine();

            switch (opcMenuCliente){
                case 1:
                    cadastroCliente(loja);
                    break;
                case 2:
                    infoCliente(loja);
                    break;
                case 9:
                    break;
                default:
                    System.out.println("opcao invalida, por favor digite um valor valido:");
            }

        }while ( opcMenuCliente !=9);
    }

    private static void menuFuncionarios(Loja loja){
        int opcMenuFuncionarios=0;
        do{
            System.out.println("--------------------------------------");
            System.out.println("1- cadastrar funcionarios");
            System.out.println("2- ver informacoes dos funcionarios");
            System.out.println("9- voltar para o menu anterior");
            System.out.println("--------------------------------------");
            System.out.println("por favor digite a opcao que desejar: ");

            opcMenuFuncionarios = ler.nextInt();
            ler.nextLine();

            switch (opcMenuFuncionarios){
                case 1:
                    break;
                case 2:
                    break;
                case 9:
                    break;
                default:
                    System.out.println("opcao invalida, por favor digite um valor valido:");
            }

        }while( opcMenuFuncionarios !=9);
    }

    private static void menuEstoque(Loja loja){
        int opcMenuEstoque=0;
        do{
            System.out.println("--------------------------------------");
            System.out.println("1- cadastrar armacoes de oculos");
            System.out.println("2- ver informacoes das armacoes");
            System.out.println("9- voltar para o menu anterior");
            System.out.println("--------------------------------------");
            System.out.println("por favor digite a opcao que desejar: ");

            opcMenuEstoque = ler.nextInt();
            ler.nextLine();

            switch (opcMenuEstoque){
                case 1:
                    break;
                case 2:
                    break;
                case 9:
                    break;
                default:
                    System.out.println("opcao invalida, por favor digite um valor valido:");
            }

        }while( opcMenuEstoque !=9);
    }

    private static void menuVendas(Loja loja){
        int opcMenuVendas=0;
        do{
            System.out.println("--------------------------------------");
            System.out.println("1- cadastrar vendas");
            System.out.println("2- ver informacoes das vendas");
            System.out.println("9- voltar para o menu anterior");
            System.out.println("--------------------------------------");
            System.out.println("por favor digite a opcao que desejar: ");

            opcMenuVendas = ler.nextInt();
            ler.nextLine();

            switch (opcMenuVendas){
                case 1:
                    break;
                case 2:
                    break;
                case 9:
                    break;
                default:
                    System.out.println("opcao invalida, por favor digite um valor valido:");
            }

        }while( opcMenuVendas!=9);

    }
    
    private static void menuLentes(Loja loja){
        int opcMenuLentes=0;
        do{
            System.out.println("--------------------------------------");
            System.out.println("1- ver informacoes dos pedidos de lente");
            System.out.println("9- voltar para o menu anterior");
            System.out.println("--------------------------------------");
            System.out.println("por favor digite a opcao que desejar: ");

            opcMenuLentes = ler.nextInt();
            ler.nextLine();

            switch (opcMenuLentes){
                case 1:
                    break;
                case 2:
                    break;
                case 9:
                    break;
                default:
                    System.out.println("opcao invalida, por favor digite um valor valido:");
            }

        }while(opcMenuLentes !=9);

    }

    private static void cadastroLoja(Loja loja){
        if(loja.isLojaCadastrada()){
            System.out.println("desculpe, ja tem uma loja cadastrada!");
        }else{
            loja.cadastroLoja(loja);
        }
        
    }

    private static void infoLoja(Loja loja){
        if(loja.isLojaCadastrada()){
            System.out.println(loja.toString());
        } else{
            System.out.println("nao tem nenhuma loja cadastrada para se mostrar informacoes");
        }
        
    }

    private static void editLoja(Loja loja){
        if(loja.isLojaCadastrada()){
            loja = loja.editarLoja(loja);
        } else{
            System.out.println("nao tem nenhuma loja cadastrada para se editar informacoes");
        }
    }

    private static void cadastroCliente(Loja loja){
        loja.cadastroCliente(loja);
    }

    private static void infoCliente(Loja loja){
        loja.showClientes(loja);
    }
}
