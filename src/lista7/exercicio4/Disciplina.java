package lista7.exercicio4;

public class Disciplina {
	private int codigo;
	private String nome;
	private String ementa;
	private int cargaHoraria;
	
	public Disciplina(int codigo, String nome, String ementa, int cargaHoraria) {
		this.codigo = codigo;
		this.nome = nome;
		this.ementa = ementa;
		this.cargaHoraria = cargaHoraria;
	}
	
	public void exibirDados(){
		System.out.println("NOME: " + this.nome);
		System.out.println("CÓDIGO: " + this.codigo);
		System.out.println("EMENTA: " + this.ementa);
		System.out.println("CARGA HORÁRIA: " + this.cargaHoraria);
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public String getEmenta() {
		return ementa;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	
}
