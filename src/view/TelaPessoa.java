package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controle.*;

public class TelaPessoa implements ActionListener, ListSelectionListener {
	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroAluno;
	private JButton refreshAluno;
	private JButton cadastroProf;
	private JButton refreshProf;
	private static ControleDados dados;
	private JList<String> listaAlunosCadastrados;
	private JList<String> listaProfsCadastrados;
	private String[] listaNomes = new String[50];

	public void mostrarDados(ControleDados d, int op) {
		dados = d;

		switch (op) {
			case 1:// Mostrar dados de alunos cadastrados (JList)
				listaNomes = new ControleAluno(dados).getNomeAluno();
				listaAlunosCadastrados = new JList<String>(listaNomes);
				janela = new JFrame("Clientes");
				titulo = new JLabel("Clientes Cadastrados");
				cadastroAluno = new JButton("Cadastrar");
				refreshAluno = new JButton("Refresh");

				titulo.setFont(new Font("Arial", Font.BOLD, 20));
				titulo.setForeground(Color.WHITE);
				titulo.setBounds(90, 10, 250, 30);
				listaAlunosCadastrados.setBounds(20, 50, 350, 120);
				listaAlunosCadastrados.setBackground(Color.WHITE);
				listaAlunosCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
				listaAlunosCadastrados.setVisibleRowCount(10);

				cadastroAluno.setBounds(70, 177, 100, 30);
				refreshAluno.setBounds(200, 177, 100, 30);

				janela.setLayout(null);
				janela.getContentPane().setBackground(Color.DARK_GRAY);

				janela.add(titulo);
				janela.add(listaAlunosCadastrados);
				janela.add(cadastroAluno);
				janela.add(refreshAluno);

				janela.setSize(400, 250);
				janela.setVisible(true);

				cadastroAluno.addActionListener(this);
				refreshAluno.addActionListener(this);
				listaAlunosCadastrados.addListSelectionListener(this);

				break;

			case 2:// Mostrar dados de professores cadastrados (JList)

				listaNomes = new ControleProfessor(dados).getNomeProf();
				listaProfsCadastrados = new JList<String>(listaNomes);
				janela = new JFrame("Funcionarios");
				titulo = new JLabel("Funcionarios Cadastrados");
				cadastroProf = new JButton("Cadastrar");
				refreshProf = new JButton("Refresh");

				titulo.setFont(new Font("Arial", Font.BOLD, 20));
				titulo.setForeground(Color.WHITE);
				titulo.setBounds(90, 10, 250, 30);
				listaProfsCadastrados.setBounds(20, 50, 350, 120);
				listaProfsCadastrados.setBackground(Color.WHITE);
				listaProfsCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
				listaProfsCadastrados.setVisibleRowCount(10);

				cadastroProf.setBounds(70, 177, 100, 30);
				refreshProf.setBounds(200, 177, 100, 30);

				janela.setLayout(null);
				janela.getContentPane().setBackground(Color.DARK_GRAY);

				janela.add(titulo);
				janela.add(listaProfsCadastrados);
				janela.add(cadastroProf);
				janela.add(refreshProf);

				janela.setSize(400, 250);
				janela.setVisible(true);

				cadastroProf.addActionListener(this);
				refreshProf.addActionListener(this);
				listaProfsCadastrados.addListSelectionListener(this);
				break;

			default:
				JOptionPane.showMessageDialog(null, "Op��o n�o encontrada!", null, JOptionPane.ERROR_MESSAGE);
		}

	}

	// Captura eventos relacionados aos bot�es da interface
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		// Cadastro de novo aluno
		if (src == cadastroAluno)
			new TelaDetalhePessoa().inserirEditar(1, dados, this, 0);

		// Cadastro de novo professor
		if (src == cadastroProf)
			new TelaDetalhePessoa().inserirEditar(2, dados, this, 0);

		// Atualiza a lista de nomes de alunos mostrada no JList
		if (src == refreshAluno) {
			listaAlunosCadastrados.setListData(new ControleAluno(dados).getNomeAluno());
			listaAlunosCadastrados.updateUI();
		}

		// Atualiza a lista de nomes de professores mostrada no JList
		if (src == refreshProf) {
			listaProfsCadastrados.setListData(new ControleProfessor(dados).getNomeProf());
			listaProfsCadastrados.updateUI();
		}

	}

	// Captura eventos relacionados ao JList
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if (e.getValueIsAdjusting() && src == listaAlunosCadastrados) {
			new TelaDetalhePessoa().inserirEditar(3, dados, this, listaAlunosCadastrados.getSelectedIndex());
		}

		if (e.getValueIsAdjusting() && src == listaProfsCadastrados) {
			new TelaDetalhePessoa().inserirEditar(4, dados, this, listaProfsCadastrados.getSelectedIndex());
		}
	}

}