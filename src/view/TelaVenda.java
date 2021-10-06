
package view;

/**
 * Mostra por meio de uma interface gr�fica as op��es dispon�veis para customiza��o e gerenciamento das vendas realizadas na loja de �culos registrada.
 * @autor Vin�cius Assump��o e Andr� Corr�a
 * @vers�o 1.0
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;

public class TelaVenda implements ListSelectionListener, ActionListener {

    private JFrame janela;
    private JLabel titulo;
    private JButton cadastroVenda;
    private JButton refreshVenda;
    private static ControleDados dados;
    private JList<String> listaVendasCadastradas;
    private String[] listaNomes = new String[50];

    /**
     * Mostra na interface gr�fica da op��o selecionada as vendas cadastradas de um
     * produto.Existe uma op��o de escolha: (1)Vendas cadastradas
     * 
     * @param d  inst�ncia de ControleDados, respons�vel por acessar dados
     *           armazenados na mesma.
     * @param op um int que indica a op��o selecionada.
     */

    public void mostrarDadosV(ControleDados d, int op) {
        dados = d;

        switch (op) {

            case 1:

                // Mostrar dados de Vendas cadastrados (JList)
                listaNomes = new ControleVenda(dados).getApelidoVenda();
                listaVendasCadastradas = new JList<String>(listaNomes);
                janela = new JFrame("vendas");
                titulo = new JLabel("vendas Cadastradas");
                cadastroVenda = new JButton("Cadastrar");
                refreshVenda = new JButton("Refresh");

                titulo.setFont(new Font("Arial", Font.BOLD, 20));
                titulo.setForeground(Color.WHITE);
                titulo.setBounds(90, 10, 250, 30);
                listaVendasCadastradas.setBounds(20, 50, 350, 250);
                listaVendasCadastradas.setBackground(Color.WHITE);
                listaVendasCadastradas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
                listaVendasCadastradas.setVisibleRowCount(10);

                cadastroVenda.setBounds(70, 320, 100, 30);
                refreshVenda.setBounds(200, 320, 100, 30);

                janela.setLayout(null);
                janela.getContentPane().setBackground(Color.DARK_GRAY);

                janela.add(titulo);
                janela.add(listaVendasCadastradas);
                janela.add(cadastroVenda);
                janela.add(refreshVenda);

                janela.setSize(400, 420);
                janela.setVisible(true);
                janela.setLocationRelativeTo(null);
                janela.setResizable(false);

                cadastroVenda.addActionListener(this);
                refreshVenda.addActionListener(this);
                listaVendasCadastradas.addListSelectionListener(this);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opcao nao encontrada!", null, JOptionPane.ERROR_MESSAGE);
        }

    }

    // Captura eventos relacionados aos botoes da interface

    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        // Cadastro de nova venda
        if (src == cadastroVenda)
            new TelaDetalheVenda().inserirEditar(1, dados, this, 0);

        // Atualiza a lista de nomes das vendas mostrada no JList
        if (src == refreshVenda) {
            listaVendasCadastradas.setListData(new ControleVenda(dados).getApelidoVenda());
            listaVendasCadastradas.updateUI();
        }

    }

    // Captura eventos relacionados ao JList
    public void valueChanged(ListSelectionEvent e) {
        Object src = e.getSource();

        if (e.getValueIsAdjusting() && src == listaVendasCadastradas) {
            new TelaDetalheVenda().inserirEditar(2, dados, this, listaVendasCadastradas.getSelectedIndex());
        }
    }

}
