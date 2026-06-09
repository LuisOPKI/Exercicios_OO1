package atividadedeaula.aula14;

public class PagamentoTeste {
	public static void main(String[] args) {
		Pagamento caixa = new Pagamento(); 
		
		caixa.pagar(250.75);
		
		caixa.pagar(1899.99, 4111222233334444L);
		
		caixa.pagar(3500.00, "5522334455667788", 10);
		
		caixa.pagar(125.50, "123.456.789-00");
		
		caixa.pagar(800.00, true);
		
		caixa.pagar(800.00, false);
	}
}
