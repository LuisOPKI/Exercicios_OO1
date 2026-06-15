package lista7.exercicio1;

public class Retangulo extends FormasGeometricas{
	private double base;
	private double altura;
	
	public Retangulo(String cor, double base, double altura) {
		super(cor);
		this.base = base;
		this.altura = altura;
	}
	
	public void exibirDados() {
		System.out.println("RETANGULO");
		System.out.println("BASE: " + base);
		System.out.println("ALTURA: " + altura);
		super.exibirDados();
	}

	@Override
	protected double calcularArea() {
		return (base*altura);
	}

	@Override
	protected double calcularPerimetro() {
		return 2*(base + altura);
	}
	
}

