package view;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controle.*;

/**
 * Mostra por meio de uma interface grafica as opcoes disponiveis para customizacao e gerenciamento das diferentes classes relacionadas na loja de oculos registrada.
 * @author Vinicius Assumpcao e Andre Correa
 * @version 1.0
 */
public class TelaMenu implements ActionListener {

	private static JFrame janela = new JFrame("Gerenciamento da loja");
	private static JLabel titulo = new JLabel("Menu Principal");
	private static JButton loja = new JButton("Loja");
	private static JButton cliente = new JButton("Cliente");
	private static JButton funcionario = new JButton("Funcionario");
	private static JButton lente = new JButton("Lente");
	private static JButton armacao = new JButton("Armacao");
	private static JButton venda = new JButton("Venda");
	public static ControleDados dados = new ControleDados();

	Image Icliente = new ImageIcon(this.getClass().getResource("images/cli.jpg")).getImage();
	Image Iloja = new ImageIcon(this.getClass().getResource("images/lojan.png")).getImage();
	Image Ifuncionario = new ImageIcon(this.getClass().getResource("images/func.png")).getImage();
	Image Ilente = new ImageIcon(this.getClass().getResource("images/lente.jpg")).getImage();
	Image Iarmacao = new ImageIcon(this.getClass().getResource("images/armacao.jpg")).getImage();
	Image Ivenda = new ImageIcon(this.getClass().getResource("images/venda.png")).getImage();

	public TelaMenu() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setForeground(Color.white);
		titulo.setBounds(140, 10, 150, 30);

		loja.setBounds(140, 250, 160, 30);
		loja.setBackground(Color.WHITE);
		loja.setFocusPainted(false);
		loja.setVerticalTextPosition(SwingConstants.CENTER);
		loja.setHorizontalTextPosition(SwingConstants.RIGHT);
		loja.setIcon(new ImageIcon(Iloja));
		loja.setIconTextGap(20);

		funcionario.setBounds(140, 100, 160, 30);
		funcionario.setBackground(Color.WHITE);
		funcionario.setFocusPainted(false);
		funcionario.setVerticalTextPosition(SwingConstants.CENTER);
		funcionario.setHorizontalTextPosition(SwingConstants.RIGHT);
		funcionario.setIcon(new ImageIcon(Ifuncionario));
		funcionario.setIconTextGap(5);

		lente.setBounds(140, 150, 160, 30);
		lente.setBackground(Color.WHITE);
		lente.setFocusPainted(false);
		lente.setVerticalTextPosition(SwingConstants.CENTER);
		lente.setHorizontalTextPosition(SwingConstants.RIGHT);
		lente.setIcon(new ImageIcon(Ilente));
		lente.setIconTextGap(5);

		cliente.setBounds(140, 50, 160, 30);
		cliente.setBackground(Color.WHITE);
		cliente.setFocusPainted(false);
		cliente.setVerticalTextPosition(SwingConstants.CENTER);
		cliente.setHorizontalTextPosition(SwingConstants.RIGHT);
		cliente.setIcon(new ImageIcon(Icliente));
		cliente.setIconTextGap(20);

		armacao.setBounds(140, 200, 160, 30);
		armacao.setBackground(Color.WHITE);
		armacao.setFocusPainted(false);
		armacao.setVerticalTextPosition(SwingConstants.CENTER);
		armacao.setHorizontalTextPosition(SwingConstants.RIGHT);
		armacao.setIcon(new ImageIcon(Iarmacao));
		armacao.setIconTextGap(20);

		venda.setBounds(140, 300, 160, 30);
		venda.setBackground(Color.WHITE);
		venda.setFocusPainted(false);
		venda.setVerticalTextPosition(SwingConstants.CENTER);
		venda.setHorizontalTextPosition(SwingConstants.RIGHT);
		venda.setIcon(new ImageIcon(Ivenda));
		venda.setIconTextGap(20);

		janela.setLayout(null);
		janela.getContentPane().setBackground(Color.DARK_GRAY);

		janela.add(titulo);
		janela.add(cliente);
		janela.add(funcionario);
		janela.add(lente);
		janela.add(armacao);
		janela.add(loja);
		janela.add(venda);

		janela.setSize(450, 400);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLocationRelativeTo(null);
		janela.setResizable(false);
		janela.setVisible(true);

	}

	/**
	 * Garante que a selecao dos botoes do menu estejam funcionando
	 * 
	 * @param args array que recebe dados da linha de comando, o que evita a
	 *             execucao em um ambiente equivocado
	 */
	public static void main(String[] args) {
		TelaMenu menu = new TelaMenu();

		cliente.addActionListener(menu);
		funcionario.addActionListener(menu);
		lente.addActionListener(menu);
		armacao.addActionListener(menu);
		loja.addActionListener(menu);
		venda.addActionListener(menu);
	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		if (src == cliente)
			new TelaPessoa().mostrarDados(dados, 1);

		if (src == funcionario)
			new TelaPessoa().mostrarDados(dados, 2);

		if (src == lente)
			new TelaLente().mostrarDadosLentes(dados);

		if (src == armacao)
			new TelaArmacao().mostrarDadosA(dados, 1);

		if (src == loja)
			new TelaLoja().mostrarLoja(dados);
		if (src == venda)
			new TelaVenda().mostrarDadosV(dados, 1);
	}
}
