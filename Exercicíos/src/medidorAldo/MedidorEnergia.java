package medidorAldo;

public class MedidorEnergia {
	// definir atributos
	private int idMedidor;
	private String nrSerie;
	private char tipoUcInstalado;
	private int leituraAnterior = 0;
	private int leituraAtual = 0;
	private int consumo = 0;
	private double valorConta = 0;

	// criar construtor
	public MedidorEnergia(int idMedidor, String nrSerie, char tipoUcInstalado, int leituraAtual) {
		this.idMedidor = idMedidor;
		this.nrSerie = nrSerie;
		this.tipoUcInstalado = tipoUcInstalado;
		this.leituraAtual = leituraAtual;

		// inicializando as vari�veis dentro do m�todo
		leituraAnterior = leituraAtual;
		consumo = 0;
		valorConta = 0;
	}

	// M�TODOS GET e SET

	int getIdMedidor() {
		return idMedidor;
	}

	String getNrSerie() {
		return nrSerie;
	}

	char getTipoUcInstalado() {
		return tipoUcInstalado;
	}

	void setTipoUcInstalado(char tipoUcInstalado) {
		this.tipoUcInstalado = tipoUcInstalado;
	}

	int getLeituraAtual() {
		return leituraAtual;
	}

	void setLeituraAtual(int leituraAtual) {
		this.leituraAtual = leituraAtual;
	}

	double getValorConta() {
		return valorConta;
	}

	void setValorConta(double valorConta) {
		this.valorConta = valorConta;
	}
	
	int getLeituraAnterior() {
		return leituraAnterior;
	}
	
	int getConsumo() {
		return consumo;
	}

// M�TODOS NORMAIS
	void registrarLeitura(int leitura) {
		leituraAnterior = leituraAtual;
		leitura = leituraAtual;

		// calcular consumo
		consumo = (leituraAtual - leituraAnterior);
		// chamar o m�todo calcularConta
		calcularConta();
	}

	private void calcularConta() {

		if (tipoUcInstalado == 'C') {
			valorConta = consumo * 0.70;
		} else if (tipoUcInstalado == 'I') {
			valorConta = consumo * 0.50;
		} else if (tipoUcInstalado == 'R') {
			valorConta = consumo * 0.60;
		}
	}

}
