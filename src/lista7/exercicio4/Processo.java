package lista7.exercicio4;

public class Processo {
	private int num;
	private String dataDeCriacao;
	private String descricao;
	
	public Processo(int num, String dataDeCriacao, String descricao) {

		this.num = num;
		this.dataDeCriacao = dataDeCriacao;
		this.descricao = descricao;
	}
	
	public void exibirDados() {
		System.out.println("NÚMERO DO PROCESSO: " + this.num);
		System.out.println("DATA DE CRIAÇÃO: " + this.dataDeCriacao);
		System.out.println("DESCRIÇÃO: " + this.descricao);
	}

	public int getNum() {
		return num;
	}

	public String getDataDeCriacao() {
		return dataDeCriacao;
	}

	public String getDescricao() {
		return descricao;
	}
	
}
