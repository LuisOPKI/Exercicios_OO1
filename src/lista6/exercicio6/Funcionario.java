package lista6.exercicio6;

public class Funcionario {
	protected String nome;
	protected int registro;
	protected double salarioBase;
	
	public Funcionario(String nome, int registro, double salarioBase) {
		super();
		this.nome = nome;
		this.registro = registro;
		this.salarioBase = salarioBase;
	}
	public void exibirDados() {
		System.out.println("=========================");
		System.out.println("NOME: " + this.nome);
		System.out.println("REGISTRO: " + this.registro);
		System.out.println("SALÁRIO BASE: " + this.salarioBase);
	}
}
