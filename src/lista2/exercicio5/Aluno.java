package lista2.exercicio5;

public class Aluno {
	
	int RA;
	String nome;
	String curso;
	String turno;
	int periodo;
	double coeficiente;
	String situacao;
	
	public void responderChamada(){
		System.out.println(nome + " está respondendo a chamada!");
	}
	public void fazerAvaliacao() {
		System.out.println(nome + " está realizando a avaliação!");
	}
	@Override
	public String toString() {
		return "Aluno [RA=" + RA + ", nome=" + nome + ", curso=" + curso + ", turno=" + turno + ", periodo=" + periodo
				+ ", coeficiente=" + coeficiente + ", situacao=" + situacao + "]";
	}
}
