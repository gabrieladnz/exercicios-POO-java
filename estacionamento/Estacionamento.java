
public class Estacionamento {

	// definir atributos e realizar encapsulamento
	private int codigo;
	private String nome;
	private String cidade;
	private int qtdeVagas;
	private String situacao;
	private int horasFranquiaInicial;
	private double valorFranquiaInicial;
	private double valorAdicionalHora;

	// criar construtor
	Estacionamento(int qtdeVagas, String situacao, int horasFranquiaInicial, double valorFranquiaInicial,
			double valorAdicionalHora) {

		this.qtdeVagas = qtdeVagas;
		this.situacao = "Desativo";
		this.horasFranquiaInicial = horasFranquiaInicial;
		this.valorFranquiaInicial = valorFranquiaInicial;
		this.valorAdicionalHora = valorAdicionalHora;
	}

	// criar métodos get e set
	public String getAtivar() {
		return situacao;
	}
	
	public void setAtivar(String situacao) {
		this.situacao = "Ativo";
	}
	
	public String getDesativar() {
		return situacao;
	}
	
	public void setDesativar(String situacao) {
		this.situacao = "Desativo";
	}
	
	public double calcularEstacionamento(double horasEstacionado) {
		if (situacao == "Ativo") {
			System.out.print("Valor do estacionamento: " + horasFranquiaInicial * valorFranquiaInicial + "\n");
		} else {
			return horasEstacionado = 0;
		}
		return horasEstacionado;

	}
	
	// método get e set dos atributos
	
	int getQtdeVagas() {
		return qtdeVagas;
	}
	
	String getSituacao() {
		return situacao;
	}
	
	int getHorasFranquiaInicial() {
		return horasFranquiaInicial;
	}
	
	double getValorFranquiaInicial() {
		return valorFranquiaInicial;
	}
	
	double getValorAdicionalHora() {
		return valorAdicionalHora;
	}
	
	
	void setSituacao(String situacao) {
		this.situacao = situacao;
	}
}