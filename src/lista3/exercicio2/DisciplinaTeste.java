package lista3.exercicio2;

public class DisciplinaTeste {
	public static void main(String[] args) {
		
		Disciplina disciplina1 = new Disciplina(6563,"Banco de dados","Presencial",60,"Entidades, relacionamentos, SQL");
		
		Disciplina disciplina2 = new Disciplina(456, "Engenharia de Software", "Presencial", 60, "Modelo de Processo, Qualidade de Software, Testes de Software");
		
		System.out.println(disciplina1.getContProgramatico());
		disciplina1.setContProgramatico("SQL e BRmodelo");
		System.out.println(disciplina1.getContProgramatico());
		
		System.out.println(disciplina1);
		System.out.println(disciplina2);
	}
}
