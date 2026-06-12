package atividadedeaula.aula15;

public class Retangulo extends Quadrilatero{
	private double base;
	private double altura;
	
	public Retangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	public void calcularArea() {
		System.out.println("A área do Retângulo é " + this.base*this.altura);
	}
}
