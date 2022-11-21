package dataConstrutor;

public class TestarData {

	// método main
	public static void main(String[] args) {
		// criar objeto com o construtor
		Data hoje = new Data(29, 9, 2000);
		// chamar método
		hoje.escreverAData();
		
		// criar objeto Natal e passar parâmetros da data
		Data natal = new Data(25, 12, 2022);
		// chamar método
		natal.escreverAData();

	}

}