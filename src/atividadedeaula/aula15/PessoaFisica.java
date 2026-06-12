package atividadedeaula.aula15;

public class PessoaFisica extends Pessoa{
	private double gastoComSaude;

	public PessoaFisica(String nome, double rendaAnual, double gastoComSaude) {
		super(nome, rendaAnual);
		this.gastoComSaude = gastoComSaude;
	}
	
	@Override
	protected void imprimirDados() {
		super.imprimirDados();
		System.out.println("Imposto: " + this.calcularImposto());
	}
	
	@Override
	protected double calcularImposto() {
		if(rendaAnual < 20000.00) {
			if(this.gastoComSaude > 0) {
				return (rendaAnual * 0.15) - (this.gastoComSaude * 0.50);
			}
			return (rendaAnual * 0.15);
		}
		else if(this.gastoComSaude > 0) {
			return (rendaAnual * 0.25) - (this.gastoComSaude * 0.50);
		}
		else {
			return (rendaAnual * 0.25);
		}
	}
}
