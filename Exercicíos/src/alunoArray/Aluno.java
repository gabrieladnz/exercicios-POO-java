package alunoArray;

public class Aluno {
	// declarando atributos
	private String nome;
	private double nota1 = 0;
	private double nota2 = 0;
	
	// criando construtor
	public Aluno(String nome, int nota1, int nota2) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	// criando métodos get e set
	String getNome() {
		return nome;
	}
	
	void setNome(String nome) {
		this.nome = nome;
	}
	
	double getNota1() {
		return nota1;
	}
	
	void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	
	double getNota2() {
		return nota2;
	}
	
	void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	// declarar método com conta
	double calcularMedia() {
		return (nota1 + nota2) / 2;
	}
}
