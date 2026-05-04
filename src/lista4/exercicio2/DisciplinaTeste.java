package lista4.exercicio2;

public class DisciplinaTeste {
	public static void main(String[] args) {
		Disciplina disc1 = new Disciplina(101,
				"Estrutura de Dados",
				"Presencial",
				80,
				new Professor(9988,
						"Dr. Ricardo Oliveira",
						"15/07/1980",
						7500.00));
		disc1.exibirRelatorio();
	}
}
