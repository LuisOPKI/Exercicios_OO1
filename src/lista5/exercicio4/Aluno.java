package lista5.exercicio4;

import java.util.List;
import java.util.ArrayList;

public class Aluno {
	private String nome;
	private int ra;
	private List<Double> notas;
	
	public Aluno(String nome, int ra) {
		this.nome = nome;
		this.ra = ra;
		this.notas = new ArrayList<Double>();
	}
	public void atribuirNota(Double nota) {
		this.notas.add(nota);
	}
	public double calculoMedia() {
		int avaliacoes = this.notas.size();
		Double soma = 0.0;
		for(Double nota : this.notas) {
			soma += nota; 
		}
		Double media = soma / avaliacoes;
		this.situacaoAluno(media);
		return media;
	}
	private void situacaoAluno(Double media) {
		System.out.println("=================");
		System.out.println("ALUNO: " + this.nome);
		System.out.println("RA:" + this.ra);
		System.out.println("MEDIA FINAL:" + media);
		System.out.println("=================");
		if(media < 6.0) {
			System.out.println("REPROVADO! :(");
			System.out.println("=================");
		}
		else {
			System.out.println("APROVADO! S2");
			System.out.println("=================");
		}
	}
	public String getNome() {
		return nome;
	}

	public int getRa() {
		return ra;
	}
	
}
