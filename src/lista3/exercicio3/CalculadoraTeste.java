package lista3.exercicio3;

public class CalculadoraTeste {
	public static void main(String[] args) {
		Calculadora calculadora1 = new Calculadora("Cassio", "Abre e fecha", "Cientifica", 8); 
			
		calculadora1.soma(2, 2);
		calculadora1.sub(3, 1);
		calculadora1.mult(4, 2);
		calculadora1.div(6, 2);
		calculadora1.div(2, 0);
		
		System.out.println(calculadora1);
	}
}
