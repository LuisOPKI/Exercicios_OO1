package lista5.exercicio5;

public class Vaga {
	int id;
	boolean disponibilidade;
	private Veiculo veiculos;
	
	public Vaga(int id) {
		this.id = id;
		this.disponibilidade = true;
		this.veiculos = null;
	}
	
	public void estacionarVeiculo(Veiculo veiculo) {
		this.disponibilidade = false;
		this.veiculos = veiculo;
		System.out.println("===================================================================================");
		System.out.println("O " + veiculo.getModelo() + ", de placa " + veiculo.getPlaca() + " foi estacionado na vaga " + this.id);
		System.out.println("===================================================================================");
	}

	public void retirarVeiculo(int horaSaida) {
			this.disponibilidade = true;
			this.veiculos = null;
	}
	
	public boolean isDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	public int getId() {
		return id;
	}

	public Veiculo getVeiculos() {
		return veiculos;
	}

}

