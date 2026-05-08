package lista5.exercicio2;

public class Livro {
	private String titulo;	
	private String autor;
	private int anoPublicacao;
	private String editora;
	private int numMaxPaginas;
	private boolean disponibilidade;
	private String dataEmprestimo;
	
	public Livro(String titulo, String autor, int anoPublicacao, String editora, int numMaxPaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.editora = editora;
		this.numMaxPaginas = numMaxPaginas;
		this.disponibilidade = true;
		this.dataEmprestimo = null;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public String getEditora() {
		return editora;
	}
	public int getNumMaxPaginas() {
		return numMaxPaginas;
	}
	
	
}
