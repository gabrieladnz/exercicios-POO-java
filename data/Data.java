package data;

// Definindo classe
public class Data {

	// Definindo atributos
	int dia = 0;
	int mes = 0;
	int ano = 0;
	
	// Definindo métodos
	void escreverAData() {
		System.out.println("Data: " + dia + mes + ano);
	}
	
	void escreverOMes() {
		if (mes == 1) {
			System.out.println("Janeiro");
		}
		if (mes == 2) {
			System.out.println("Fevereiro");
		}
		if (mes == 3) {
			System.out.println("Março");
		}
		if (mes == 4) {
			System.out.println("Abril");
		}
		if (mes == 5) {
			System.out.println("Maio");
		}
		if (mes == 6) {
			System.out.println("Junho");
		}
		if (mes == 7) {
			System.out.println("Julho");
		}
		
		if (mes == 8) {
			System.out.println("Agosto");
		}
		if (mes == 9) {
			System.out.println("Setembro");
		}
		if (mes == 10) {
			System.out.println("Outubro");
		}
		if (mes == 11) {
			System.out.println("Novembro");
		}
		if (mes == 12) {
			System.out.println("Dezembro");
		}
		
	}
}
