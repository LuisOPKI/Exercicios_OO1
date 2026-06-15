package lista7.exercicio2;

import java.util.Scanner;

public class SistemaPagamentoTeste {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		SistemaPagamento sistemaPagamento = null;
		int opcao = scanner.nextInt();
		switch(opcao) {
		case 1:
			sistemaPagamento = new Pix(100.00, "182.843.332-23", "João do Graudo");
			break;
		case 2:
			sistemaPagamento = new CartaoDeCredito(100.00, 12344321, "Ana Suckinton", "11/2050", 331);
			break;
		case 3:
			sistemaPagamento = new Boleto(100.00, "12/12/2012", 554355468);
			break;
		}
		
		scanner.close();
		
		sistemaPagamento.pagar();
	}
}
