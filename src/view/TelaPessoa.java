package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;

public class TelaPessoa implements ActionListener, ListSelectionListener {
	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroCliente;
	private JButton refreshCliente;
	private JButton cadastroFuncionario;
	private JButton refreshFuncionario;
	private static ControleDados dados;
	private JList<String> listaClientesCadastrados;
	private JList<String> listaFuncionariosCadastrados;
	private String[] listaNomes = new String[50];

	public void mostrarDados(ControleDados d, int op) {
		dados = d;

		switch (op) {
			case 1:// Mostrar dados de alunos cadastrados (JList)
				listaNomes = new ControleCliente(dados).getNomeCliente();
				listaClientesCadastrados = new JList<String>(listaNomes);
				janela = new JFrame("Clientes");
				titulo = new JLabel("Clientes Cadastrados");
				cadastroCliente = new JButton("Cadastrar");
				refreshCliente = new JButton("Refresh");

				titulo.setFont(new Font("Arial", Font.BOLD, 20));
				titulo.setForeground(Color.WHITE);
				titulo.setBounds(90, 10, 250, 30);
				listaClientesCadastrados.setBounds(20, 50, 350, 250);
				listaClientesCadastrados.setBackground(Color.WHITE);
				listaClientesCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
				listaClientesCadastrados.setVisibleRowCount(10);

				cadastroCliente.setBounds(70, 320, 100, 30);
				refreshCliente.setBounds(200, 320, 100, 30);

				janela.setLayout(null);
				janela.getContentPane().setBackground(Color.DARK_GRAY);

				janela.add(titulo);
				janela.add(listaClientesCadastrados);
				janela.add(cadastroCliente);
				janela.add(refreshCliente);

				janela.setSize(400, 420);
				janela.setVisible(true);
				janela.setLocationRelativeTo(null);
				janela.setResizable(false);

				cadastroCliente.addActionListener(this);
				refreshCliente.addActionListener(this);
				listaClientesCadastrados.addListSelectionListener(this);

				break;

			case 2:// Mostrar dados de professores cadastrados (JList)

				listaNomes = new ControleFuncionario(dados).getNomeProf();
				listaFuncionariosCadastrados = new JList<String>(listaNomes);
				janela = new JFrame("Funcionarios");
				titulo = new JLabel("Funcionarios Cadastrados");
				cadastroFuncionario = new JButton("Cadastrar");
				refreshFuncionario = new JButton("Refresh");

				titulo.setFont(new Font("Arial", Font.BOLD, 20));
				titulo.setForeground(Color.WHITE);
				titulo.setBounds(90, 10, 250, 30);
				listaFuncionariosCadastrados.setBounds(20, 50, 350, 250);
				listaFuncionariosCadastrados.setBackground(Color.WHITE);
				listaFuncionariosCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
				listaFuncionariosCadastrados.setVisibleRowCount(10);

				cadastroFuncionario.setBounds(70, 320, 100, 30);
				refreshFuncionario.setBounds(200, 320, 100, 30);

				janela.setLayout(null);
				janela.getContentPane().setBackground(Color.DARK_GRAY);

				janela.add(titulo);
				janela.add(listaFuncionariosCadastrados);
				janela.add(cadastroFuncionario);
				janela.add(refreshFuncionario);

				janela.setSize(400, 420);
				janela.setVisible(true);
				janela.setResizable(false);
				janela.setLocationRelativeTo(null);

				cadastroFuncionario.addActionListener(this);
				refreshFuncionario.addActionListener(this);
				listaFuncionariosCadastrados.addListSelectionListener(this);
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opcao nao encontrada!", null, JOptionPane.ERROR_MESSAGE);
		}

	}

	// Captura eventos relacionados aos botoes da interface
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		// Cadastro de novo aluno
		if (src == cadastroCliente)
			new TelaDetalhePessoa().inserirEditar(1, dados, this, 0);

		// Cadastro de novo professor
		if (src == cadastroFuncionario)
			new TelaDetalhePessoa().inserirEditar(2, dados, this, 0);

		// Atualiza a lista de nomes de alunos mostrada no JList
		if (src == refreshCliente) {
			listaClientesCadastrados.setListData(new ControleCliente(dados).getNomeCliente());
			listaClientesCadastrados.updateUI();
		}

		// Atualiza a lista de nomes de professores mostrada no JList
		if (src == refreshFuncionario) {
			listaFuncionariosCadastrados.setListData(new ControleFuncionario(dados).getNomeProf());
			listaFuncionariosCadastrados.updateUI();
		}

	}

	// Captura eventos relacionados ao JList
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if (e.getValueIsAdjusting() && src == listaClientesCadastrados) {
			new TelaDetalhePessoa().inserirEditar(3, dados, this, listaClientesCadastrados.getSelectedIndex());
		}

		if (e.getValueIsAdjusting() && src == listaFuncionariosCadastrados) {
			new TelaDetalhePessoa().inserirEditar(4, dados, this, listaFuncionariosCadastrados.getSelectedIndex());
		}
	}

}