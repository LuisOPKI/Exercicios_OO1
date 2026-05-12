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
		this.veiculos = veiculo;
		this.disponibilidade = false;
		System.out.println("===================================================================================");
		System.out.println("O " + veiculo.getModelo() + ", de placa " + veiculo.getPlaca() + " foi estacionado!");
		System.out.println("===================================================================================");
	}

	public void retirarVeiculo(int horaSaida) {
		if(horaSaida - this.veiculos.getHoraIngresso() <= 3) {
			this.disponibilidade = true;
			this.veiculos = null;
			this.calcularCusto(horaSaida);
		}
		else {
			System.out.println("O tempo mínimo são de 3 horas, ainda faltam " + (horaSaida - this.veiculos.getHoraIngresso()) + " horas");
		}
	}
	
	public void calcularCusto(int horaSaida) {
		
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

