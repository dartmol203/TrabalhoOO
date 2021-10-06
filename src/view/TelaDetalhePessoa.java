package view;

/**
 * Mostra por meio de uma interface gr�fica as op��es dispon�veis para customiza��o e gerenciamento dos clientes e funcion�rios relacionados a loja de �culos registrada.
 * @autor Vin�cius Assump��o e Andr� Corr�a
 * @vers�o 1.0
 */

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import controle.*;

public class TelaDetalhePessoa implements ActionListener {

	private JFrame janela;
	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	private JLabel labelDataC = new JLabel("Data Primeira Compra: ");
	private JTextField valorDataC;
	private JLabel labelsalario = new JLabel("Salario: ");
	private JTextField valorsalario;
	private JLabel labelEnd = new JLabel("Endereco: ");
	private JTextField valorEnd;
	private JLabel labelCPF = new JLabel("CPF: ");
	private JTextField valorCPF;
	private JLabel labelID = new JLabel("Numero da Identidade: ");
	private JTextField valorID;
	private JLabel labelTelefone = new JLabel("Telefone");
	private JTextField valorDDD;
	private JTextField valorTelefone;
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[9];
	private static ControleDados dados;
	private int posicao;
	private int opcao;
	private String s;

	/**
	 * Mostra por meio de uma interface op��es de cadastro e customiza��o dos
	 * clientes e funcion�rios .Existem quatro op��es: (1) Cadastro de cliente (2)
	 * cadastro de funcion�rio (3) detalhe de cliente (4) detalhe de funcion�rio
	 * 
	 * @param op  int que indica op��o selecionada
	 * @param d   inst�ncia de ControleDados, respons�vel por acessar dados
	 *            armazenados na mesma.
	 * @param p   inst�ncia de TelaPessoa, respons�vel por acessar dados armazenados
	 *            na mesma.
	 * @param pos int respons�vel por guardar a posi��o na array a ser cadastrado do
	 *            atributo a ser editado ou cadastrado
	 */

