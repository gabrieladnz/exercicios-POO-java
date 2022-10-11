package data;

public class TestarData {

	public static void main(String[] args) {
		// instanciar objeto
		Data minhaData;
		minhaData = new Data();

		// atribuir/alterar valor pra a variável dia, mês e ano
		minhaData.dia = 4;
		minhaData.mes = 8;
		minhaData.ano = 2000;

		// chamando os métodos
		minhaData.escreverAData();
		minhaData.escreverOMes();

		// alterar valor do atributo mês
		minhaData.mes = 12;

		// chamando os métodos novamente
		minhaData.escreverAData();
		minhaData.escreverOMes();

	}

}
