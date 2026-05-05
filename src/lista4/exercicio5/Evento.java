package lista4.exercicio5;

public class Evento {
	private String nome;
	private Artista artista;
	private String data;
	private Local local;
	private int classeEtaria;
	
	public Evento(String nome, Artista artista, String data, Local local, int classeEtaria, Endereco endereco) {
		this.nome = nome;
		this.artista = artista;
		this.data = data;
		this.local = local;
		this.classeEtaria = classeEtaria;
	}
	public void comprarIngressos(int quantidade) {
		if (quantidade > this.local.getIngressosDisponiveis() && quantidade < 0) {
			System.out.println("Quantidade de ingressos indisponíveis");
		}
		else {
			this.local.setIngressosDisponiveis(this.local.getIngressosDisponiveis() - quantidade);
			System.out.println("A compra de seu ingresso foi concluída!");
		}
	}
	public void exibirRelatorio() {
	    System.out.println("======= DETALHES DO EVENTO =======");
	    System.out.println("Evento: " + this.nome);
	    System.out.println("Data: " + this.data);
	    System.out.println("Classificação: " + this.classeEtaria + " anos");
	    
	    System.out.println("\n--- Artista ---");
	    System.out.println("Nome: " + this.artista.getNome());
	    System.out.println("Nacionalidade: " + this.artista.getNacionalidade());
	    System.out.println("Bio: " + this.artista.getBiografia());
	    
	    System.out.println("\n--- Local e Ingressos ---");
	    System.out.println("Local: " + this.local.getNome());
	    System.out.println("Capacidade Máxima: " + this.local.getCapacidadeMax());
	    System.out.println("Disponíveis: " + this.local.getIngressosDisponiveis());
	    
	    System.out.println("\n--- Endereço do Local ---");
	    System.out.println("Rua: " + this.local.getEndereco().getLogradouro() + ", " + this.local.getEndereco().getNumero());
	    System.out.println("Bairro: " + this.local.getEndereco().getBairro());
	    System.out.println("Cidade/UF: " + this.local.getEndereco().getCidade() + " - " + this.local.getEndereco().getEstado());
	    System.out.println("==================================\n");
	}
}