	public void inserirEditar(int op, ControleDados d, TelaPessoa p, int pos) {

		opcao = op;
		posicao = pos;
		dados = d;

		if (op == 1)
			s = "Cadastro de Cliente";
		if (op == 2)
			s = "Cadastro de Funcionario";
		if (op == 3)
			s = "Detalhe de Cliente";
		if (op == 4)
			s = "Detalhe de Funcionario";

		janela = new JFrame(s);

		// Preenche dados com dados do cliente clicado
		if (op == 3) {
			valorNome = new JTextField(dados.getClientes()[pos].getNome(), 200);
			valorEnd = new JTextField(dados.getClientes()[pos].getEndereco(), 200);
			valorDataC = new JTextField(dados.getClientes()[pos].getDataPrimC(), 200);
			valorsalario = new JTextField(200);
			valorCPF = new JTextField(String.valueOf(dados.getClientes()[pos].getCPF()), 200);
			valorID = new JTextField(String.valueOf(dados.getClientes()[pos].getNumID()), 200);
			valorDDD = new JTextField(String.valueOf(dados.getClientes()[pos].getNumTel().getDDD()), 3);
			valorTelefone = new JTextField(String.valueOf(dados.getClientes()[pos].getNumTel().getNumero()), 10);

		} else if (op == 4) { // Preenche dados com dados do funcionario clicado
			valorNome = new JTextField(dados.getFuncionarios()[pos].getNome(), 200);
			valorsalario = new JTextField(String.valueOf(dados.getFuncionarios()[pos].getSalario()), 200);
			valorDataC = new JTextField(200);
			valorEnd = new JTextField(dados.getFuncionarios()[pos].getEndereco(), 200);
			valorCPF = new JTextField(String.valueOf(dados.getFuncionarios()[pos].getCPF()), 200);
			valorID = new JTextField(String.valueOf(dados.getFuncionarios()[pos].getNumID()), 200);
			valorDDD = new JTextField(String.valueOf(dados.getFuncionarios()[pos].getNumTel().getDDD()), 3);
			valorTelefone = new JTextField(String.valueOf(dados.getFuncionarios()[pos].getNumTel().getNumero()), 10);

		} else { // N�o preenche com dados

			valorNome = new JTextField(200);
			valorEnd = new JTextField(200);
			valorsalario = new JTextField(200);
			valorCPF = new JTextField(200);
			valorID = new JTextField(200);
			valorDataC = new JTextField(200);
			valorDDD = new JTextField(3);
			valorTelefone = new JTextField(10);

			botaoSalvar.setBounds(250, 200, 140, 30);
		}

		labelNome.setBounds(30, 20, 150, 25);
		labelNome.setForeground(Color.WHITE);
		valorNome.setBounds(180, 20, 180, 25);
		labelDataC.setBounds(30, 140, 180, 25);
		labelDataC.setForeground(Color.WHITE);
		valorDataC.setBounds(180, 140, 180, 25);
		labelEnd.setBounds(30, 50, 150, 25);
		labelEnd.setForeground(Color.WHITE);
		valorEnd.setBounds(180, 50, 180, 25);
		labelsalario.setBounds(30, 140, 180, 25);
		labelsalario.setForeground(Color.WHITE);
		valorsalario.setBounds(180, 140, 180, 25);
		labelCPF.setBounds(30, 80, 150, 25);
		labelCPF.setForeground(Color.WHITE);
		valorCPF.setBounds(180, 80, 180, 25);
		labelID.setBounds(30, 110, 150, 25);
		labelID.setForeground(Color.WHITE);
		valorID.setBounds(180, 110, 180, 25);
		labelTelefone.setBounds(30, 170, 150, 25);
		labelTelefone.setForeground(Color.WHITE);
		valorDDD.setBounds(180, 170, 28, 25);
		valorTelefone.setBounds(210, 170, 65, 25);

		// Coloca os campos relacionados a primeira compra do cliente
		if (op == 1 || op == 3) {
			this.janela.add(labelDataC);
			this.janela.add(valorDataC);

		}

		// Coloca campos relacionados a salario se funcionario
		if (op == 2 || op == 4) {

			this.janela.add(labelsalario);
			this.janela.add(valorsalario);
		}

		// Coloca botoes de excluir e salvar
		if (op == 3 || op == 4) {
			botaoSalvar.setBounds(120, 210, 115, 30);
			botaoExcluir.setBounds(245, 210, 115, 30);
			this.janela.add(botaoExcluir);
		}

		this.janela.add(labelNome);
		this.janela.add(valorNome);
		this.janela.add(labelCPF);
		this.janela.add(valorCPF);
		this.janela.add(labelID);
		this.janela.add(valorID);
		this.janela.add(labelTelefone);
		this.janela.add(valorDDD);
		this.janela.add(valorTelefone);
		this.janela.add(botaoSalvar);
		this.janela.add(labelEnd);
		this.janela.add(valorEnd);

		this.janela.setLayout(null);
		janela.getContentPane().setBackground(Color.DARK_GRAY);

		this.janela.setSize(500, 300);
		this.janela.setVisible(true);
		this.janela.setLocationRelativeTo(null);
		janela.setResizable(false);

		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if (src == botaoSalvar) {
			try {
				boolean res;
				if (opcao == 1) // cadastro de novo cliente
					novoDado[0] = Integer.toString(dados.getQtdClientes());
				else if (opcao == 2) // cadastro de novo funcionario
					novoDado[0] = Integer.toString(dados.getQtdFuncionarios());
				else // edicao de dado existente
					novoDado[0] = Integer.toString(posicao);

				novoDado[1] = valorNome.getText();
				novoDado[2] = valorEnd.getText();
				novoDado[3] = valorCPF.getText();
				novoDado[4] = valorID.getText();
				novoDado[5] = valorDDD.getText();
				novoDado[6] = valorTelefone.getText();

				if (opcao == 1 || opcao == 3) {
					novoDado[7] = valorDataC.getText();
					res = dados.inserirEditarClientes(novoDado);
				} else {
					novoDado[7] = valorsalario.getText();
					res = dados.inserirEditarFuncionarios(novoDado);
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

			if (opcao == 3) {// exclui cliente
				res = dados.removerCliente(posicao);
				if (res)
					mensagemSucessoExclusao();
				else
					mensagemErroExclusaoAluno();
			}

			if (opcao == 4) { // exclui funcionario
				res = dados.removerFuncionarios(posicao);
				if (res)
					mensagemSucessoExclusao();
				else
					mensagemErroExclusaoProf();
			}

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
				"ERRO AO SALVAR OS DADOS!\n " + "Pode ter ocorrido um dos dois erros a seguir:  \n"
						+ "1. Nem todos os campos foram preenchidos \n"
						+ "2. CPF, identidade, DDD e telefone nao contem apenas numeros",
				null, JOptionPane.ERROR_MESSAGE);
	}

	public void mensagemErroExclusaoAluno() {
		JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir o dado.\n "
				+ "Verifique se o cliente esta cadastrado\n" + " e tente novamente.", null, JOptionPane.ERROR_MESSAGE);
	}

	public void mensagemErroExclusaoProf() {
		JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir o dado.\n "
				+ "Verifique se o funcionario esta cadastrado\n" + " e tente novamente.", null,
				JOptionPane.ERROR_MESSAGE);
	}

}
