package lista5.exercicio5;

public class Veiculo {
	private String placa;
	private String modelo;
	private String cor;
	private int horaIngresso;
	
	public Veiculo(String placa, String modelo, String cor, int horaIngresso) {
		this.placa = placa;
		this.modelo = modelo;
		this.cor = cor;
		this.horaIngresso = horaIngresso;
	}

	public String getPlaca() {
		return placa;
	}

	public String getModelo() {
		return modelo;
	}

	public String getCor() {
		return cor;
	}

	public int getHoraIngresso() {
		return horaIngresso;
	}
	
	
}
