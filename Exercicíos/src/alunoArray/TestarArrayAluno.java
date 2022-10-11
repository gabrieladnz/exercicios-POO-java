package alunoArray;
import java.util.Scanner;

public class TestarArrayAluno {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		// criando array do objeto e instanciando
		Aluno[] turma = new Aluno[5];
		// criar objetos do tipo Aluno e atribuir valores
		turma[0] = new Aluno("Gabriela", 6, 7);
		turma[1] = new Aluno("Iris", 8, 9);
		turma[2] = new Aluno("Williane", 9, 10);
		turma[3] = new Aluno("Ayllane", 7, 8);
		turma[4] = new Aluno("Flávio", 5, 4);

		// iterar array e apresentar lista contendo nome e média
		for (int i = 0; i < turma.length; i++) {
			System.out.println("Nome: " + turma[i].getNome() + " / ");
			System.out.println("Média: " + turma[i].calcularMedia());

		}

		// verificar se determinado elemento se encontra no array
		System.out.println("Insira o nome do aluno que deseja procurar: ");
		String buscar = scan.nextLine();
		Aluno alunoEncontrado = null;

		for (int i = 0; i < turma.length; i++) {
			if (turma[i].getNome().equalsIgnoreCase(buscar)) {
				alunoEncontrado = turma[i];
				break;
			}
		}

		if (alunoEncontrado != null) {
			System.out.println("O nome do aluno é: " + alunoEncontrado.getNome());
			System.out.println("Média: " + alunoEncontrado.calcularMedia());
		} else {
			System.out.println("Aluno inexistente na turma.");
		}

	}
}
