package atividadedeaula.aula15;

public class Losango {
	private double diagonalMenor;
	private double diagonalMaior;
	
	public Losango(double diagonalMenor, double diagonalMaior) {
		super();
		this.diagonalMenor = diagonalMenor;
		this.diagonalMaior = diagonalMaior;
	}
	
	public void calcularArea(){
		System.out.println("A área do losango é " + (this.diagonalMaior*this.diagonalMenor)/2);
	}
}
