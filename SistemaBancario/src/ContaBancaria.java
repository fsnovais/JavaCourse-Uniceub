/**
 * 
 * @author Felipe
 *	Representa uma poupan�a ou conta corrente
 */
public class ContaBancaria {
	//vari�veis de inst�ncia
	String tipoDaConta;
	double saldo;
	Cliente cliente;
	
	//m�todo construtor
	public ContaBancaria(String tipoDaConta, Cliente cliente) {
		this.tipoDaConta = tipoDaConta;
		this.cliente = cliente;
	}
	//m�todos
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void sacar(double valor) throws Exception {
		if (valor > this.saldo) {
			throw new Exception ("Valor maior que o dispon�vel na conta");
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
