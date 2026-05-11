package lista5.exercicio2;

public class BibliotecaTesta {
	public static void main(String[] args) {
		Biblioteca biblioteca1 = new Biblioteca();
		
		biblioteca1.emprestarLivro("Java - Como Programar", 10);
		biblioteca1.emprestarLivro("Java - Como Programar", 10);
		
		biblioteca1.devolverLivro("Sistemas Operacionais Modernos", 10);
		biblioteca1.devolverLivro("Java - Como Programar", 10);
		
		biblioteca1.emprestarLivro("Java - Como Programar", 10);
		biblioteca1.devolverLivro("Java - Como Programar", 20);
	}
}
