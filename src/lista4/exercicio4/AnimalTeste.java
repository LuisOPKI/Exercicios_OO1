package lista4.exercicio4;

public class AnimalTeste {
	public static void main(String[] args) {
		Animal animal1 = new Animal("Thor", 3, "Macho", 
				new Dono("Carlos Silva", "123.456.789-00", "(41) 99999-8888", "carlos@email.com", 
						new Endereco("Rua das Palmeiras", 150, "Batel", "Curitiba", "PR")), 
							new Tratamento("Vacinação Anual", "05/05/2026"));

		animal1.exibirRelatorio();	
		animal1.encerrarTratamento("06/05/2026");
		animal1.exibirRelatorio();
	}
}
