package lista6.exercicio5;

public class ImovelUsado extends Imovel{
	private double valorDesconto;

	public ImovelUsado(double valorBase, Endereco endereco, double valorDesconto) {
		super(valorBase, endereco);
		this.valorDesconto = valorDesconto;
	}
	
	public void calcularValor() {
		System.out.printf("VALOR DO IMOVEL COM DESCONTO USADO: R$%.2f %n", (super.valorBase + this.valorDesconto));
	}
	
	public void exibirDados() {
		super.exibirDados();
		System.out.println("VALOR DO DESCONTO: " + this.valorDesconto);
		this.calcularValor();
	}
}
