package dataConstrutor;

public class TestarData {

	// m�todo main
	public static void main(String[] args) {
		// criar objeto com o construtor
		Data hoje = new Data(29, 9, 2000);
		// chamar m�todo
		hoje.escreverAData();
		
		// criar objeto Natal e passar par�metros da data
		Data natal = new Data(25, 12, 2022);
		// chamar m�todo
		natal.escreverAData();

	}

}