package lista7.exercicio2;

public class Boleto extends SistemaPagamento{
	private String dataVencimento;
	private long codigoDeBarras;
	
	public Boleto(double valorCompra, String dataVencimento, long codigoDeBarras) {
		super(valorCompra);
		this.dataVencimento = dataVencimento;
		this.codigoDeBarras = codigoDeBarras;
	}

	@Override
	protected void pagar() {
		System.out.println("Pagamento realizado no valor de " + this.valorCompra + " no boleto de vencimento "
				+ this.dataVencimento + " de código de barras " + this.codigoDeBarras);
	}
}
