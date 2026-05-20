package atividadedeaula.aula13;

public class Professor extends Pessoa {
	private double salarioBase;
	private double salarioTitulacao;
	
	public Professor(String nome, int idade, Endereco endereco, double salarioBase, double salarioTitulacao) {
		super(nome, idade, endereco);
		this.salarioBase = salarioBase;
		this.salarioTitulacao = salarioTitulacao;
	}
	
	public double calcularSalario(){
		return this.salarioBase + this.salarioTitulacao;
	}
	
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("CARGO PROFESSOR");
		System.out.println("SALÁRIO: " + this.calcularSalario());
	}
}
