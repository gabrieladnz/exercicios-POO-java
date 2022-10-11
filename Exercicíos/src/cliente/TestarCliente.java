package cliente;

public class TestarCliente {

	public static void main(String[] args) {
		// criando e instanciando objeto
		Cliente cliente1 = new Cliente("Julia", "Recife", 1200);
		Cliente cliente2 = new Cliente("Pedro", "Natal", 800);
		Cliente cliente3 = new Cliente(null, null, 0);

		// alterar valor do atributo 'nome'
		cliente1.setNome("Gabriela");

		// mostrando valores dos atributos na tela
		System.out.println("Nome: " + cliente1.getNome());
		System.out.println("Endereço: " + cliente1.getEndereco());
		System.out.println("Renda: " + cliente1.getRenda());

	}

}
