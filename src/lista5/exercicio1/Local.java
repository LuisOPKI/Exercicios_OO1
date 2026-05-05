package lista5.exercicio1;

public class Local {
	private String nome;
	private Endereco endereco;
	private int capacidadeMax;
	private int ingressosDisponiveis;
	public Local(String nome, Endereco endereco, int capacidadeMax) {
		this.nome = nome;
		this.endereco = endereco;
		this.capacidadeMax = capacidadeMax;
		this.ingressosDisponiveis = this.capacidadeMax;
	}
	public int getIngressosDisponiveis() {
		return ingressosDisponiveis;
	}
	public void setIngressosDisponiveis(int ingressosDisponiveis) {
		this.ingressosDisponiveis = ingressosDisponiveis;
	}
	public String getNome() {
		return nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public int getCapacidadeMax() {
		return capacidadeMax;
	}
	
	
}
