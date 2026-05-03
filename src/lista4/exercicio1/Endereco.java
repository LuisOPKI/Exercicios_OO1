package lista4.exercicio1;

public class Endereco {
	private String logradouro;
	private Integer numero;
	private String bairro;
	private String cidade;
	private String unidadeFederativa;
	
	public Endereco(String logradouro, Integer numero, String bairro, String cidade, String unidadeFederativa) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.unidadeFederativa = unidadeFederativa;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public Integer getNumero() {
		return numero;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public String getUnidadeFederativa() {
		return unidadeFederativa;
	}
	
}
