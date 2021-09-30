package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import controle.*;

public class TelaDetalheVenda implements ActionListener {
    private JFrame janela;
    private JLabel labelNomeVenda = new JLabel("Nome da Venda: ");
    private JTextField valorNomeVenda;
    private JLabel labelIdLente = new JLabel("id Lente: ");
    private JTextField valorIdLente;
    private JLabel labelIdCliente = new JLabel("id Cliente: ");
    private JTextField valorIdCliente;
    private JLabel labelIdArmacao = new JLabel("Id Armacao: ");
    private JTextField valorIdArmacao;
    private JLabel labelIdFuncionario = new JLabel("Id Funcionario: ");
    private JTextField valorIdFuncionario;
    private JLabel labelIdVenda = new JLabel("Id Venda: ");
    private JTextField valorIdVenda;
    private JLabel labelValorFinal = new JLabel("Valor Venda: ");
    private JTextField valorValorFinal;
    private JButton botaoExcluir = new JButton("Excluir");
    private JButton botaoSalvar = new JButton("Salvar");
    private String[] novoDado = new String[9];
    private static ControleDados dados;
    private int posicao;
    private int opcao;
    private String s;

    public void inserirEditar(int op, ControleDados d, TelaVenda t, int pos) {

        opcao = op;
        posicao = pos;
        dados = d;

        if (op == 1)
            s = "Cadastro de Venda";
        if (op == 2)
            s = "Detalhe de Venda";

        janela = new JFrame(s);

        // Preenche dados com dados da armacao clicada
        if (op == 2) {
            valorNomeVenda = new JTextField(dados.getVendas()[pos].getApelidoVenda(), 200);
            valorIdVenda = new JTextField(String.valueOf(dados.getVendas()[pos].getIdVenda()), 200);
            valorIdArmacao = new JTextField(String.valueOf(dados.getVendas()[pos].getIdArmacao()), 200);
            valorIdCliente = new JTextField(String.valueOf(dados.getVendas()[pos].getIdCliente()), 200);
            valorIdFuncionario = new JTextField(String.valueOf(dados.getVendas()[pos].getIdCliente()), 200);
            valorIdLente = new JTextField(String.valueOf(dados.getVendas()[pos].getIdLente()), 200);
            valorValorFinal = new JTextField(String.valueOf(dados.getVendas()[pos].getValorFinal()), 200);

        } else { // N�o preenche com dados
            valorNomeVenda = new JTextField(200);
            valorIdVenda = new JTextField(200);
            valorIdArmacao = new JTextField(200);
            valorIdCliente = new JTextField(200);
            valorIdFuncionario = new JTextField(200);
            valorIdLente = new JTextField(200);
            valorValorFinal = new JTextField(200);

            botaoSalvar.setBounds(245, 200, 115, 30);
        }

        labelIdVenda.setBounds(30, 50, 150, 25);
        labelIdVenda.setForeground(Color.WHITE);
        valorIdVenda.setBounds(180, 50, 180, 25);
        labelIdArmacao.setBounds(30, 80, 180, 25);
        labelIdArmacao.setForeground(Color.WHITE);
        valorIdArmacao.setBounds(180, 80, 180, 25);
        labelIdFuncionario.setBounds(30, 110, 150, 25);
        labelIdFuncionario.setForeground(Color.WHITE);
        valorIdFuncionario.setBounds(180, 110, 180, 25);
        labelIdCliente.setBounds(30, 140, 180, 25);
        valorIdCliente.setBounds(180, 140, 180, 25);
        labelIdCliente.setForeground(Color.WHITE);
        labelIdLente.setBounds(30, 170, 150, 25);
        labelIdLente.setForeground(Color.WHITE);
        valorIdLente.setBounds(180, 170, 180, 25);
        labelNomeVenda.setBounds(30, 20, 150, 25);
        labelNomeVenda.setForeground(Color.WHITE);
        valorNomeVenda.setBounds(180, 20, 180, 25);
        labelValorFinal.setBounds(30, 200, 150, 25);
        labelValorFinal.setForeground(Color.WHITE);
        valorValorFinal.setBounds(180, 200, 180, 25);

        // Coloca botoes de excluir e salvar
        if (op == 2) {
            botaoSalvar.setBounds(120, 250, 115, 30);
            botaoExcluir.setBounds(245, 250, 115, 30);
            this.janela.add(botaoExcluir);
        }

        this.janela.add(labelIdVenda);
        this.janela.add(valorIdVenda);
        this.janela.add(labelIdArmacao);
        this.janela.add(valorIdArmacao);
        this.janela.add(labelIdLente);
        this.janela.add(valorIdLente);
        this.janela.add(botaoSalvar);
        this.janela.add(labelIdFuncionario);
        this.janela.add(valorIdFuncionario);
        this.janela.add(labelIdCliente);
        this.janela.add(valorIdCliente);
        this.janela.add(labelNomeVenda);
        this.janela.add(valorNomeVenda);
        this.janela.add(labelValorFinal);
        this.janela.add(valorValorFinal);

        this.janela.setLayout(null);
        janela.getContentPane().setBackground(Color.DARK_GRAY);

        this.janela.setSize(500, 400);
        this.janela.setVisible(true);
        janela.setLocationRelativeTo(null);
        janela.setResizable(false);

        botaoSalvar.addActionListener(this);
        botaoExcluir.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src == botaoSalvar) {
            try {
                boolean res;
                if (opcao == 1) // cadastro de nova armacao
                    novoDado[0] = Integer.toString(dados.getQtdArmacao());
                else // edicao de dado existente
                    novoDado[0] = Integer.toString(posicao);

                novoDado[1] = valorIdVenda.getText();
                novoDado[2] = valorIdArmacao.getText();
                novoDado[3] = valorIdFuncionario.getText();
                novoDado[4] = valorIdLente.getText();
                novoDado[6] = valorNomeVenda.getText();
                novoDado[8] = valorValorFinal.getText();

                if (opcao == 1) {
                    novoDado[5] = valorIdCliente.getText();
                    res = dados.inserirEditarVenda(novoDado);
                } else {
                    novoDado[5] = valorIdCliente.getText();
                    res = dados.inserirEditarVenda(novoDado);
                }
                if (res) {
                    mensagemSucessoCadastro();
                } else
                    mensagemErroCadastro();

            } catch (NullPointerException exc1) {
                mensagemErroCadastro();
            } catch (NumberFormatException exc2) {
                mensagemErroCadastro();
            }
        }

        if (src == botaoExcluir) {
            boolean res;

            // exclui Venda

            res = dados.removerVenda(posicao);

            if (res) {

                mensagemSucessoExclusao();

            } else
                mensagemErroExclusaoArmacao();

        }

    }

    public void mensagemSucessoExclusao() {

        JOptionPane.showMessageDialog(null, "Os dados foram excluidos com sucesso!", null,
                JOptionPane.INFORMATION_MESSAGE);
        janela.dispose();
    }

    public void mensagemSucessoCadastro() {
        JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null,
                JOptionPane.INFORMATION_MESSAGE);
        janela.dispose();
    }

    public void mensagemErroCadastro() {
        JOptionPane.showMessageDialog(null,
                "ERRO AO SALVAR OS DADOS!\n " + "Pode ter ocorrido o seguinte:  \n"
                        + "1. Nem todos os campos foram preenchidos \n"
                        + "2. identificacoes e/ou valor nao contem apenas numeros",
                null, JOptionPane.ERROR_MESSAGE);
    }

    public void mensagemErroExclusaoArmacao() {
        JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir o dado.\n "
                + "Verifique se a venda esta cadastrada\n" + " e tente novamente.", null, JOptionPane.ERROR_MESSAGE);
    }

}
