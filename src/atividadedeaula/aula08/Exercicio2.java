package atividadedeaula.aula08;
import java.util.Scanner;
public class Exercicio2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Digite um valor em graus!");
		
		double graus = scanner.nextDouble();
		
		double radianos = Math.toRadians(graus);
		
		double seno = Math.sin(radianos);
		System.out.println("O seno é " + seno);
		
		double cosseno = Math.cos(radianos);
		System.out.println("O cosseno é " + cosseno);
		
		double tangente = Math.tan(radianos);
		System.out.println("O tangente é " + tangente);
		
		scanner.close();
	}
}
