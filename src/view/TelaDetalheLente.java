package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import controle.*;

/**
 * Mostra por meio de uma interface grafica as opcees disponiveis para customizacao e gerenciamento das vendas realizadas na loja de oculos registrada.
 * @author Vinicius Assumpcao e Andre Correa
 * @version 1.0
 */
public class TelaDetalheLente implements ActionListener {
    private JFrame janela;
    private JLabel labelApelidoLente = new JLabel("apelido da lente: ");
    private JTextField valorApelidoLente;
    private JLabel labelIDLente = new JLabel("id da lente: ");
    private JTextField valorIDLente;
    private JLabel labelFormato = new JLabel("formato da lente: ");
    private JTextField valorFormato;
    private JLabel labelValorLente = new JLabel("Valor: ");
    private JTextField valorValorLente;
    private JLabel labelMedidaGrau = new JLabel("Grau: ");
    private JTextField valorMedidaGrau;
    private JLabel labelIndMedica = new JLabel("indicacao medica: ");
    private JTextField valorIndMedica;
    private JLabel labelFoco = new JLabel("tipo de foco da lente: ");
    private JTextField valorFoco;
    private JLabel labelLaboratorio = new JLabel("laboratorio responsavel: ");
    private JTextField valorLaboratorio;
    private JLabel labelProtecaoUV = new JLabel("protecao UV?: ");
    private JCheckBox valorProtecaoUV;
    private JLabel labelDataProducao = new JLabel("data de producao: ");
    private JTextField valorDataProducao;
    private JLabel labelIDArmacao = new JLabel("id da armacao: ");
    private JTextField valorIDArmacao;
    private JButton botaoExcluir = new JButton("Excluir");
    private JButton botaoSalvar = new JButton("Salvar");
    private String[] novoDado = new String[15];
    private static ControleDados dados;
    private int posicao;
    private int opcao;
    private String s;

    /**
     * Mostra por meio de uma interface op��es de cadastro e customiza��o das lentes
     * .Existem duas op��es: (1) Cadastro de uma nova lente (2) Detalhe de lente
     * 
     * @param op  int que indica op��o selecionada
     * @param d   inst�ncia de ControleDados, respons�vel por acessar dados
     *            armazenados na mesma.
     * @param t   inst�ncia de TelaLente, respons�vel por acessar dados armazenados
     *            na mesma.
     * @param pos int respons�vel por guardar a posi��o na array a ser cadastrado do
     *            atributo a ser editado ou cadastrado
     */

