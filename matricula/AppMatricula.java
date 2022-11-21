
public class AppMatricula {

	public static void main(String[] args) {
		
		// instanciar objeto
		Matricula minhaMatricula = new Matricula(1, "Gabriela", "Primeiro");
		
		// mostrar os dados da matr�cula
		System.out.println("---------> PRIMEIRA CONSULTA:");
		System.out.println("-> ID: " + minhaMatricula.getIdMatricula());
		System.out.println("-> Nome aluno: " + minhaMatricula.getNomeAluno());
		System.out.println("-> Semestre: " + minhaMatricula.getSemestre());
		System.out.println("-> Situa��o: " + minhaMatricula.getSituacao());
		System.out.println("-> N�mero de disciplinas: " + minhaMatricula.getNumeroDisciplinas());
		System.out.println("-> Carga hor�ria do semestre: " + minhaMatricula.getChSemestral());
		System.out.println("-> Valor mensalidade: " + minhaMatricula.getValorMensalidade() + "\n");
		// registrar disciplina carga hor�ria = 50h
		minhaMatricula.registrarDisciplina(50);
		// calcular mensalidade
		minhaMatricula.calcularMensalidade();
		// mostrar dados de matr�cula
		System.out.println("---------> SEGUNDA CONSULTA:");
		System.out.println("-> ID: " + minhaMatricula.getIdMatricula());
		System.out.println("-> Nome aluno: " + minhaMatricula.getNomeAluno());
		System.out.println("-> Semestre: " + minhaMatricula.getSemestre());
		System.out.println("-> Situa��o: " + minhaMatricula.getSituacao());
		System.out.println("-> N�mero de disciplinas: " + minhaMatricula.getNumeroDisciplinas());
		System.out.println("-> Carga hor�ria do semestre: " + minhaMatricula.getChSemestral());
		System.out.println("-> Valor mensalidade: " + minhaMatricula.getValorMensalidade() + "\n");
		// registrar 2 disciplinas - carga hor�ria = 100h
		minhaMatricula.registrarDisciplina(100);
		minhaMatricula.registrarDisciplina(100);
		// calcular mensalidade
		minhaMatricula.calcularMensalidade();
		// mostrar dados de matr�cula
		System.out.println("---------> TERCEIRA CONSULTA:");
		System.out.println("-> ID: " + minhaMatricula.getIdMatricula());
		System.out.println("-> Nome aluno: " + minhaMatricula.getNomeAluno());
		System.out.println("-> Semestre: " + minhaMatricula.getSemestre());
		System.out.println("-> Situa��o: " + minhaMatricula.getSituacao());
		System.out.println("-> N�mero de disciplinas: " + minhaMatricula.getNumeroDisciplinas());
		System.out.println("-> Carga hor�ria do semestre: " + minhaMatricula.getChSemestral());
		System.out.println("-> Valor mensalidade: " + minhaMatricula.getValorMensalidade() + "\n");
		// registrar disciplina - carga hor�ria = 200h
		minhaMatricula.registrarDisciplina(200);
		// mostrar dados de matr�cula
		System.out.println("---------> QUARTA CONSULTA:");
		System.out.println("-> ID: " + minhaMatricula.getIdMatricula());
		System.out.println("-> Nome aluno: " + minhaMatricula.getNomeAluno());
		System.out.println("-> Semestre: " + minhaMatricula.getSemestre());
		System.out.println("-> Situa��o: " + minhaMatricula.getSituacao());
		System.out.println("-> N�mero de disciplinas: " + minhaMatricula.getNumeroDisciplinas());
		System.out.println("-> Carga hor�ria do semestre: " + minhaMatricula.getChSemestral());
		System.out.println("-> Valor mensalidade: " + minhaMatricula.getValorMensalidade() + "\n");
		// registrar disciplina - carga hor�ria = 200h
		minhaMatricula.registrarDisciplina(200);
		// mostrar dados de matr�cula
		System.out.println("---------> QUARTA CONSULTA:");
		System.out.println("-> ID: " + minhaMatricula.getIdMatricula());
		System.out.println("-> Nome aluno: " + minhaMatricula.getNomeAluno());
		System.out.println("-> Semestre: " + minhaMatricula.getSemestre());
		System.out.println("-> Situa��o: " + minhaMatricula.getSituacao());
		System.out.println("-> N�mero de disciplinas: " + minhaMatricula.getNumeroDisciplinas());
		System.out.println("-> Carga hor�ria do semestre: " + minhaMatricula.getChSemestral());
		System.out.println("-> Valor mensalidade: " + minhaMatricula.getValorMensalidade() + "\n");
		// registrar pagamento
		minhaMatricula.registrarPagamento();
		// mostrar dados de matr�cula
		System.out.println("---------> QUINTA CONSULTA:");
		System.out.println("-> ID: " + minhaMatricula.getIdMatricula());
		System.out.println("-> Nome aluno: " + minhaMatricula.getNomeAluno());
		System.out.println("-> Semestre: " + minhaMatricula.getSemestre());
		System.out.println("-> Situa��o: " + minhaMatricula.getSituacao());
		System.out.println("-> N�mero de disciplinas: " + minhaMatricula.getNumeroDisciplinas());
		System.out.println("-> Carga hor�ria do semestre: " + minhaMatricula.getChSemestral());
		System.out.println("-> Valor mensalidade: " + minhaMatricula.getValorMensalidade() + "\n");
	}

}
