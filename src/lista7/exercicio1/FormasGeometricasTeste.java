package lista7.exercicio1;

import java.util.Scanner;

public class FormasGeometricasTeste {
	public static void main(String[] args) {
		
		FormasGeometricas formaGeometrica = null;
		Scanner teclado = new Scanner(System.in);
		
		int opcao = teclado.nextInt();
		
		switch(opcao) {
		case 1:
			formaGeometrica = new Quadrado("Vermelho", 4.00);
			break;
		case 2:
			formaGeometrica = new Circulo("Amarelo", 100.00);
			break;
		case 3:
			formaGeometrica = new Retangulo("Azul", 10.00, 5.00);
			break;
		case 4: 
			formaGeometrica = new Trapezio("Roxo", 10.0, 6.0, 5.0, 5.0, 4.0);
			break;
		case 5:
			formaGeometrica = new Losango("Vermelho", 8.0, 6.0);
			break;
		}
		
		formaGeometrica.exibirDados();
		teclado.close();
	}
}