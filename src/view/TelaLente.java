package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;

public class TelaLente implements ActionListener, ListSelectionListener {

    private JFrame janela;
    private JLabel titulo;
    private JButton refreshLente;
    private static ControleDados dados;
    private JList<String> listaLentesCadastradas;
    private String[] listaLentes = new String[50];

    public void mostrarDadosLentes(ControleDados d) {
        dados = d;

        // Mostrar dados de Armacoes cadastrados (JList)
        listaLentes = new ControleLente(dados).getApelidoLente();
        listaLentesCadastradas = new JList<String>(listaLentes);
        janela = new JFrame("Lentes");
        titulo = new JLabel("Lentes Cadastradas");
        refreshLente = new JButton("Refresh");

        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setForeground(Color.WHITE);
        titulo.setBounds(90, 10, 250, 30);
        listaLentesCadastradas.setBounds(20, 50, 350, 120);
        listaLentesCadastradas.setBackground(Color.WHITE);
        listaLentesCadastradas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        listaLentesCadastradas.setVisibleRowCount(10);

        cadastroLente.setBounds(70, 177, 100, 30);
        refreshLente.setBounds(200, 177, 100, 30);

        janela.setLayout(null);
        janela.getContentPane().setBackground(Color.DARK_GRAY);

        janela.add(titulo);
        janela.add(listaLentesCadastradas);
        janela.add(cadastroLente);
        janela.add(refreshLente);

        janela.setSize(400, 250);
        janela.setVisible(true);
        janela.setLocationRelativeTo(null);
        janela.setResizable(false);

        cadastroLente.addActionListener(this);
        refreshLente.addActionListener(this);
        listaLentesCadastradas.addListSelectionListener(this);

    }

    // Captura eventos relacionados aos bot�es da interface

    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        // Cadastro de nova Armacao
        if (src == cadastroLente)
            new TelaDetalheArmacao().inserirEditar(1, dados, this, 0);

        // Atualiza a lista de nomes das armacoes mostrada no JList
        if (src == refreshLente) {
            listaLentesCadastradas.setListData(new ControleArmacao(dados).getNomeArmacao());
            listaLentesCadastradas.updateUI();
        }

    }

    // Captura eventos relacionados ao JList
    public void valueChanged(ListSelectionEvent e) {
        Object src = e.getSource();

        if (e.getValueIsAdjusting() && src == listaLentesCadastradas) {
            new TelaDetalheArmacao().inserirEditar(2, dados, this, listaLentesCadastradas.getSelectedIndex());
        }
    }

}
