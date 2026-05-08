package lista5.exercicio2;

public class Livro {
	private String titulo;	
	private String autor;
	private int anoPublicacao;
	private String editora;
	private int numMaxPaginas;
	private boolean disponibilidade;
	private int diaEmprestimo;
	
	public Livro(String titulo, String autor, int anoPublicacao, String editora, int numMaxPaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.editora = editora;
		this.numMaxPaginas = numMaxPaginas;
		this.disponibilidade = true;
		this.diaEmprestimo = 0;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getNumMaxPaginas() {
		return numMaxPaginas;
	}

	public void setNumMaxPaginas(int numMaxPaginas) {
		this.numMaxPaginas = numMaxPaginas;
	}

	public boolean isDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	public int getDiaEmprestimo() {
		return diaEmprestimo;
	}

	public void setDiaEmprestimo(int diaEmprestimo) {
		this.diaEmprestimo = diaEmprestimo;
	}
	
}
