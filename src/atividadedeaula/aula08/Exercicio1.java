package atividadedeaula.aula08;
import java.util.Scanner;
public class Exercicio1 {
	public static void main(String[] args) {
		
		int maiorValor = 0;
		double raiz = 0;
		double potenciacao = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor inteiro!");
		int NUM1 = scanner.nextInt();
		System.out.println("Digite o segundo valor inteiro!");
		int NUM2 = scanner.nextInt();
		
		maiorValor = Math.max(NUM1, NUM2);
		System.out.println("O maior valor é " + maiorValor);
		
		raiz = Math.sqrt(NUM1);
		System.out.println("A raiz quadrada do primeiro número é " + raiz);
		
		potenciacao = Math.pow(NUM1, NUM2);
		System.out.println("A potencia do valor 1 pelo 2 é " + potenciacao);
		
		scanner.close();
	}
}
