package dataConstrutor;
// EXERCICIO COM CONSTRUTOR!
public class Data {

	// declarar atributos
	int dia = 0;
	int mes = 0;
	int ano = 0;

	// criar construtor
	Data(int dia, int mes, int ano) {
		// usar o 'this' para diferenciar os atributos dos parÂmetros
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	// criar métodos
	void escreverAData() {
		System.out.println("Data: " + dia + mes + ano);
	}

	void escreverOMes() {
		System.out.println("Mês: " + mes);
	}
}