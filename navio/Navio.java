// implementando a superclasse
public abstract class Navio {
	
	// declarando atributos e encapsulando
	private int id;
	private String nome;
	private int quantidadePoroes;
	private double capacidadeCarga;
	private String disponibilidade;
	
	// criando construtor
	public Navio(int id, String nome, int quantidadePoroes, double capacidadeCarga, String disponibilidade) {
		this.id = id;
		this.nome = nome;
		this.quantidadePoroes = quantidadePoroes;
		this.capacidadeCarga = capacidadeCarga;
		this.disponibilidade = "Vazio";
	}
	
	// criando métodos
	public void iniciarCarregamento() {
		this.disponibilidade = "Carregando";
	}
	
	public void bloquearCarregamento() {
		this.disponibilidade = "Lotado";
	}
	
	// métodos get 
	int getId() {
		return id;
	}
	
	String getNome() {
		return nome;
	}
	
	int getQuantidadePoroes() {
		return quantidadePoroes;
	}
	
	double getCapacidadeCarga() {
		return capacidadeCarga;
	}
	
	String getDisponibilidade() {
		return disponibilidade;
	}
}