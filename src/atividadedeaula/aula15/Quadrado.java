package atividadedeaula.aula15;

public class Quadrado extends Quadrilatero{
	private double lado;

	public Quadrado(double lado) {
		super();
		this.lado = lado;
	}
	
	public void calcularArea(){
		System.out.println("A Área do é " + this.lado * this.lado);
	}
}
