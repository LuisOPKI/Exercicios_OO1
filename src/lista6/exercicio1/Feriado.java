package lista6.exercicio1;

public class Feriado extends Data {
	
	private String descricao;

	public Feriado() {
		super();
		this.descricao = "Feriado";
	}
	public Feriado(String descricao) {
		super();
		this.descricao = descricao;
	}
	public Feriado(int dia, int mes, int ano, String descricao) {
		super(dia, mes, ano);
		this.descricao = descricao;
	}
	
	public void exibirData() {
		System.out.println(super.dia + "/" + super.mes + "/" + super.ano + 
				" - " + this.descricao);
	}
	
	
}
