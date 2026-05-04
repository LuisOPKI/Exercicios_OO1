package lista4.exercicio1;

public class Funcionario {
	private Integer numeroRegistro;
	private String nome;
	private String dataNascimento;
	private String sexo;
	private String setor;
	private String telefone;
	private Endereco endereco;
	
	public Funcionario(Integer numeroRegistro, String nome, String dataNascimento, String sexo, String setor,
			String telefone, Endereco endereco) {
		this.numeroRegistro = numeroRegistro;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.setor = setor;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	
	public void emitirRelatorio(){
	        System.out.println("=== Dados do Funcionario ===");
	        System.out.println("Numero de Registro: " + numeroRegistro);
	        System.out.println("Nome: " + nome);
	        System.out.println("Data de Nascimento: " + dataNascimento);
	        System.out.println("Sexo: " + sexo);
	        System.out.println("Setor: " + setor);
	        System.out.println("Telefone: " + telefone);
	        
	        System.out.println("=== Endereco ===");
	        System.out.println("Logradouro: " + endereco.getLogradouro());
	        System.out.println("Numero: " + endereco.getNumero());
	        System.out.println("Bairro: " + endereco.getBairro());
	        System.out.println("Cidade: " + endereco.getCidade());
	        System.out.println("UF: " + endereco.getUnidadeFederativa());
	        System.out.println("=================================");
	}
	
}
