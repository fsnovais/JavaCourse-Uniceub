/**
 * 
 * @author Felipe
 *	Representa uma poupança ou conta corrente
 */
public class ContaBancaria {
	//variáveis de instância
	String tipoDaConta;
	double saldo;
	Cliente cliente;
	
	//método construtor
	public ContaBancaria(String tipoDaConta, Cliente cliente) {
		this.tipoDaConta = tipoDaConta;
		this.cliente = cliente;
	}
	//métodos
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void sacar(double valor) throws Exception {
		if (valor > this.saldo) {
			throw new Exception ("Valor maior que o disponível na conta");
		}
		this.saldo -= valor;
	}
	
	public String pegaInfoCliente() {
		return this.cliente.pegaNome()+" de "+this.cliente.pegaEndereco();
	}
	
	public String pegaInfoConta() {
		return this.tipoDaConta+" "+this.saldo;
	}
}
