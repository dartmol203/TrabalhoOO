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

public class TelaDetalheArmacao implements ActionListener {

	private JFrame janela;
	private JLabel labelNomeArmacao = new JLabel("Nome da Armacao: ");
	private JTextField valorNomeArmacao;
	private JLabel labelMarca = new JLabel("Marca: ");
	private JTextField valorMarca;
	private JLabel labelMaterial = new JLabel("Material: ");
	private JTextField valorMaterial;
	private JLabel labelValorArmacao = new JLabel("Valor: ");
	private JTextField valorValorArmacao;
	private JLabel labelMedidaAro = new JLabel("Medida do aro: ");
	private JTextField valorMedidaAro;
	private JLabel labelIDArmacao = new JLabel("Identificacao: ");
	private JTextField valorIDArmacao;
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[9];
	private static ControleDados dados;
	private int posicao;
	private int opcao;
	private String s;

	public void inserirEditar(int op, ControleDados d, TelaArmacao t, int pos) {

		opcao = op;
		posicao = pos;
		dados = d;

		if (op == 1)
			s = "Cadastro de Armacao";
		if (op == 2)
			s = "Detalhe de Armacao";

		janela = new JFrame(s);

		// Preenche dados com dados da armacao clicada
		if (op == 2) {
			valorNomeArmacao = new JTextField(dados.getArmacao()[pos].getNomeArmacao(), 200);
			valorMarca = new JTextField(dados.getArmacao()[pos].getMarcaArmacao(), 200);
			valorMaterial = new JTextField(dados.getArmacao()[pos].getMateArmacao(), 200);
			valorValorArmacao = new JTextField(String.valueOf(dados.getArmacao()[pos].getValorArmacao()), 200);
			valorMedidaAro = new JTextField(String.valueOf(dados.getArmacao()[pos].getMedidaaro()), 200);
			valorIDArmacao = new JTextField(String.valueOf(dados.getArmacao()[pos].getIDArmacao()), 200);

		} else { // N�o preenche com dados
			valorNomeArmacao = new JTextField(200);
			valorMarca = new JTextField(200);
			valorMaterial = new JTextField(200);
			valorValorArmacao = new JTextField(200);
			valorMedidaAro = new JTextField(200);
			valorIDArmacao = new JTextField(200);

			botaoSalvar.setBounds(245, 200, 115, 30);
		}

		labelMarca.setBounds(30, 50, 150, 25);
		labelMarca.setForeground(Color.WHITE);
		valorMarca.setBounds(180, 50, 180, 25);
		labelMaterial.setBounds(30, 170, 180, 25);
		labelMaterial.setForeground(Color.WHITE);
		valorMaterial.setBounds(180, 170, 180, 25);
		labelMedidaAro.setBounds(30, 80, 150, 25);
		labelMedidaAro.setForeground(Color.WHITE);
		valorMedidaAro.setBounds(180, 80, 180, 25);
		labelValorArmacao.setBounds(30, 110, 180, 25);
		valorValorArmacao.setBounds(180, 110, 180, 25);
		labelValorArmacao.setForeground(Color.WHITE);
		labelIDArmacao.setBounds(30, 140, 150, 25);
		labelIDArmacao.setForeground(Color.WHITE);
		valorIDArmacao.setBounds(180, 140, 180, 25);
		labelNomeArmacao.setBounds(30, 20, 150, 25);
		labelNomeArmacao.setForeground(Color.WHITE);
		valorNomeArmacao.setBounds(180, 20, 180, 25);

		// Coloca botoes de excluir e salvar
		if (op == 2) {
			botaoSalvar.setBounds(120, 210, 115, 30);
			botaoExcluir.setBounds(245, 210, 115, 30);
			this.janela.add(botaoExcluir);
		}

		this.janela.add(labelMarca);
		this.janela.add(valorMarca);
		this.janela.add(labelMaterial);
		this.janela.add(valorMaterial);
		this.janela.add(labelIDArmacao);
		this.janela.add(valorIDArmacao);
		this.janela.add(botaoSalvar);
		this.janela.add(labelMedidaAro);
		this.janela.add(valorMedidaAro);
		this.janela.add(labelValorArmacao);
		this.janela.add(valorValorArmacao);
		this.janela.add(labelNomeArmacao);
		this.janela.add(valorNomeArmacao);

		this.janela.setLayout(null);
		janela.getContentPane().setBackground(Color.DARK_GRAY);

		this.janela.setSize(500, 300);
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
					novoDado[0] = Integer.toString(dados.getQtdArmacao());
				else // edicao de dado existente
					novoDado[0] = Integer.toString(posicao);

				novoDado[1] = valorMarca.getText();
				novoDado[2] = valorMaterial.getText();
				novoDado[3] = valorMedidaAro.getText();
				novoDado[4] = valorIDArmacao.getText();
				novoDado[6] = valorNomeArmacao.getText();

				if (opcao == 1) {
					novoDado[5] = valorValorArmacao.getText();
					res = dados.inserirEditarArmacao(novoDado);
				} else {
					novoDado[5] = valorValorArmacao.getText();
					res = dados.inserirEditarArmacao(novoDado);
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

			if (opcao == 1) {// exclui armacao
				res = dados.removerArmacao(posicao);
				if (res)
					mensagemSucessoExclusao();
				else
					mensagemErroExclusaoArmacao();
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
				"ERRO AO SALVAR OS DADOS!\n " + "Pode ter ocorrido o seguinte:  \n"
						+ "1. Nem todos os campos foram preenchidos \n"
						+ "2. medida, identificacao e/ou valor n�o cont�m apenas n�meros",
				null, JOptionPane.ERROR_MESSAGE);
	}

	public void mensagemErroExclusaoArmacao() {
		JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir o dado.\n "
				+ "Verifique se a armacao esta cadastrada\n" + " e tente novamente.", null, JOptionPane.ERROR_MESSAGE);
	}

}
