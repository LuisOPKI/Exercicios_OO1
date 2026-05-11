package lista5.exercicio3;

public class Produto {
	private int codigo;
	private String nomeProduto;
	private String marca;
	private String modelo;
	private int quantidadeEstoque;
	private double valorUnd;
	
	public Produto(int codigo, String nomeProduto, String marca, String modelo, int quantidadeEstoque,
			double valorUnd) {
		this.codigo = codigo;
		this.nomeProduto = nomeProduto;
		this.marca = marca;
		this.modelo = modelo;
		this.quantidadeEstoque = quantidadeEstoque;
		this.valorUnd = valorUnd;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public double getValorUnd() {
		return valorUnd;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	
}
