package lista6.exercicio4;

public class VeiculoTeste {
	public static void main(String[] args) {
		Carro carro = new Carro("Mercedez", "I-30", 2027, 1500000.00, 4);
		carro.exibirDados();
		
		Moto moto = new Moto("Kawasaki", "Z300", 2024, 25000.99, "Esportivo");
		moto.exibirDados();
		
		Caminhao caminhao = new Caminhao("Volvo", "FR-1000", 2005, 459678.44, 30);
		caminhao.exibirDados();
	}
}
