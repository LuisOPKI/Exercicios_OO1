package atividadedeaula.aula15;

public class PessoaTeste {
	public static void main(String[] args) {
		PessoaJuridica pessoa1 = new PessoaJuridica("Sergio", 100, 15);
		PessoaJuridica pessoa2 = new PessoaJuridica("Sergio", 100, 16);
		
		PessoaFisica pessoa3 = new PessoaFisica("Luis", 20000.00, 100);
		PessoaFisica pessoa4 = new PessoaFisica("Luis", 10000.00, 0);
		
		pessoa1.imprimirDados();
		pessoa2.imprimirDados();
		pessoa3.imprimirDados();
		pessoa4.imprimirDados();
	}
}
