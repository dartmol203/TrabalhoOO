package modelo;

//import java.util.*;

public class Dados {
	// private ArrayList<Loja> lojas = new ArrayList<Loja>();
	private Cliente[] clientes = new Cliente[50];
	private int qtdClientes = 0;
	private Funcionario[] funcionarios = new Funcionario[50];
	private int qtdFuncionarios = 0;
	private Armacao[] armacao = new Armacao[50];
	private int qtdArmacao = 0;
	private Telefone[] tels = new Telefone[50];
	private int qtdTels = 0;
	private Loja[] loja = new Loja[5];
	private int qntLojas = 0;
	private Lente[] lentes = new Lente[50];
	private int qntLentes;
	private Venda[] vendas = new Venda[50];
	private int qntVendas;

	public void fillWithSomeData() {
		for (int i = 0; i < 5; i++) {
			tels[i] = new Telefone((i + 1) * 100, (i + 1) * 1000000);
			clientes[i] = new Cliente("Cliente" + i, "Endereco" + i, "01/0" + (i + 1) + "/2001", (i + 1) * 123456,
					(i + 1) * 112233, tels[i]);
			funcionarios[i] = new Funcionario("Funcionario" + i, "Endereco" + i, (i + 1) * 1000, (i + 1) * 654321,
					(i + 1) * 332211, tels[i]);
			armacao[i] = new Armacao("Armacao" + i, "Marca" + i, "Material" + i, (i + 1) * 50, (i + 1) * 10,
					(i + 1) * 654321);
			lentes[i] = new Lente((i + 1) * 0.1, 50.0 * (i + 1), i + 1, "redonda", "hipermetropia", "monofocal", "hoya",
					true, "03/07/2025", (i + 1) * 654321, "lente" + (i + 1));
			vendas[i] = new Venda(500 * i, (i + 1) * 123456, (i + 1) * 332211, (i + 1) * 654321, "venda" + (i + 1),
					i + 1, i + 1);
		}

		// lojas.add(new Loja("oticas wanderer", "endereco 1 rua 2", 87654321, new
		// Telefone(61, 55555555)));
		loja[0] = new Loja("oticas wanderer", "endereco 1 rua 2", 87654321, new Telefone(61, 55555555));

		qtdClientes = 5;
		qtdFuncionarios = 5;
		qtdArmacao = 5;
		qtdTels = 5;
		qntLojas = 1;
		qntLentes = 5;
		qntVendas = 5;

	}

	public Cliente[] getClientes() {
		return clientes;
	}

	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}

	public void inserirEditarClientes(Cliente c, int pos) {
		this.clientes[pos] = c;
		if (pos == qtdClientes)
			qtdClientes++;
	}

	public int getQtdClientes() {
		return qtdClientes;
	}

	public void setQtdClientes(int qtdClientes) {
		this.qtdClientes = qtdClientes;
	}

	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Funcionario[] Funcionarios) {
		this.funcionarios = Funcionarios;
	}

	public void inserirEditarFuncionarios(Funcionario p, int pos) {
		this.funcionarios[pos] = p;
		if (pos == qtdFuncionarios)
			qtdFuncionarios++;
	}

	public int getQtdFuncionarios() {
		return qtdFuncionarios;
	}

	public void setQtdFuncionarios(int qtdFuncionarios) {
		this.qtdFuncionarios = qtdFuncionarios;
	}

	public Armacao[] getArmacao() {
		return armacao;
	}

	public void setArmacao(Armacao[] armacoes) {
		this.armacao = armacoes;
	}

	public void inserirEditarArmacao(Armacao a, int pos) {
		this.armacao[pos] = a;
		if (pos == qtdArmacao)
			qtdArmacao++;
	}

	public int getQtdArmacao() {
		return qtdArmacao;
	}

	public void setQtdArmacao(int qtdArmacoes) {
		this.qtdArmacao = qtdArmacoes;
	}

	public Telefone[] getTels() {
		return tels;
	}

	public void setTels(Telefone[] tels) {
		this.tels = tels;
	}

	public int getQtdTels() {
		return qtdTels;
	}

	public void setQtdTels(int qtdTels) {
		this.qtdTels = qtdTels;
	}

	public Loja[] getLoja() {
		return loja;
	}

	public void setLoja(Loja[] loja) {
		this.loja = loja;
	}

	public int getQntLojas() {
		return qntLojas;
	}

	public void setQntLojas(int qntLojas) {
		this.qntLojas = qntLojas;
	}

	public void inserirEditarLoja(Loja l, int pos) {
		this.loja[pos] = l;
		if (pos == qntLojas) {
			qntLojas++;
		}
	}

	public Lente[] getLentes() {
		return lentes;
	}

	public void setLentes(Lente[] lentes) {
		this.lentes = lentes;
	}

	public int getQntLentes() {
		return qntLentes;
	}

	public void setQntLentes(int qntLentes) {
		this.qntLentes = qntLentes;
	}

	public void inserirEditarlente(Lente l, int parseInt) {
		this.lentes[parseInt] = l;
		if (parseInt == qntLentes)
			qntLentes++;
	}

	public void setQntVendas(int qntVendas) {
		this.qntVendas = qntVendas;
	}

	public int getQntVendas() {
		return qntLentes;
	}

	public Venda[] getVendas() {
		return vendas;
	}

}
