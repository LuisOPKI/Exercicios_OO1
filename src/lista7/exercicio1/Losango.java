package lista7.exercicio1;

public class Losango extends FormasGeometricas{
	private double diagonalMaior;
	private double diagonalMenor;

	public Losango(String cor, double diagonalMaior, double diagonalMenor) {
		super(cor);
		this.diagonalMaior = diagonalMaior;
		this.diagonalMenor = diagonalMenor;
	}

	public void exibirDados() {
		System.out.println("LOSANGO");
		System.out.println("DIAGONAL MAIOR: " + diagonalMaior);
		System.out.println("DIAGONAL MENOR: " + diagonalMenor);
		super.exibirDados();
	}

	@Override
	protected double calcularArea() {
		return (diagonalMaior+diagonalMenor)/2;
	}

	@Override
	protected double calcularPerimetro() {
		return 2 * Math.sqrt((Math.pow(diagonalMaior, 2)+ Math.pow(diagonalMenor, 2)));
	}
}
