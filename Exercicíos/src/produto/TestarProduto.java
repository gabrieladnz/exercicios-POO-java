package produto;

public class TestarProduto {

	public static void main(String[] args) {
		// instanciar objeto
		Produto meuProduto;
		meuProduto = new Produto();
		
		// Alterar o valor do atributo
		meuProduto.nome = "Caf�";

		// Alterar o valor do atributo
		meuProduto.preco = 8;
		
		// CHAMANDO OS M�TODOS
		meuProduto.informarNome();
		meuProduto.informarPreco();
		meuProduto.fazerPromocao();
		meuProduto.informarPreco();
		
	}

}
