package lista6.exercicio2;

public class Empresa extends Prestador{
	private long cnpj;

	public Empresa(String nome, String endereco, String dataInicio, double valorHora, String tipoServico, long cnpj) {
		super(nome, endereco, dataInicio, valorHora, tipoServico);
		this.cnpj = cnpj;
	}

	public long getCnpj() {
		return cnpj;
	}
	public void exibirDados() {

		super.exibirDados();
		
		System.out.println("CNPJ: " + this.cnpj);
	}

}
