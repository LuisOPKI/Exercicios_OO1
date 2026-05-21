package lista6.exercicio6;

public class Gerente extends Funcionario{
	private double lucroEmpresa;
	private final double PERCENTUAL_PARTICIPACOES_LUCROS;
	
	
	public Gerente(String nome, int registro, double salarioBase, double lucroEmpresa) {
		super(nome, registro, salarioBase);
		this.lucroEmpresa = lucroEmpresa;
		this.PERCENTUAL_PARTICIPACOES_LUCROS = 0.01;
	}

	public void calcularSalarioFinal() {
		System.out.printf("SALÁRIO FINAL: %.2f %n", (this.valorTotalParticipacaoLucros() +  super.salarioBase));
	}
	public double valorTotalParticipacaoLucros() {
		double valor = (this.lucroEmpresa*this.PERCENTUAL_PARTICIPACOES_LUCROS);
		System.out.printf("VALOR TOTAL DE PARTICIPAÇÃO NOS LUCROS: %.2f %n ", valor);
		return valor;
	}
	public void exibirDados() {
		System.out.println("CARGO: GERENTE");
		super.exibirDados();
		System.out.println("LUCRO DA EMPRESA: " + this.lucroEmpresa);
		System.out.println("PERCENTUAL DE PARTICIPAÇÃO: " + this.PERCENTUAL_PARTICIPACOES_LUCROS);
		this.calcularSalarioFinal();
		System.out.println();
	}
}
