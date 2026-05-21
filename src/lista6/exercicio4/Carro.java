package lista6.exercicio4;

public class Carro extends Veiculo{
	private final double IPVA_TAXA;
	private int qtdPortas;

	public Carro(String marca, String modelo, int anoFabricacao, double valor, int qtdPortas) {
		super(marca, modelo, anoFabricacao, valor);
		this.qtdPortas = qtdPortas;
		this.IPVA_TAXA = 0.035;
	}
	
	public void calcularIpva() {
		System.out.printf("Taxa de IPVA: %.2f Reais %n", (super.valor*this.IPVA_TAXA));
	}
	
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Quantidade de portas: " + this.qtdPortas);
		this.calcularIpva();
		System.out.println("====================");
	}
}
