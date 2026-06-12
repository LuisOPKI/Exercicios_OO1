package atividadedeaula.aula15;

public class PessoaJuridica extends Pessoa{
	private int numFuncionarios;

	public PessoaJuridica(String nome, double rendaAnual, int numFuncionarios) {
		super(nome, rendaAnual);
		this.numFuncionarios = numFuncionarios;
	}
	
	@Override
	protected void imprimirDados() {
		super.imprimirDados();
		System.out.println("Imposto: " + this.calcularImposto());
	}
	
	@Override
	protected double calcularImposto() {
		if(numFuncionarios > 15) {
			return (rendaAnual * 0.13);
		}
		else {
			return (rendaAnual * 0.18);
		}
	}
}
