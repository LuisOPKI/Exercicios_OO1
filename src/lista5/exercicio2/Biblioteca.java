package lista5.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private List<Livro> livros;
	
	public Biblioteca() {
		this.livros = new ArrayList<Livro>();
	}
	
	public void emprestar(String titulo, String dataEmprestimo) {
		for(Livro livro : livros) {
			if(titulo.equalsIgnoreCase(livro.getTitulo())) {
				
			}
		}
	}
}
