package lista5.exercicio4;

public class DisciplinaTeste {
	public static void main(String[] args) {
		Disciplina disciplina = new Disciplina("Programação Orientada a Objetos");

		disciplina.matricularAluno("Alice Mendes", 1001);
		disciplina.matricularAluno("Bruno Martins", 1002);
		disciplina.matricularAluno("Carlos Eduardo", 1003);
		disciplina.matricularAluno("Diana Silva", 1004);
		disciplina.matricularAluno("Elias Costa", 1005);
		disciplina.matricularAluno("Fernanda Lima", 1006);
		disciplina.matricularAluno("Gabriel Rocha", 1007);
		disciplina.matricularAluno("Helena Souza", 1008);
		disciplina.matricularAluno("Igor Pereira", 1009);
		disciplina.matricularAluno("Julia Carvalho", 1010);

		disciplina.atribuirNota(1001, 8.5);
		disciplina.atribuirNota(1001, 9.0);

		disciplina.atribuirNota(1002, 5.5);
		disciplina.atribuirNota(1002, 6.5);

		disciplina.atribuirNota(1003, 7.0);
		disciplina.atribuirNota(1003, 8.0);

		disciplina.atribuirNota(1004, 4.0);
		disciplina.atribuirNota(1004, 5.0);

		disciplina.atribuirNota(1005, 9.5);
		disciplina.atribuirNota(1005, 10.0);

		disciplina.atribuirNota(1006, 6.0);
		disciplina.atribuirNota(1006, 6.0);

		disciplina.atribuirNota(1007, 3.5);
		disciplina.atribuirNota(1007, 4.0);

		disciplina.atribuirNota(1008, 8.0);
		disciplina.atribuirNota(1008, 7.5);

		disciplina.atribuirNota(1009, 7.5);
		disciplina.atribuirNota(1009, 8.5);

		disciplina.atribuirNota(1010, 5.0);
		disciplina.atribuirNota(1010, 5.5);

		disciplina.finalizarSemestre();
	}
}
