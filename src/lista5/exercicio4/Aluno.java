package lista5.exercicio4;

import java.util.List;
import java.util.ArrayList;

public class Aluno {
	private String nome;
	private int ra;
	private List<Double> nota;
	
	public Aluno(String nome, int ra) {
		this.nome = nome;
		this.ra = ra;
		this.nota = new ArrayList<Double>();
	}
	
	public String getNome() {
		return nome;
	}

	public int getRa() {
		return ra;
	}
	
}
