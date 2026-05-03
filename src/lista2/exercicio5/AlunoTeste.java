package lista2.exercicio5;

public class AlunoTeste {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		
		aluno1.RA = 6453756;
		aluno1.nome = "Carlos Souza";
		aluno1.curso = "Engenharia de Software";
		aluno1.turno = "Noturno";
		aluno1.periodo = 3;
		aluno1.coeficiente = 0.78;
		aluno1.situacao = "Matriculado";

		aluno2.RA = 6543213;
		aluno2.nome = "Mariana Costa";
		aluno2.curso = "Ciência da Computação";
		aluno2.turno = "Matutino";
		aluno2.periodo = 1;
		aluno2.coeficiente = 0.9;
		aluno2.situacao = "Matriculado";

		aluno3.RA = 9876541;
		aluno3.nome = "Rafael Lima";
		aluno3.curso = "Sistemas de Informação";
		aluno3.turno = "Integral";
		aluno3.periodo = 8;
		aluno3.coeficiente = 0.87;
		aluno3.situacao = "Trancado";
		
		aluno1.responderChamada();
		aluno2.fazerAvaliacao();
		System.out.println(aluno3);
		System.out.println(aluno2);
	}
}
