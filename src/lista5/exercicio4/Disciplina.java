package lista5.exercicio4;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
	private String nome;
	private List<Aluno> alunos;
	public Disciplina(String nome) {
		
		this.nome = nome;
		this.alunos = new ArrayList<Aluno>();
	}
	public Aluno buscaRa(int ra){
		for(Aluno aluno : alunos) {
			if (aluno.getRa() == ra) {
				return aluno;
			}
		}
		return null;
	}
	public void matricularAluno(String nome, int ra) {
		Aluno aluno = buscaRa(ra);
		if(aluno == null) {
			this.alunos.add(new Aluno(nome, ra));
			System.out.println("=============================");
			System.out.println("O novo aluno foi matriculado!");
			System.out.println("Bem vindo " + nome + " a matéria " + this.nome);
			System.out.println("Seu RA é: " + ra);
			System.out.println("=============================");
		}
		else {
			System.out.println("Este RA já está em uso!");
		}
	}
	
	public void atribuirNota(int ra, Double nota) {
		Aluno aluno = buscaRa(ra);
		if(aluno == null) {
			this.alunos.add(new Aluno(nome, ra));
		}
		else {
			System.out.println("Este RA não foi encontrado!");
		}
	}
}
