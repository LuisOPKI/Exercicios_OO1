package lista4.exercicio2;

public class Professor {
	private Integer registro;
	private String nome;
	private String dataNascimento;
	private double salario;
	
	public Professor(Integer registro, String nome, String dataNascimento, double salario) {
		super();
		this.registro = registro;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.salario = salario;
	}

	public Integer getRegistro() {
		return registro;
	}

	public String getNome() {
		return nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public double getSalario() {
		return salario;
	}
	
	
}
