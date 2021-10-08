package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;

/**
 * Mostra por meio de uma interface grafica as lentes na loja de oculos registrada.
 * @author Vinicius Assumpcao e Andre Correa
 * @version 1.0
 */
public class TelaLente implements ActionListener, ListSelectionListener {

    private JFrame janela;
    private JLabel titulo;
    private JButton cadastroLente;
    private JButton refreshLente;
    private static ControleDados dados;
    private JList<String> listaLentesCadastradas;
    private String[] listaLentes = new String[50];

    /**
     * Mostra na interface grafica os dados de interesse do usuario a lente
     * cadastrada.
     * 
     * @param d instancia de ControleDados, responsavel por acessar dados
     *          armazenados na mesma.
     */

    public void mostrarDadosLentes(ControleDados d) {
        dados = d;

        // Mostrar dados de lentes cadastrados (JList)
        listaLentes = new ControleLente(dados).getApelidoLente();
        listaLentesCadastradas = new JList<String>(listaLentes);
        janela = new JFrame("Lentes");
        titulo = new JLabel("Lentes Cadastradas");
        cadastroLente = new JButton("Cadastrar");
        refreshLente = new JButton("Refresh");

        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setForeground(Color.WHITE);
        titulo.setBounds(90, 10, 250, 30);
        listaLentesCadastradas.setBounds(20, 50, 350, 250);
        listaLentesCadastradas.setBackground(Color.WHITE);
        listaLentesCadastradas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        listaLentesCadastradas.setVisibleRowCount(10);

        cadastroLente.setBounds(70, 320, 100, 30);
        refreshLente.setBounds(200, 320, 100, 30);

        janela.setLayout(null);
        janela.getContentPane().setBackground(Color.DARK_GRAY);

        janela.add(titulo);
        janela.add(listaLentesCadastradas);
        janela.add(cadastroLente);
        janela.add(refreshLente);

        janela.setSize(400, 420);
        janela.setVisible(true);
        janela.setLocationRelativeTo(null);
        janela.setResizable(false);

        cadastroLente.addActionListener(this);
        refreshLente.addActionListener(this);
        listaLentesCadastradas.addListSelectionListener(this);

    }

    // Captura eventos relacionados aos botoes da interface

    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        // Atualiza a lista de nomes das lentes mostrada no JList
        if (src == refreshLente) {
            listaLentesCadastradas.setListData(new ControleLente(dados).getApelidoLente());
            listaLentesCadastradas.updateUI();
        }
        if (src == cadastroLente) {
            new TelaDetalheLente().inserirEditar(1, dados, this, 0);
        }

    }

    // Captura eventos relacionados ao JList
    public void valueChanged(ListSelectionEvent e) {
        Object src = e.getSource();

        if (e.getValueIsAdjusting() && src == listaLentesCadastradas) {
            new TelaDetalheLente().inserirEditar(2, dados, this, listaLentesCadastradas.getSelectedIndex());
        }
    }

}
