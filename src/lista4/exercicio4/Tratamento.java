package lista4.exercicio4;

public class Tratamento {
	private String descricao;
	private String dataInicio;
	private String dataFim;
	
	public Tratamento(String descricao, String dataInicio) {
		this.descricao = descricao;
		this.dataInicio = dataInicio;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public String getDataFim() {
		return dataFim;
	}
	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}
}
