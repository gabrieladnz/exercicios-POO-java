package medidorAldo;

import java.util.Scanner;

public class TestarMedidorEnergia {

	public static void main(String[] args) {
		// instanciar um objeto
		MedidorEnergia meuMedidor = new MedidorEnergia(0, "0F1", 'C', 0);

		// mostrar os dados do medidor
		System.out.println("Indentificador: " + meuMedidor.getIdMedidor());
		System.out.println("Número de série: " + meuMedidor.getNrSerie());
		System.out.println("Unidade de consumo: " + meuMedidor.getTipoUcInstalado());
		System.out.println("Leitura atual: " + meuMedidor.getLeituraAtual());

		// Informar leituras
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println("--->" + " Insira a leitura 1: ");
		int leituraAnterior = scan.nextInt();
		meuMedidor.registrarLeitura(leituraAnterior);

		System.out.println("--->" + " Insira a leitura 2: ");
		int leituraAtual = scan.nextInt();
		meuMedidor.setLeituraAtual(leituraAtual);

		// mostrar dados do medidor
		System.out.println("Indentificador: " + meuMedidor.getIdMedidor());
		System.out.println("Número de série: " + meuMedidor.getNrSerie());
		System.out.println("Unidade de consumo: " + meuMedidor.getTipoUcInstalado());
		System.out.println("Leitura atual: " + meuMedidor.getLeituraAtual());

	}

}
