package lista5.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private List<Livro> livros;
	
	public Biblioteca() {
		this.livros = new ArrayList<Livro>();
	}
	
	public void emprestarLivro(String titulo, int diaEmprestimo) {
		Livro livro = this.buscarLivro(titulo);
		if(livro == null) {
		System.out.println("O livro não foi encontrado!");
	}
		else {
			if(livro.isDisponibilidade() == true) {
				livro.setDisponibilidade(false);
				livro.setDiaEmprestimo(diaEmprestimo);
				System.out.println("O " + titulo + "está sob seus cuidados!");
			}
			else {
			System.out.println("O " + titulo + "não está disponível para emprestimo");
			}
		}
	}
	
	public void devolverLivro(String titulo, int diaEmprestimo) {
		Livro livro = this.buscarLivro(titulo);
		if(livro == null) {
			System.out.println("O livro não foi encontrado!");
			return;
		}
		if(livro.isDisponibilidade() == false) {
			this.conferirAtraso(diaEmprestimo);
		}
		
	}
	
	private Livro buscarLivro(String titulo) {
		for(Livro livro : livros) {
			if(livro.getTitulo().equals(titulo)) {
				return livro;
			}
		}
		return null;
	}
	private Livro conferirAtraso(int diaEmprestimo) {
		
	}
}

