package lista6.exercicio3;

public class Aluno extends Pessoa{
	private int matricula;

	public Aluno(String nome, String nascimento, int rg, int cpf, int matricula) {
		super(nome, nascimento, rg, cpf);
		this.matricula = matricula;
	}
	
	public void exibirInformações() {
		super.exibirInformacoes();
		System.out.println("ALUNO");
		System.out.println("MATRICULA: " + this.matricula);
		System.out.println("===================");
	}
}
