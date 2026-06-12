package atividadedeaula.aula15;

public class Pessoa {
	protected String nome;
	protected double rendaAnual;
	
	public Pessoa(String nome, double rendaAnual) {
		super();
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}
	
	protected void imprimirDados() {
		System.out.println("==============================");
		System.out.println(this.nome);
		System.out.println(this.rendaAnual);
	}
	
	protected double calcularImposto() {
		return 0.0;
	}
}
