package lista6.exercicio2;

public class Empregado extends Funcionario{
	private int carteiraTrabalho;

	public Empregado(String nome, String endereco, String dataInicio, String funcao, double salario,
			int carteiraTrabalho) {
		super(nome, endereco, dataInicio, funcao, salario);
		this.carteiraTrabalho = carteiraTrabalho;
	}

	public int getCarteiraTrabalho() {
		return carteiraTrabalho;
	}
	public void exibirDados() {

		super.exibirDados();
		
		System.out.println("Número da Carteira de Trabalho: " + this.carteiraTrabalho);
	}
}
