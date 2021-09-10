package lojaOculos;

public class Cruds {
    public static void cadastroLoja(Loja loja) {
        if (loja.isLojaCadastrada()) {
            System.out.println("desculpe, ja tem uma loja cadastrada!");
        } else {
            loja.cadastroLoja(loja);
        }

    }

    public static void infoLoja(Loja loja) {
        if (loja.isLojaCadastrada()) {
            System.out.println(loja.toString());
        } else {
            System.out.println("nao tem nenhuma loja cadastrada para se mostrar informacoes");
        }

    }

    public static void editLoja(Loja loja) {
        if (loja.isLojaCadastrada()) {
            loja = loja.editarLoja(loja);
        } else {
            System.out.println("nao tem nenhuma loja cadastrada para se editar informacoes");
        }
    }

    public static void cadastroCliente(Loja loja) {
        loja.cadastroCliente(loja);
    }

    public static void infoCliente(Loja loja) {
        loja.showClientes(loja);
    }

    public static void buscaCliente(Loja loja) {
        loja.findCliente(loja);
    }

    public static void cadastroFuncionario(Loja loja) {
        loja.cadastroFuncionario(loja);
    }

    public static void infoFuncionario(Loja loja) {
        loja.showFuncionarios(loja);
    }

    public static void buscaFuncionario(Loja loja) {
        loja.findFuncionario(loja);
    }

    public static void cadastroArmacao(Loja loja) {
        loja.cadastroArmacao(loja);
    }

    public static void infoArmacao(Loja loja) {
        loja.showArmacoes(loja);
    }

    public static void buscaArmacao(Loja loja) {
        loja.findArmacao(loja);
    }

    public static void cadastroVendas(Loja loja) {
        loja.cadastroVenda(loja);
    }

    public static void infoVenda(Loja loja) {
        loja.showVenda(loja);
    }

    public static void buscaVenda(Loja loja) {
        loja.findVenda(loja);
    }

    public static void infoLente(Loja loja) {
        loja.showLente(loja);
    }

    public static void buscaLente(Loja loja) {
        loja.findLente(loja);
    }
}
