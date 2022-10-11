package cliente;

public class Cliente {
	// definindo atributos em private (-)
	private String nome;
	private String endereco;
	private float renda = 0;

	// definindo construtor Cliente
	Cliente(String nome, String endereco, float renda) {
		this.nome = nome;
		this.endereco = endereco;
		this.renda = renda;
	}

	// definindo método GET dos atributos
	String getNome() {
		return nome;
	}

	// definindo método SET
	void setNome(String nome) {
		this.nome = nome;
	}

	String getEndereco() {
		return endereco;
	}

	void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	float getRenda() {
		return renda;
	}

	void setRenda(float renda) {
		this.renda = renda;
	}
}
