package lista7.exercicio1;

public abstract class FormasGeometricas {
	protected String cor;
	
	public FormasGeometricas(String cor) {
		super();
		this.cor = cor;
	}
	
	protected abstract double calcularArea();
	protected abstract double calcularPerimetro();
	
	public void exibirDados() {
		System.out.println("COR: " + cor);
		System.out.println("AREA: " + this.calcularArea());
		System.out.println("PERIMETRO: " + this.calcularPerimetro());
	}
}
