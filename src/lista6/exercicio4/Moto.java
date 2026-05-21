package lista6.exercicio4;

public class Moto extends Veiculo{
	private String tipoGuidao;
	private final double IPVA_TAXA;
	
	public Moto(String marca, String modelo, int anoFabricacao, double valor, String tipoGuidao) {
		super(marca, modelo, anoFabricacao, valor);
		this.tipoGuidao = tipoGuidao;
		IPVA_TAXA = 0.02;
	}
	
	public void calcularIpva() {
		System.out.printf("Taxa de IPVA: %.2f Reais %n", (super.valor*this.IPVA_TAXA));
	}
	
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Tipo de Guidão: " + this.tipoGuidao);
		this.calcularIpva();
		System.out.println("====================");
	}
}
