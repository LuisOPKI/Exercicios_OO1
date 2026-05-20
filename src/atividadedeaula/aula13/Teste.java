package atividadedeaula.aula13;

public class Teste {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Luis",
								19,
								new Endereco("Jose",
								8,
								"Jardim",
								"Boa Vista",
								"PR"));
		Professor professor1 = new Professor("Saulo", 40,new Endereco("Flor",
								67,
								"Sesamo",
								"Pinheiros",
								"BH"),2500.00, 1500.00 );
		
		professor1.imprimirDados();
		aluno1.realizarMatricula("ADS");
		aluno1.imprimirDados();
	}
}
