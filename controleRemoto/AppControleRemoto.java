
public class AppControleRemoto {

	public static void main(String[] args) {
		// instanciar objeto
		ControleRemoto meuControleRemoto = new ControleRemoto(66, "LG", 20, 24);
		
		// mostrar dados do objeto
		System.out.println("Id controle -> " + meuControleRemoto.getIdControle());
		System.out.println("Modelo -> " + meuControleRemoto.getModelo());
		System.out.println("Temperatura m�nima -> " + meuControleRemoto.getTemperaturaMinima());
		System.out.println("Temperatura m�xima -> " + meuControleRemoto.getTemperaturaMaxima() + "\n");
		
		// ligar ar condicionado
		meuControleRemoto.ligarDesligar();
		
		//temperatura atual
		meuControleRemoto.setTemperaturaAtual(22);
		
		// aumentar temperatura
		meuControleRemoto.aumentarTemperatura();

		// mostrar temperatura atual
		System.out.println("Temperatura atual: " + meuControleRemoto.getTemperaturaAtual() + "\n");

		// aumentar temperatura novamente
		meuControleRemoto.aumentarTemperatura();

		// mostrar temperatura atual novamente
		System.out.println("Temperatura atual: " + meuControleRemoto.getTemperaturaAtual() + "\n");
		
		// condi��o temperatura m�xima
		if(meuControleRemoto.getTemperaturaAtual() >= 24) {
			System.out.println("---> Condicionador de ar j� est� na temperatura m�xima. \n");
		}
		
		// ajustar a velocidade 
		meuControleRemoto.ajustarVelocidade();
		
		// mostrar velocidade atual
		System.out.println("Velocidade: " + meuControleRemoto.getVelocidade());
		
		// aumentar velocidade + 4 vezes
		meuControleRemoto.ajustarVelocidade();
		System.out.println("Velocidade: " + meuControleRemoto.getVelocidade());
		meuControleRemoto.ajustarVelocidade();
		System.out.println("Velocidade: " + meuControleRemoto.getVelocidade());
		meuControleRemoto.ajustarVelocidade();
		System.out.println("Velocidade: " + meuControleRemoto.getVelocidade());
		meuControleRemoto.ajustarVelocidade();
		System.out.println("Velocidade: " + meuControleRemoto.getVelocidade() + "\n");
		
		// diminuir temperatura at� temperatura m�nima
		meuControleRemoto.diminuirTemperatura();
		
		// mostrar temperatura
		System.out.println("Temperatura atual: " + meuControleRemoto.getTemperaturaAtual() + "\n");
		
		// repetir processo
		meuControleRemoto.diminuirTemperatura();
		System.out.println("Temperatura atual: " + meuControleRemoto.getTemperaturaAtual() + "\n");

		meuControleRemoto.diminuirTemperatura();
		System.out.println("Temperatura atual: " + meuControleRemoto.getTemperaturaAtual() + "\n");

		meuControleRemoto.diminuirTemperatura();
		System.out.println("Temperatura atual: " + meuControleRemoto.getTemperaturaAtual() + "\n");
		
		// desligar ar condicionado
		meuControleRemoto.ligarDesligar();
		
		// tentar mostrar temperatura atual
		System.out.println("Temperatura atual: " + meuControleRemoto.getTemperaturaAtual() + "\n");
		
		// condi��o controle desligado
		if (meuControleRemoto.getLigado() == false) {
			System.out.println("Equipamento desligado.");
		}
}
}
