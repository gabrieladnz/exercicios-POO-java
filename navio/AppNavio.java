
public class AppNavio {

	public static void main(String[] args) {
		// instanciando subclasse NavioGraneleiro
		NavioGraneleiro navioG = new NavioGraneleiro(10, "Estrela do mar", 4, 50000, null, 4);
		// subclasse NavioContainer
		NavioContainer navioC = new NavioContainer(33, "Bela Fera", 2, 100000, null, 2, 30);
		
		// Informações NavioG
		System.out.println("-> Informações do Navio graneleiro: \n");
		System.out.println("- Id: " + navioG.getId());
		System.out.println("- Nome: " + navioG.getNome());
		System.out.println("- Quant. Porões: " + navioG.getQuantidadePoroes());
		System.out.println("- Capacidade de carga: " + navioG.getCapacidadeCarga());
		System.out.println("- Quant. Escotilhas: " + navioG.getQuantidadeEscotilhas() + "\n");
		
		// Informações NavioC
		System.out.println("-> Informações do Navio container: \n");
		System.out.println("- Id: " + navioC.getId());
		System.out.println("- Nome: " + navioC.getNome());
		System.out.println("- Quant. Porões: " + navioC.getQuantidadePoroes());
		System.out.println("- Capacidade de carga: " + navioC.getCapacidadeCarga());
		System.out.println("- Quant. Guindastes: " + navioC.getQuantidadeGuindastes());
		System.out.println("- Quant. Câmaras: " + navioC.getQuantidadeCamadas() + "\n");
		
	}

}
