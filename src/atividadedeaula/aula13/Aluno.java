package atividadedeaula.aula13;

public class Aluno extends Pessoa{
	private String curso;

	public Aluno(String nome, int idade, Endereco endereco) {
		super(nome, idade, endereco);
		this.curso = null;
	}
	
	public void realizarMatricula(String curso) {
		this.curso = curso;
		System.out.println("==========================================");
		System.out.println("Matricula realizada para o curso " + curso);
	}
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("ALUNO");
		System.out.println("CURSO: " + this.curso);
	}
}
