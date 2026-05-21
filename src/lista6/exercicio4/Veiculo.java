package lista6.exercicio4;

public class Veiculo {
	protected String marca;
	protected String modelo;
	protected int anoFabricacao;
	protected double valor;
	
	public Veiculo(String marca, String modelo, int anoFabricacao, double valor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.valor = valor;
	}
	
	public void exibirDados() {
		System.out.println("=====================");
		System.out.println("MARCA: " + this.marca);
		System.out.println("MODELO: " + this.modelo);
		System.out.println("ANO DE FABRICAÇÃO: " + this.anoFabricacao);
		System.out.println("VALOR: R$" + this.valor);
	}
}
