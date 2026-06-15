package atividadedeaula.aula16;

public class Circulo extends FormasGeometricas{
	private final double PI;
	private double raio;

	public Circulo(String cor, double raio) {
		super(cor);
		this.PI = 3.14;
		this.raio = raio;
	}
	public void exibirDados() {
		System.out.println("CIRCULO");
		System.out.println("RAIO: " + raio);
		super.exibirDados();
	}

	@Override
	protected double calcularArea() {
		return (PI*Math.pow(raio,2));
	}

	@Override
	protected double calcularPerimetro() {
		return ((2*PI)*raio);
	}
	
	
}
