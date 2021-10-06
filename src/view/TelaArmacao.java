package view;

/**
 * Mostra por meio de uma interface gr�fica as op��es dispon�veis para customiza��o e gerenciamento das arma��es na loja de �culos registrada.
 * @autor Vin�cius Assump��o e Andr� Corr�a
 * @vers�o 1.0
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;

public class TelaArmacao implements ActionListener, ListSelectionListener {

	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroArmacao;
	private JButton refreshArmacao;
	private static ControleDados dados;
	private JList<String> listaArmacoesCadastradas;
	private String[] listaNomes = new String[50];

	/**
	 * Mostra na interface gr�fica da op��o selecionada as arma��es cadastradas
	 * .Existe uma op��o de escolha: (1)Arma��es cadastradas
	 * 
	 * @param d  inst�ncia de ControleDados, respons�vel por acessar dados
	 *           armazenados na mesma.
	 * @param op int que indica op��o selecionada
	 */

	public void mostrarDadosA(ControleDados d, int op) {
		dados = d;

		switch (op) {

			case 1:

				// Mostrar dados de Armacoes cadastrados (JList)
				listaNomes = new ControleArmacao(dados).getNomeArmacao();
				listaArmacoesCadastradas = new JList<String>(listaNomes);
				janela = new JFrame("Armacoes");
				titulo = new JLabel("Armacoes Cadastradas");
				cadastroArmacao = new JButton("Cadastrar");
				refreshArmacao = new JButton("Refresh");

				titulo.setFont(new Font("Arial", Font.BOLD, 20));
				titulo.setForeground(Color.WHITE);
				titulo.setBounds(90, 10, 250, 30);
				listaArmacoesCadastradas.setBounds(20, 50, 350, 250);
				listaArmacoesCadastradas.setBackground(Color.WHITE);
				listaArmacoesCadastradas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
				listaArmacoesCadastradas.setVisibleRowCount(10);

				cadastroArmacao.setBounds(70, 320, 100, 30);
				refreshArmacao.setBounds(200, 320, 100, 30);

				janela.setLayout(null);
				janela.getContentPane().setBackground(Color.DARK_GRAY);

				janela.add(titulo);
				janela.add(listaArmacoesCadastradas);
				janela.add(cadastroArmacao);
				janela.add(refreshArmacao);

				janela.setSize(400, 420);
				janela.setVisible(true);
				janela.setLocationRelativeTo(null);
				janela.setResizable(false);

				cadastroArmacao.addActionListener(this);
				refreshArmacao.addActionListener(this);
				listaArmacoesCadastradas.addListSelectionListener(this);
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opcao nao encontrada!", null, JOptionPane.ERROR_MESSAGE);
		}

	}
	// Captura eventos relacionados aos botoes da interface

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		// Cadastro de nova Armacao
		if (src == cadastroArmacao)
			new TelaDetalheArmacao().inserirEditar(1, dados, this, 0);

		// Atualiza a lista de nomes das armacoes mostrada no JList
		if (src == refreshArmacao) {
			listaArmacoesCadastradas.setListData(new ControleArmacao(dados).getNomeArmacao());
			listaArmacoesCadastradas.updateUI();
		}

	}

	// Captura eventos relacionados ao JList
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if (e.getValueIsAdjusting() && src == listaArmacoesCadastradas) {
			new TelaDetalheArmacao().inserirEditar(2, dados, this, listaArmacoesCadastradas.getSelectedIndex());
		}
	}

}
