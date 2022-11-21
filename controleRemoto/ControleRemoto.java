
public class ControleRemoto {
	// definir atributos e realizar encapsulamento
	private int idControle;
	private String modelo;
	private int temperaturaMinima;
	private int temperaturaMaxima;
	private int temperaturaAtual = 0;
	private int velocidade;
	private boolean ligado = false;
	
	// criar construtor
	ControleRemoto(int idControle, String modelo, int temperaturaMinima, int temperaturaMaxima) {
		this.idControle = idControle;
		this.modelo = modelo;
		this.temperaturaMinima = temperaturaMinima;
		this.temperaturaMaxima = temperaturaMaxima;
	}
	
	// definir métodos
	void ligarDesligar() {
		if(ligado == true) {
			ligado = false;
		} else {
			ligado = true;
		}
	}

	boolean diminuirTemperatura() {
		if (temperaturaAtual > temperaturaMinima) {
			temperaturaAtual = temperaturaAtual - 1;
			return true;
		} else {
			return false;
		}
	}

	boolean aumentarTemperatura() {
		if (temperaturaAtual < temperaturaMaxima) {
			temperaturaAtual = temperaturaAtual + 1;
			return true;
		} else {
			return false;
		}
	}
	
	void ajustarVelocidade() {
		velocidade = velocidade + 1;
	}
	
	// criando métodos get e set
	int getIdControle() {
		return idControle;
	}
	
	String getModelo() {
		return modelo;
	}
	
	void setModelo (String modelo) {
		this.modelo = modelo;
	}
	
	int getTemperaturaMinima() {
		return temperaturaMinima;
	}
	
	void setTemperaturaMinima(int temperaturaMinima) {
		this.temperaturaMinima = temperaturaMinima;
	}
	
	int getTemperaturaMaxima() {
		return temperaturaMaxima;
	}
	
	void setTemperaturaMaxima(int temperaturaMaxima) {
		this.temperaturaMaxima = temperaturaMaxima;
	}
	
	int getTemperaturaAtual() {
		return temperaturaAtual;
	}
	
	void setTemperaturaAtual(int temperaturaAtual) {
		this.temperaturaAtual = temperaturaAtual;
	}
	
	int getVelocidade() {
		return velocidade;
	}
	
	boolean getLigado() {
		return ligado;
	}
	}
