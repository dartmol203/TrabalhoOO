package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;

/**
 * Mostra por meio de uma interface grafica as opcoes disponiveis para customizacao da loja de oculos.
 * @author Vinicius Assumpcao e Andre Correa
 * @version 1.0
 */
public class TelaLoja implements ActionListener, ListSelectionListener {
    private JFrame janela;
    private JLabel titulo;
    private JButton refreshLoja;
    private ControleDados dados;
    private JList<String> listaLojasCadastradas;
    private String[] listaNomes = new String[50];

    /**
     * Mostra na interface grafica os dados de interesse do usuario a loja de oculos
     * cadastrada.
     * 
     * @param dado instancia de ControleDados, responsavel por acessar dados
     *             armazenados na mesma.
     */

    public void mostrarLoja(ControleDados dado) {
        dados = dado;
        listaNomes = new ControleLoja(dados).getNomeLojas();
        listaLojasCadastradas = new JList<String>(listaNomes);
        janela = new JFrame("lojas");
        titulo = new JLabel("lojas Cadastradas");
        refreshLoja = new JButton("Refresh");

        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setForeground(Color.WHITE);
        titulo.setBounds(90, 10, 250, 30);
        listaLojasCadastradas.setBounds(20, 50, 350, 120);
        listaLojasCadastradas.setBackground(Color.WHITE);
        listaLojasCadastradas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        listaLojasCadastradas.setVisibleRowCount(10);

        refreshLoja.setBounds(150, 177, 100, 30);

        janela.setLayout(null);
        janela.getContentPane().setBackground(Color.DARK_GRAY);

        janela.add(titulo);
        janela.add(listaLojasCadastradas);
        janela.add(refreshLoja);

        janela.setSize(400, 250);
        janela.setVisible(true);
        janela.setLocationRelativeTo(null);
        janela.setResizable(false);

        refreshLoja.addActionListener(this);
        listaLojasCadastradas.addListSelectionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        // Atualiza a lista de nomes de lojas mostrada no JList
        if (src == refreshLoja) {
            listaLojasCadastradas.setListData(new ControleLoja(dados).getNomeLojas());
            listaLojasCadastradas.updateUI();
        }

    }

    // Captura eventos relacionados ao JList
    public void valueChanged(ListSelectionEvent e) {
        Object src = e.getSource();

        if (e.getValueIsAdjusting() && src == listaLojasCadastradas) {
            new TelaDetalheLoja().inserirEditar(dados, this, listaLojasCadastradas.getSelectedIndex());
        }

    }

}
