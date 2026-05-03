package lista3.exercicio1;

public class Funcionario {
	
	private int numRegistro;
	private String nome;
	private String dataNascimento;
	private String sexo;
	private String setor;
	private String telefone;
	private String rua;
	private int numero;
	private String bairro;
	private String cidade;
	private String estado;
	
	public Funcionario(int numRegistro, String nome, String dataNascimento, String sexo,
			String setor, String telefone, String rua, int numero, String bairro, String cidade, 
			String estado) {
		this.numRegistro = numRegistro;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.setor = setor;
		this.telefone = telefone;
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}
	public int getNumRegistro() {
		return numRegistro;
	}
	public String getNome() {
		return nome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public String getSexo() {
		return sexo;
	}
	public String getSetor() {
		return setor;
	}
	public String getTelefone() {
		return telefone;
	}
	public String getRua() {
		return rua;
	}
	public int getNumero() {
		return numero;
	}
	public String getBairro() {
		return bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	@Override
	public String toString() {
		return "Funcionario [numRegistro=" + numRegistro + ", nome=" + nome + ", dataNascimento=" + dataNascimento
				+ ", sexo=" + sexo + ", setor=" + setor + ", telefone=" + telefone + ", rua=" + rua + ", numero="
				+ numero + ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + "]";
	}
	
}
