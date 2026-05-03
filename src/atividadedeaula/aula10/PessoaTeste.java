package atividadedeaula.aula10;

public class PessoaTeste {
	
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Luis",
				"04/11/2026",
				"Masculino",
				"luis@gmail.com",
				"Namorando com a Thais",
				new Endereco("Subida dos Pochynski",
						8,
						"Jardim Bela",
						"Ipiranga",
						"Paraná"));
		
		pessoa1.imprimirDados();
	}
}
