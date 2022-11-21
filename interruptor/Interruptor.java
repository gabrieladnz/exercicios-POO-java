package interruptor;

// CRIANDO CLASSE
public class Interruptor {

	// DEFININDO ATRIBUTOS
	boolean ligado;
	
	// DEFININDO MÉTODOS
	void pressionar() {
		if(ligado == true) {
			ligado = false;
		} else {
			ligado = true;
		}
	}
	
	void verificarLampada() {
		if(ligado == true) {
			System.out.println("A luz está acesa.");
		} else {
			System.out.println("A luz está apagada");
		}
	}
}
