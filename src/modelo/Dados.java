package modelo;



public class Dados {
	private  Cliente[] clientes = new Cliente[50];
	private int qtdClientes = 0;
	private Funcionario[] funcionarios = new Funcionario[50];
	private int qtdFuncionarios = 0;
	private Armacao[] armacao = new Armacao[50];
	private int qtdArmacao = 0;
	private Telefone[] tels = new Telefone[50];
	private int qtdTels = 0;

	
	
	public void fillWithSomeData() {
		for(int i = 0; i < 5; i++) {
			tels[i] = new Telefone((i+1)*100, (i+1)*1000000);
			clientes[i] = new Cliente("Cliente"+i, "Endereco"+i,"01/0" + (i + 1) + "/2001" , (i+1)*123456, (i+1)*112233, 
					tels[i]);
			funcionarios[i] = new Funcionario("Funcionario"+i, "Endereco"+i, (i+1)*1000, (i+1)*654321, 
					(i+1)*332211, tels[i]);	
			armacao[i] = new Armacao("Armacao"+i,"Marca"+i,"Material"+i,(i+1)*50,(i+1)*10,(i+1)*654321);
		}
		
		qtdClientes = 5;
		qtdFuncionarios = 5;
		qtdArmacao = 5;
		qtdTels = 5;

	}
	
	public Cliente[] getClientes() {
		return clientes;
	}
	
	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}
	
	public void inserirEditarClientes(Cliente c, int pos) {
		this.clientes[pos] = c;
		if(pos == qtdClientes) qtdClientes++;
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
		if(pos == qtdFuncionarios) qtdFuncionarios++;
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
		if(pos == qtdArmacao) qtdArmacao++;
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
	
}
