package atividadedeaula.aula11;

public class Empresa {
	
	private String razaoSocial;
	private String cnpj;
	private UnidadeFederativa unidadeFederativa;
	
	public Empresa(String razaoSocial, String cnpj, UnidadeFederativa unidadeFederativa) {
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.unidadeFederativa = unidadeFederativa;
	}

	@Override
	public String toString() {
		return "Empresa [razaoSocial=" + razaoSocial + ", cnpj=" + cnpj + ", unidadeFederativa=" + unidadeFederativa
				+ "]";
	}


}
