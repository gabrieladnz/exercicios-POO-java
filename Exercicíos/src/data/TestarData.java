package data;

public class TestarData {

	public static void main(String[] args) {
		// instanciar objeto
		Data minhaData;
		minhaData = new Data();

		// atribuir/alterar valor pra a vari�vel dia, m�s e ano
		minhaData.dia = 4;
		minhaData.mes = 8;
		minhaData.ano = 2000;

		// chamando os m�todos
		minhaData.escreverAData();
		minhaData.escreverOMes();

		// alterar valor do atributo m�s
		minhaData.mes = 12;

		// chamando os m�todos novamente
		minhaData.escreverAData();
		minhaData.escreverOMes();

	}

}
