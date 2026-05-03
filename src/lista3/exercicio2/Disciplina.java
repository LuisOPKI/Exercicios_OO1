package lista3.exercicio2;

public class Disciplina {
	private int codigo;
	private String nome;
	private String modalidade;
	private int horas;
	private String contProgramatico;
	
	public Disciplina(int codigo, String nome, String modalidade, int horas,
					  String contProgramatico) {
		
		this.codigo = codigo;
		this.nome = nome;
		this.modalidade = modalidade;
		this.horas = horas;
		this.contProgramatico = contProgramatico;
	}
	public void setContProgramatico(String contProgramatico) {
		this.contProgramatico = contProgramatico;
	}
	public int getCodigo() {
		return codigo;
	}
	public String getNome() {
		return nome;
	}
	public String getModalidade() {
		return modalidade;
	}
	public int getHoras() {
		return horas;
	}
	public String getContProgramatico() {
		return contProgramatico;
	}
	@Override
	public String toString() {
		return "Disciplina [codigo=" + codigo + ", nome=" + nome + ", modalidade=" + modalidade + ", horas=" + horas
				+ ", contProgramatico=" + contProgramatico + "]";
	}
	
}

