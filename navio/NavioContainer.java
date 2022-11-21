// implementando subclasse
public class NavioContainer extends Navio {
	// declarando atributos
	private int quantidadeGuindastes;
	private int quantidadeCamadas;
	
	// criando construtor
	public NavioContainer(int id, String nome, int quantidadePoroes, double capacidadeCarga, String disponibilidade, int quantidadeGuindastes, int quantidadeCamadas) {
		// referenciar construtor da superclasse
		super(id, nome, quantidadePoroes, capacidadeCarga, disponibilidade);
		this.quantidadeGuindastes = quantidadeGuindastes;
		this.quantidadeCamadas = quantidadeCamadas;
	}
	
	// métodos get
	int getQuantidadeGuindastes() {
		return quantidadeGuindastes;
	}
	
	int getQuantidadeCamadas() {
		return quantidadeCamadas;
	}
}
