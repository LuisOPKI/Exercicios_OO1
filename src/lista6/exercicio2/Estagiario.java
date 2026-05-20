package lista6.exercicio2;

public class Estagiario extends Funcionario{
	private int ciee;

	public Estagiario(String nome, String endereco, String dataInicio, String funcao, double salario, int ciee) {
		super(nome, endereco, dataInicio, funcao, salario);
		this.ciee = ciee;
	}

	public int getCiee() {
		return ciee;
	}
	
	public void exibirDados() {

		super.exibirDados();
		
		System.out.println("Número CIEE: " + this.ciee);
	}

}
