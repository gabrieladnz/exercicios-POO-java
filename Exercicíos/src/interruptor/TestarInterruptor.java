package interruptor;

public class TestarInterruptor {

	public static void main(String[] args) {
		// instanciar um objeto do tipo interruptor
		Interruptor meuInterruptor;
		meuInterruptor = new Interruptor();
		
		// chamando m�todos
		meuInterruptor.pressionar();
		meuInterruptor.verificarLampada();
		meuInterruptor.pressionar();
		meuInterruptor.verificarLampada();
		

	}

}
