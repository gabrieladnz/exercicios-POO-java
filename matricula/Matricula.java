
public class Matricula {
	// declarar atributos e encapsular
	private int idMatricula;
	private String nomeAluno;
	private String semestre;
	private int numeroDisciplinas;
	private int chSemestral;
	private double valorMensalidade;
	private String situacao = "Aguardando disciplinas";

	// criar construtor
	Matricula(int idMatricula, String nomeAluno, String semestre) {
		this.idMatricula = idMatricula;
		this.nomeAluno = nomeAluno;
		this.semestre = semestre;
	}

	// criar métodos
	void registrarDisciplina(int cargaHoraria) {
		chSemestral = chSemestral + cargaHoraria;
		numeroDisciplinas = numeroDisciplinas + 1;

		if (chSemestral >= 200) {
			situacao = "Aguardando pagamento";
		}
	}

	void calcularMensalidade() {

		if (chSemestral <= 199) {
			valorMensalidade = 200 * 1.25;
		}

		else if (chSemestral >= 200 || chSemestral < 400) {
			valorMensalidade = chSemestral * 1.25;
			situacao = "Aguardando pagamento";
		}

		else if ((chSemestral > 400 || chSemestral <= 600)) {
			valorMensalidade = 400 * 1.25;
			valorMensalidade = 400 - chSemestral * (1.25 / 2);
		}
	}

	boolean registrarPagamento() {

		if (valorMensalidade > 0) {
			situacao = "Matrícula confirmada";
			return true;
		} else {
			return false;
		}
	}

	// criar métodos get e set

	int getIdMatricula() {
		return idMatricula;
	}

	String getNomeAluno() {
		return nomeAluno;
	}

	void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	String getSemestre() {
		return semestre;
	}

	void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	String getSituacao() {
		return situacao;
	}

	double getValorMensalidade() {
		return valorMensalidade;
	}

	void setValorMensalidade(double valorMensalidade) {
		this.valorMensalidade = valorMensalidade;
	}

	int getNumeroDisciplinas() {
		return numeroDisciplinas;
	}

	int getChSemestral() {
		return chSemestral;
	}
}
