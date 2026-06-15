package lista7.exercicio1;

public class Quadrado extends FormasGeometricas {
	private double lado;

	public Quadrado(String cor, double lado) {
		super(cor);
		this.lado = lado;
	}
	
	public void exibirDados() {
		System.out.println("QUADRADO");
		System.out.println("LADO: " + lado);
		super.exibirDados();
	}
	
	@Override
	protected double calcularArea() {
		return (lado*lado);
	}

	@Override
	protected double calcularPerimetro() {
		return (lado*4);
	}
	
}
