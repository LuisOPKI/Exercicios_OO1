package lista2.exercicio6;

public class Livro {
	
	String titulo;
	String autor;
	String editora;
	int numPaginas;
	int anoPublicacao;
	String situacao;
	
	public void emprestar() {
		if (situacao == "disponivel") {
			System.out.println("O " + titulo + " estará sob seus cuidados!");
			situacao = "indisponivel";
		}
		else {
			System.out.println("O " + titulo + " já está sob emprestimo!");
		}
	}
	public void devolver() {
		if (situacao == "indisponivel") {
			System.out.println("O " +  titulo + " está sendo devolvido!");
			situacao = "disponivel";
		}
		else {
			System.out.println("O " + titulo + " não pode ser devolvido, pois está disponivel para emprestimo!");
		}
	}
	public String toString() {
		return titulo + ", " + autor + ", Editora " + editora + ", \n" + numPaginas + " páginas, "
				+ anoPublicacao + ", "+ situacao + " para empréstimo!";
	}
}
