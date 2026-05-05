package lista4.exercicio4;

public class Animal {
	private String nome;
	private int idade;
	private String sexo;
	private Dono dono;
	private Tratamento tratamento;
	
	public Animal(String nome, int idade, String sexo, Dono dono, Tratamento tratamento) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.dono = dono;
		this.tratamento = tratamento;
	}
	
	public void iniciarTratamento(String descricao, String dataInicio) {
		this.tratamento = new Tratamento(descricao,dataInicio);
		System.out.println("Inicio de tratamento para " + this.nome + ", no dia " + dataInicio + ", descrição: " + descricao);
	}
	public void encerrarTratamento(String dataFim) {
		this.tratamento.setDataFim(dataFim);
		System.out.println("O tratamento de " + this.nome + "foi encerrado!");
	}
	public void exibirRelatorio() {
	    System.out.println("==========================================");
	    System.out.println("           RELATÓRIO DO ANIMAL            ");
	    System.out.println("==========================================");
	    System.out.println("Nome Animal: " + this.nome);
	    System.out.println("Idade Animal: " + this.idade);
	    System.out.println("Sexo Animal: " + this.sexo);
	    
	    System.out.println("\n--- Dados do Dono ---");
	    System.out.println("Nome: " + this.dono.getNome());
	    System.out.println("CPF: " + this.dono.getCpf());
	    System.out.println("Telefone: " + this.dono.getTelefone());
	    System.out.println("Email: " + this.dono.getEmail());
	    
	    System.out.println("\n--- Endereço do Dono ---");
	    System.out.println("Logradouro: " + this.dono.getEndereco().getLogradouro());
	    System.out.println("Número: " + this.dono.getEndereco().getNumero());
	    System.out.println("Bairro: " + this.dono.getEndereco().getBairro());
	    System.out.println("Cidade: " + this.dono.getEndereco().getCidade());
	    System.out.println("UF: " + this.dono.getEndereco().getUf());
	    
	    System.out.println("\n--- Informações de Tratamento ---");
	    if (this.tratamento != null) {
	        System.out.println("Descrição: " + this.tratamento.getDescricao());
	        System.out.println("Data de Início: " + this.tratamento.getDataInicio());
	        System.out.println("Data de Término: " + (this.tratamento.getDataFim() != null ? this.tratamento.getDataFim() : "Em aberto"));
	    } else {
	        System.out.println("Nenhum tratamento registrado.");
	    }
	    System.out.println("==========================================\n");
	}
}
