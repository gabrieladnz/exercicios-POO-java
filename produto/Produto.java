package produto;

public class Produto {
	// Definir atributos
    String nome;
    double preco = 0;

    // Definir métodos
    void informarNome() {
        System.out.println("O nome do produto é: " + nome);
    }

    void informarPreco() {
        System.out.println("O preço do produto é: " + preco);
    }

    void fazerPromocao() {
        preco = preco - 1;
    }
}
