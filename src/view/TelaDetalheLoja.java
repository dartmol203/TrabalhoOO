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

/**
 * Mostra por meio de uma interface grafica as opcees disponiveis para customizacao e gerenciamento da loja de oculos registrada.
 * @author Vinicius Assumpcao e Andre Correa
 * @version 1.0
 */
public class TelaDetalheLoja implements ActionListener {
    private JFrame janela;
    private JLabel labelNome = new JLabel("Nome da loja: ");
    private JTextField valorNome;
    private JLabel labelEndereco = new JLabel("endereco: ");
    private JTextField valorEndereco;
    private JLabel labelCEP = new JLabel("CEP: ");
    private JTextField valorCEP;
    private JLabel labelTelefone = new JLabel("Telefone");
    private JTextField valorDDD;
    private JTextField valorTelefone;
    private JButton botaoSalvar = new JButton("Salvar");
    private String[] novoDado = new String[9];
    private static ControleDados dados;
    private int posicao;
    private String s;

    /**
     * Mostra por meio de uma interface grafica opcoes de cadastro e customizacao da
     * loja.
     * 
     * @param d   instancia de ControleDados, responsavel por acessar dados
     *            armazenados na mesma.
     * @param l   instancia de TelaLoja, responsavel por acessar dados armazenados
     *            na mesma.
     * @param pos int responsavel por guardar a posicao na array a ser cadastrado do
     *            atributo a ser editado ou cadastrado.
     */

    public void inserirEditar(ControleDados d, TelaLoja l, int pos) {

        posicao = pos;
        dados = d;

        s = "Detalhe de Loja";

        janela = new JFrame(s);

        // Preenche dados com dados da loja clicado
        valorNome = new JTextField(dados.getLojas()[pos].getNomeLoja(), 200);
        valorEndereco = new JTextField(dados.getLojas()[pos].getEndereco(), 200);
        valorCEP = new JTextField(String.valueOf(dados.getLojas()[pos].getCep()), 200);
        valorDDD = new JTextField(String.valueOf(dados.getLojas()[pos].getTelefone().getDDD()), 3);
        valorTelefone = new JTextField(String.valueOf(dados.getLojas()[pos].getTelefone().getNumero()), 10);

        labelNome.setBounds(30, 20, 150, 25);
        labelNome.setForeground(Color.WHITE);
        valorNome.setBounds(180, 20, 180, 25);
        labelEndereco.setBounds(30, 80, 180, 25);
        labelEndereco.setForeground(Color.WHITE);
        valorEndereco.setBounds(180, 80, 180, 25);
        labelCEP.setBounds(30, 50, 150, 25);
        labelCEP.setForeground(Color.WHITE);
        valorCEP.setBounds(180, 50, 180, 25);
        labelTelefone.setBounds(30, 110, 150, 25);
        labelTelefone.setForeground(Color.WHITE);
        valorDDD.setBounds(180, 110, 28, 25);
        valorTelefone.setBounds(210, 110, 65, 25);
        botaoSalvar.setBounds(210, 170, 70, 25);

        this.janela.add(labelNome);
        this.janela.add(valorNome);
        this.janela.add(labelEndereco);
        this.janela.add(valorEndereco);
        this.janela.add(labelCEP);
        this.janela.add(valorCEP);
        this.janela.add(labelTelefone);
        this.janela.add(valorDDD);
        this.janela.add(valorTelefone);
        this.janela.add(botaoSalvar);

        this.janela.setLayout(null);
        janela.getContentPane().setBackground(Color.DARK_GRAY);

        this.janela.setSize(500, 250);
        this.janela.setVisible(true);
        this.janela.setLocationRelativeTo(null);
        janela.setResizable(false);

        botaoSalvar.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src == botaoSalvar) {
            try {
                boolean res;
                novoDado[0] = Integer.toString(posicao);

                novoDado[1] = valorNome.getText();
                novoDado[2] = valorEndereco.getText();
                novoDado[3] = valorCEP.getText();
                novoDado[4] = valorDDD.getText();
                novoDado[5] = valorTelefone.getText();

                res = dados.inserirEditarLojas(novoDado);

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

    }

    public void mensagemSucessoCadastro() {
        JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null,
                JOptionPane.INFORMATION_MESSAGE);
        janela.dispose();
    }

    public void mensagemErroCadastro() {
        JOptionPane.showMessageDialog(null,
                "ERRO AO SALVAR OS DADOS!\n " + "Pode ter ocorrido um dos dois erros a seguir:  \n"
                        + "1. Nem todos os campos foram preenchidos \n"
                        + "2. CEP, DDD e telefone nao contem apenas numeros",
                null, JOptionPane.ERROR_MESSAGE);
    }

}
