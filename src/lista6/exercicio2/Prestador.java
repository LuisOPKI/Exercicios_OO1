package lista6.exercicio2;

public class Prestador extends Colaborador{
	protected double valorHora;
	protected String tipoServico;
	
	public Prestador(String nome, String endereco, String dataInicio, double valorHora, String tipoServico) {
		super(nome, endereco, dataInicio);
		this.valorHora = valorHora;
		this.tipoServico = tipoServico;
	}
	public void exibirDados() {

		super.exibirDados();
		
		System.out.println("Valor Hora: R$" + this.valorHora);
		System.out.println("Tipo Serviço: " + this.tipoServico);
	}
	
}
