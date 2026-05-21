package lista6.exercicio4;

public class Caminhao extends Veiculo{
	private int capacidadeCarga;
	private final double IPVA_TAXA;

	public Caminhao(String marca, String modelo, int anoFabricacao, double valor, int capacidadeCarga) {
		super(marca, modelo, anoFabricacao, valor);
		this.capacidadeCarga = capacidadeCarga;
		this.IPVA_TAXA = 0.015;
	}
	public void calcularIpva() {
		System.out.printf("Taxa de IPVA: %.2f Reais %n", (super.valor*this.IPVA_TAXA));
	}
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Capacidade de Carga(Toneladas): " + this.capacidadeCarga);
		this.calcularIpva();
		System.out.println("====================");
	}
}
