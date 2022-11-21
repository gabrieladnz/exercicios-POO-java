package contabancária;

public class TestarContaCorrente {

	public static void main(String[] args) {
		// criar e instanciar um objeto ao mesmo tempo
		
		ContaCorrente novaConta = new ContaCorrente(0, null);
		
		// chamar método
		novaConta.definirSaldoInicial(1000);
		// escrever o valor do atributo saldo
		System.out.println("Saldo: " + novaConta.getSaldo());
		novaConta.sacar(500);
		novaConta.depositar(50);
		System.out.println("Saldo: " + novaConta.getSaldo());
		novaConta.sacar(600);
		System.out.println("Saldo: " + novaConta.getSaldo());

	}

}
