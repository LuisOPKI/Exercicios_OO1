package lista2.exercicio7;

public class televisaoTeste {
	public static void main(String[] args) {
		Televisao televisao1 = new Televisao();
		Televisao televisao2 = new Televisao();
		Televisao televisao3 = new Televisao();
		
		televisao1.marca = "Samsung";
		televisao1.polegadas = 55.0;
		televisao1.resolucao = "4K";
		televisao1.canal = 5;
		televisao1.volume = 15;
		televisao1.estadoTelevisao = "desligada";
		
		televisao2.marca = "LG";
		televisao2.polegadas = 43.0;
		televisao2.resolucao = "Full HD";
		televisao2.canal = 99;
		televisao2.volume = 30;
		televisao2.estadoTelevisao = "ligada";
		
		televisao3.marca = "TCL";
		televisao3.polegadas = 32.0;
		televisao3.resolucao = "HD";
		televisao3.canal = 12;
		televisao3.volume = 10;
		televisao3.estadoTelevisao = "desligada";
		
		televisao1.ligar();
		televisao1.aumentarVolume();
		televisao1.alterarCanalUp();
		televisao1.desligar();
		System.out.println("--- Relatório da Televisão ---");
		System.out.println(televisao1);
	}
}
