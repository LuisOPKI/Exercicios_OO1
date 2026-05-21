package lista6.exercicio6;

public class Desenvolvedor extends Funcionario{
	private int projetosConcluidos;
	private final double VALOR_BONIFICACAO;
	
	public Desenvolvedor(String nome, int registro, double salarioBase, int projetosConcluidos) {
		super(nome, registro, salarioBase);
		this.projetosConcluidos = projetosConcluidos;
		VALOR_BONIFICACAO = 1500.00;
	}
	
	public void calcularSalarioFinal() {
		System.out.println("SALÁRIO FINAL: " + (this.valorTotalBonificacao() +  super.salarioBase));
	}
	
	public double valorTotalBonificacao() {
		double valor = (this.projetosConcluidos*this.VALOR_BONIFICACAO);
		System.out.println("VALOR TOTAL BONIFICAÇÃO: " + valor);
		return valor;
	}
	
	public void exibirDados() {
		System.out.println("CARGO: DESENVOLVEDOR");
		super.exibirDados();
		System.out.println("PROJETOS CONCLUIDOS: " + this.projetosConcluidos);
		System.out.println("VALOR DE CADA BONIFICAÇÃO: " + this.VALOR_BONIFICACAO);
		this.calcularSalarioFinal();
		System.out.println();
	}
}
