package lista7.exercicio2;

public abstract class SistemaPagamento {
	protected double valorCompra;

	public SistemaPagamento(double valorCompra) {
		this.valorCompra = valorCompra;
	}
	protected abstract void pagar();
}
