package lista7.exercicio1;

public class Trapezio extends FormasGeometricas{
	private double baseMaior;
	private double baseMenor;
	private double ladoA;
	private double ladoB;
	private double altura;
	
	public Trapezio(String cor, double baseMaior, double baseMenor, double ladoA, double ladoB, double altura) {
		super(cor);
		this.baseMaior = baseMaior;
		this.baseMenor = baseMenor;
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.altura = altura;
	}

	public void exibirDados() {
		System.out.println("TRAPEZIO");
		System.out.println("BASE MAIOR: " + baseMaior);
		System.out.println("BASE MENOR: " + baseMenor);
		System.out.println("ALTURA: " + altura);
		super.exibirDados();
	}

	@Override
	protected double calcularArea() {
		return ((baseMaior+baseMenor)*altura)/2;
	}

	@Override
	protected double calcularPerimetro() {
		return baseMaior + baseMenor + ladoA + ladoB;
	}
}
