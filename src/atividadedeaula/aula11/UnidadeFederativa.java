package atividadedeaula.aula11;

public enum UnidadeFederativa {
	PARANA("Paraná", "PR", "Curitiba"),
    SANTA_CATARINA("Santa Catarina", "SC", "Florianópolis"),
    RIO_GRANDE_DO_SUL("Rio Grande do Sul", "RS", "Porto Alegre"),
    SAO_PAULO("São Paulo", "SP", "São Paulo"),
    RIO_DE_JANEIRO("Rio de Janeiro", "RJ", "Rio de Janeiro"),
    MINAS_GERAIS("Minas Gerais", "MG", "Belo Horizonte"),
    ESPIRITO_SANTO("Espírito Santo", "ES", "Vitória");
	
	private String unidadeFederativa;
	private String uf;
	private String nomeCapital;
	
	private UnidadeFederativa(String unidadeFederativa, String uf, String nomeCapital) {
		this.unidadeFederativa = unidadeFederativa;
		this.uf = uf;
		this.nomeCapital = nomeCapital;
	}

	public String getUnidadeFederativa() {
		return unidadeFederativa;
	}

	public String getUf() {
		return uf;
	}

	public String getNomeCapital() {
		return nomeCapital;
	}
	
	
}
