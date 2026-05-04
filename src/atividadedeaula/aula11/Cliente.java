package atividadedeaula.aula11;
//
public class Cliente {
	private Integer codigo;
	private String nome;
	private String dataNascimento;
	private EstadoCivil estadoCivil;
	
	public Cliente(Integer codigo, String nome, String dataNascimento, EstadoCivil estadoCivil) {

		this.codigo = codigo;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.estadoCivil = estadoCivil;
	}

	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", estadoCivil="
				+ estadoCivil + "]";
	}
	
}
