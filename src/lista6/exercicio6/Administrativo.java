package lista6.exercicio6;

public class Administrativo extends Funcionario{
	private double adicional;

	public Administrativo(String nome, int registro, double salarioBase, double adicional) {
		super(nome, registro, salarioBase);
		this.adicional = adicional;
	}
	
	public void calcularSalarioFinal() {
		System.out.println("SALÁRIO FINAL: " + (this.adicional + super.salarioBase));
	}
	
	public void exibirDados() {
		System.out.println("CARGO: ADMINISTRATIVO");
		super.exibirDados();
		System.out.println("ADICIONAL DO SALÁRIO: " + this.adicional);
		this.calcularSalarioFinal();
		System.out.println();
	}
}
