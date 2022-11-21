// implemento subclasse
public class NavioGraneleiro extends Navio{
	
	// declaro atributos
	private int quantidadeEscotilhas;
	
	// construtor
	public NavioGraneleiro(int id, String nome, int quantidadePoroes, double capacidadeCarga, String disponibilidade, int quantidadeEscotilhas) {
		super(id, nome, quantidadePoroes, capacidadeCarga, disponibilidade);
		this.quantidadeEscotilhas = quantidadeEscotilhas;
	}
	
	// método get
	int getQuantidadeEscotilhas() {
		return quantidadeEscotilhas;
	}
}
