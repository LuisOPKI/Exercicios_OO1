package lista6.exercicio5;

public class Imovel {
	protected double valorBase;
	protected Endereco endereco;
	
	public Imovel(double valorBase, Endereco endereco) {
		super();
		this.valorBase = valorBase;
		this.endereco = endereco;
	}
	
	public void exibirDados() {
		System.out.println("===================");
		System.out.println("VALOR BASE: " + this.valorBase);
		System.out.println("ENDEREÇO");
		System.out.println("LOGRADOURO: " + endereco.getLogradouro());
		System.out.println("NÚMERO: " + endereco.getNumero());
		System.out.println("BAIRRO: " + endereco.getBairro());
		System.out.println("CIDADE: " + endereco.getCidade());
		System.out.println("UNIDADE FEDERATIVA: " + endereco.getUf());
	}
}
