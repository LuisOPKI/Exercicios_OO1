package lista6.exercicio3;

public class AlunoTeste {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Otaldo", "04/02/1873", 1234567, 1234567);
		pessoa.exibirInformacoes();
		
		Aluno aluno = new Aluno("Jr Neyma", "03/12/2001", 123456, 12345, 12345);
		aluno.exibirInformações();
	}
}
