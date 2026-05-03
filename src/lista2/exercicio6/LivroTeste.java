package lista2.exercicio6;

public class LivroTeste {
	public static void main(String[] args) {
		
		Livro livro1 = new Livro();
		Livro livro2 = new Livro();
		Livro livro3 = new Livro();
		
		livro1.titulo = "Clean Code";
		livro1.autor = "Robert C. Martin";
		livro1.editora = "Prentice Hall";
		livro1.numPaginas = 464;
		livro1.anoPublicacao = 2008;
		livro1.situacao = "disponivel";

		livro2.titulo = "O Senhor dos Anéis";
		livro2.autor = "J.R.R. Tolkien";
		livro2.editora = "HarperCollins";
		livro2.numPaginas = 1136;
		livro2.anoPublicacao = 1954;
		livro2.situacao = "indisponivel";

		livro3.titulo = "1984";
		livro3.autor = "George Orwell";
		livro3.editora = "Companhia das Letras";
		livro3.numPaginas = 336;
		livro3.anoPublicacao = 1949;
		livro3.situacao = "disponivel";
		
		livro1.emprestar();
		livro2.devolver();
		System.out.println(livro3);
		livro1.emprestar();
		livro2.devolver();
	}
}
