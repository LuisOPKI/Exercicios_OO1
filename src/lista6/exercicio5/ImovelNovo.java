package lista6.exercicio5;

public class ImovelNovo extends Imovel{
	private double valorAdicional;

	public ImovelNovo(double valorBase, Endereco endereco, double valorAdicional) {
		super(valorBase, endereco);
		this.valorAdicional = valorAdicional;
	}
	
	public void calcularValor() {
		System.out.printf("VALOR DO IMOVEL COM ADICIONAL NOVO: R$%.2f %n", (super.valorBase + this.valorAdicional));
	}
	
	public void exibirDados() {
		super.exibirDados();
		System.out.println("VALOR ADICIONAL: " + this.valorAdicional);
		this.calcularValor();
	}
}
