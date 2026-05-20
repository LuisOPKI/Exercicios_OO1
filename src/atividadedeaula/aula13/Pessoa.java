package atividadedeaula.aula13;

public class Pessoa {
	protected String nome;
	protected int idade;
	protected Endereco endereco;
	
	public Pessoa(String nome, int idade, Endereco endereco) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
	}
	
	public void imprimirDados() {
		System.out.println("=============================");
		System.out.println("NOME: " + this.nome);
		System.out.println("IDADE: " +  this.idade);
		System.out.println("ENDEREÇO: ");
		System.out.println("Logradouro: " + endereco.getLogradouro());
		System.out.println("Numero: " + endereco.getNumero());
		System.out.println("Bairro: " + endereco.getBairro());
		System.out.println("Cidade: " + endereco.getCidade());
		System.out.println("Unidade Federativa: " + endereco.getUnidadeFederativa());
		System.out.println("=============================");
	}
}
