package contabancária;

public class ContaCorrente {

	// definir atributos
	private float saldo = 0;
	private String cliente;

	// definir métodos
	void definirSaldoInicial(float saldoInicial) {
		this.saldo = saldoInicial;
	}

	void depositar(double valorDeposito) {
		this.saldo += valorDeposito;
	}

	void sacar(double valorSaque) {
		this.saldo -= valorSaque;

	}

	// criando construtor
	public ContaCorrente(float saldo, String cliente) {
		this.saldo = saldo;
		this.cliente = cliente;
	}

	// criando métodos get e set
	float getSaldo() {
		return saldo;
	}

	void setSaldo(float saldo) {
		if(saldo > 0) {
			this.saldo = saldo;
		}
		if(saldo < 0) {
			saldo = 0;
		}
		
	}

	String getCliente() {
		return cliente;
	}

	void setCliente(String cliente) {
		this.cliente = cliente;
	}
}
