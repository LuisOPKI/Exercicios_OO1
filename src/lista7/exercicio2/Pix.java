package lista7.exercicio2;

public class Pix extends SistemaPagamento{
	private String chavePix;
	private String nomeDestinatario;
	
	public Pix(double valorCompra, String chavePix, String nomeDestinatario) {
		super(valorCompra);
		this.chavePix = chavePix;
		this.nomeDestinatario = nomeDestinatario;
	}
	@Override
	protected void pagar() {
		System.out.println("Pix realizado no valor de " + this.valorCompra + " para a chave PIX " + this.chavePix + " de " + this.nomeDestinatario);
	}
}