    public void inserirEditar(int op, ControleDados d, TelaLente t, int pos) {

        opcao = op;
        posicao = pos;
        dados = d;

        if (op == 1)
            s = "Cadastro de lente";
        if (op == 2)
            s = "Detalhe de lente";

        janela = new JFrame(s);

        // Preenche dados com dados da armacao clicada
        if (op == 2) {
            valorApelidoLente = new JTextField(dados.getLentes()[pos].getApelidoLente(), 200);
            valorDataProducao = new JTextField(dados.getLentes()[pos].getDataProducao(), 200);
            valorFoco = new JTextField(dados.getLentes()[pos].getFocoLente(), 200);
            valorFormato = new JTextField(String.valueOf(dados.getLentes()[pos].getFormatoLente()), 200);
            valorIDLente = new JTextField(String.valueOf(dados.getLentes()[pos].getIdLente()), 200);
            valorValorLente = new JTextField(String.valueOf(dados.getLentes()[pos].getValorLente()), 200);
            valorMedidaGrau = new JTextField(String.valueOf(dados.getLentes()[pos].getGrauLente()), 200);
            valorIndMedica = new JTextField(dados.getLentes()[pos].getIndMedica(), 200);
            valorLaboratorio = new JTextField(dados.getLentes()[pos].getLaboratorio(), 200);
            valorProtecaoUV = new JCheckBox("", dados.getLentes()[pos].isProtecaoUV());
            valorIDArmacao = new JTextField(String.valueOf(dados.getLentes()[pos].getIdArmacao()), 200);

        } else { // N�o preenche com dados
            valorApelidoLente = new JTextField();
            valorDataProducao = new JTextField();
            valorFoco = new JTextField();
            valorFormato = new JTextField();
            valorIDLente = new JTextField();
            valorValorLente = new JTextField();
            valorMedidaGrau = new JTextField();
            valorIndMedica = new JTextField();
            valorLaboratorio = new JTextField();
            valorProtecaoUV = new JCheckBox();
            valorIDArmacao = new JTextField();

            botaoSalvar.setBounds(245, 370, 115, 30);
        }

        labelApelidoLente.setBounds(30, 20, 180, 25);
        labelApelidoLente.setForeground(Color.WHITE);
        valorApelidoLente.setBounds(180, 20, 180, 25);

        labelIDLente.setBounds(30, 50, 150, 25);
        labelIDLente.setForeground(Color.WHITE);
        valorIDLente.setBounds(180, 50, 180, 25);

        labelValorLente.setBounds(30, 80, 180, 25);
        labelValorLente.setForeground(Color.WHITE);
        valorValorLente.setBounds(180, 80, 180, 25);

        labelIndMedica.setBounds(30, 110, 150, 25);
        labelIndMedica.setForeground(Color.WHITE);
        valorIndMedica.setBounds(180, 110, 180, 25);

        labelFormato.setBounds(30, 140, 150, 25);
        labelFormato.setForeground(Color.WHITE);
        valorFormato.setBounds(180, 140, 180, 25);

        labelMedidaGrau.setBounds(30, 170, 150, 25);
        labelMedidaGrau.setForeground(Color.WHITE);
        valorMedidaGrau.setBounds(180, 170, 180, 25);

        labelFoco.setBounds(30, 200, 150, 25);
        labelFoco.setForeground(Color.WHITE);
        valorFoco.setBounds(180, 200, 180, 25);

        labelLaboratorio.setBounds(30, 230, 150, 25);
        labelLaboratorio.setForeground(Color.WHITE);
        valorLaboratorio.setBounds(180, 230, 180, 25);

        labelProtecaoUV.setBounds(30, 260, 150, 25);
        labelProtecaoUV.setForeground(Color.WHITE);
        valorProtecaoUV.setBounds(180, 260, 180, 25);

        labelDataProducao.setBounds(30, 290, 150, 25);
        labelDataProducao.setForeground(Color.WHITE);
        valorDataProducao.setBounds(180, 290, 180, 25);

        labelIDArmacao.setBounds(30, 320, 150, 25);
        labelIDArmacao.setForeground(Color.WHITE);
        valorIDArmacao.setBounds(180, 320, 180, 25);

        // Coloca botoes de excluir e salvar
        if (op == 2) {
            botaoSalvar.setBounds(120, 370, 115, 30);
            botaoExcluir.setBounds(245, 370, 115, 30);
            this.janela.add(botaoExcluir);
        }

        this.janela.add(labelIndMedica);
        this.janela.add(valorIndMedica);
        this.janela.add(labelFoco);
        this.janela.add(valorFoco);
        this.janela.add(labelIDArmacao);
        this.janela.add(valorIDArmacao);
        this.janela.add(labelApelidoLente);
        this.janela.add(valorApelidoLente);
        this.janela.add(labelIDLente);
        this.janela.add(valorIDLente);
        this.janela.add(labelValorLente);
        this.janela.add(valorValorLente);
        this.janela.add(labelFormato);
        this.janela.add(valorFormato);
        this.janela.add(labelMedidaGrau);
        this.janela.add(valorMedidaGrau);
        this.janela.add(labelFoco);
        this.janela.add(valorFoco);
        this.janela.add(labelLaboratorio);
        this.janela.add(valorLaboratorio);
        this.janela.add(labelProtecaoUV);
        this.janela.add(valorProtecaoUV);
        this.janela.add(labelDataProducao);
        this.janela.add(valorDataProducao);
        this.janela.add(labelIDArmacao);
        this.janela.add(valorIDArmacao);
        this.janela.add(botaoSalvar);

        this.janela.setLayout(null);
        janela.getContentPane().setBackground(Color.DARK_GRAY);

        this.janela.setSize(500, 450);
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
                    novoDado[0] = Integer.toString(dados.getQntLentes());
                else { // edicao de dado existente
                    novoDado[0] = Integer.toString(posicao);
                }
                novoDado[1] = valorApelidoLente.getText();
                novoDado[2] = valorDataProducao.getText();
                novoDado[3] = valorFoco.getText();
                novoDado[4] = valorFormato.getText();
                novoDado[5] = valorIDLente.getText();
                novoDado[6] = valorValorLente.getText();
                novoDado[7] = valorMedidaGrau.getText();
                novoDado[8] = valorIndMedica.getText();
                novoDado[9] = valorLaboratorio.getText();
                novoDado[10] = valorProtecaoUV.getText();
                novoDado[11] = valorIDArmacao.getText();

                if (opcao == 1) {
                    res = dados.inserirEditarLente(novoDado);
                } else {
                    res = dados.inserirEditarLente(novoDado);
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
            boolean res = false;

            res = dados.removerLente(posicao);
            if (res)
                mensagemSucessoExclusao();
            else
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
                        + "2. id da lente, id da armacao, valor da lente e/ou grau da lente nao contem apenas numeros",
                null, JOptionPane.ERROR_MESSAGE);
    }

    public void mensagemErroExclusaoArmacao() {
        JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir o dado.\n "
                + "Verifique se a lente esta cadastrada\n" + " e tente novamente.", null, JOptionPane.ERROR_MESSAGE);
    }
}
