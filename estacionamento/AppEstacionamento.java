
public class AppEstacionamento {

	public static void main(String[] args) {
		
		// instanciar objeto
		Estacionamento meuEstacionamento = new Estacionamento(0, null, 0, 0, 0);

		// exibir dados do Estacionamento
		System.out.println("\nQuantidade de vagas: " + meuEstacionamento.getQtdeVagas());
		System.out.println("Situação: " + meuEstacionamento.getSituacao());
		System.out.println("Horas franquia inicial: " + meuEstacionamento.getHorasFranquiaInicial());
		System.out.println("Valor franquia inicial: " + meuEstacionamento.getValorFranquiaInicial());
		System.out.println("Valor hora adicional: " + meuEstacionamento.getValorAdicionalHora());

		// ativar Estacionamento
		meuEstacionamento.setAtivar("Ativo");

		// exibir dados novamente
		System.out.println("\nSituação do estacionamento: " + meuEstacionamento.getSituacao());

		// calcular o valor do Estacionamento
		meuEstacionamento.calcularEstacionamento(0);

		// desativar Estacionamento
		meuEstacionamento.setDesativar("desativo");

		// exibir dados
		System.out.println("\nSituação do estacionamento: " + meuEstacionamento.getSituacao());

		// caso o Estacionamento esteja desativo, exibir a seguinte mensagem:
		if (meuEstacionamento.getSituacao() != "Ativo") {
			System.out.println("------> Estacionamento desativado!");

		}
		
		// calcular o valor do Estacionamento de um veículo
		meuEstacionamento.calcularEstacionamento(0);

	}

}
