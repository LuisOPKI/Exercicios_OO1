package atividadedeaula.aula15;

public class QuadrilateroTeste {
	public static void main(String[] args) {
		Quadrado quadrado = new Quadrado(5.5);
		
		Retangulo retangulo = new Retangulo(10.0, 4.0);
		
		Losango losango = new Losango(8.0, 12.0);

		quadrado.calcularArea();
		retangulo.calcularArea();
		losango.calcularArea();
	}
}
