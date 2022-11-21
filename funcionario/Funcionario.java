package funcionario;

public class Funcionario {

	// definir atributos
	String nome;
	String sobrenome;
	int horasTrabalhadas = 0;
	float valorPorHora = 0;

	// definir métodos
	String nomeCompleto() {
		return nome + sobrenome;
	}

	float calcularSalario() {
		return horasTrabalhadas * valorPorHora;
	}

	void incrementarHoras(int hora) {
		//int hora1 = 0;
		//return hora1 + valorPorHora;
	}
}
