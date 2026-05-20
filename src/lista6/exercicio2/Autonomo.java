package lista6.exercicio2;

public class Autonomo extends Prestador{
	private long cpf;

	public Autonomo(String nome, String endereco, String dataInicio, double valorHora, String tipoServico, long cpf) {
		super(nome, endereco, dataInicio, valorHora, tipoServico);
		this.cpf = cpf;
	}

	public long getCpf() {
		return cpf;
	}
	
	public void exibirDados() {

		super.exibirDados();
		
		System.out.println("CPF: " + this.cpf);
	}
}
