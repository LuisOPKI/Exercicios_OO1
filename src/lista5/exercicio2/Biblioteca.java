package lista5.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private List<Livro> livros;
	private int DIAS_ATRASO_MAXIMO;
	
	public Biblioteca() {
		this.livros = new ArrayList<Livro>();
		this.DIAS_ATRASO_MAXIMO = 7;
		iniciarLivros();
	}
	
	private void iniciarLivros() {
		
		this.livros.add(new Livro("Java - Como Programar", "Paul Deitel", 2016, "Pearson", 968));
		this.livros.add(new Livro("Sistemas Operacionais Modernos", "Andrew Tanenbaum", 2015, "Pearson", 864));
		this.livros.add(new Livro("Engenharia de Software", "Roger Pressman", 2021, "AMGH", 704));
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
				System.out.println("O " + titulo + " está sob seus cuidados!");
			}
			else {
			System.out.println("O " + titulo + " não está disponível para emprestimo");
			}
		}
	}
	
	public void devolverLivro(String titulo, int diaDevolucao) {
		Livro livro = this.buscarLivro(titulo);
		if(livro == null) {
			System.out.println("O livro não foi encontrado!");
			return;
		}
		if(livro.isDisponibilidade() == false && diaDevolucao >= livro.getDiaEmprestimo()) {
			this.conferirAtraso(livro.getDiaEmprestimo(),diaDevolucao);
			System.out.println("O " + livro.getTitulo() + " está sendo devolvido!");
			livro.setDisponibilidade(true);
		}
		else {
			System.out.println("O livro não pode ser devolvido!");
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
	private void conferirAtraso(int diaEmprestimo, int diaDevolucao) {
		if(diaEmprestimo + this.DIAS_ATRASO_MAXIMO < diaDevolucao) {
			System.out.println("Você está devolvendo com atraso, e deverá pagar R$" + this.calcularMulta(diaEmprestimo, diaDevolucao));
		}
			
	}
	private double calcularMulta(int diaEmprestimo, int diaDevolucao) {
		double VALOR_MULTA = 1.50;
		double multa = (diaDevolucao - diaEmprestimo) * VALOR_MULTA;
		return multa;

	}
}

