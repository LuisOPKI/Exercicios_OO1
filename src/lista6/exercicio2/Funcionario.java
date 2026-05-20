package lista6.exercicio2;

public class Funcionario extends Colaborador{
	protected String funcao;
	protected double salario;
	public Funcionario(String nome, String endereco, String dataInicio, String funcao, double salario) {
		super(nome, endereco, dataInicio);
		this.funcao = funcao;
		this.salario = salario;
	}
	public void exibirDados() {

		super.exibirDados();
		
		System.out.println("Função: " + this.funcao);
		System.out.println("Salário: R$" + this.salario);
	}
}
