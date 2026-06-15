package lista7.exercicio2;

public class CartaoDeCredito extends SistemaPagamento{
	private int numCartao;
	private String nomeTitular;
	private String dataValidade;
	private int codSeguranca;
	
	public CartaoDeCredito(double valorCompra, int numCartao, String nomeTitular, String dataValidade,
			int codSeguranca) {
		super(valorCompra);
		this.numCartao = numCartao;
		this.nomeTitular = nomeTitular;
		this.dataValidade = dataValidade;
		this.codSeguranca = codSeguranca;
	}

	@Override
	protected void pagar() {
		System.out.println("Pagamento realizado no valor de " + this.valorCompra + " no cartão de crédito "
							+ this.numCartao + " de " + this.nomeTitular + " no vencimento " + this.dataValidade + " de CVV " + this.codSeguranca);
		
	}

}
