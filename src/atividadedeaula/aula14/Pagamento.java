package atividadedeaula.aula14;

public class Pagamento {
	private final double DESCONTO;
	
	public Pagamento() {

		DESCONTO = 0.10;
	}

	public void pagar(double valor) {
		System.out.println("O valor da Compra foi de: " + valor + " e foi pago em Dinheiro.");
	}
	
	public void pagar(double valor, long numeroCartao) {
		String numeroEmTexto = String.valueOf(numeroCartao);
		if (numeroEmTexto.length() >= 4) {
		    String ultimosQuatro = numeroEmTexto.substring(numeroEmTexto.length() - 4);
		    System.out.println("O valor da compra foi de: R$" + valor + ", no cartão de crédito com final " + ultimosQuatro);
		} else {
		    System.out.println("O valor da compra foi de: R$" + valor + ", no cartão de crédito com final " + numeroEmTexto);
		}
	}
	
	public void pagar(double valor, String numeroCartao, int parcelas) {
		String numeroEmTexto = String.valueOf(numeroCartao);
		if (numeroEmTexto.length() >= 4) {
		    String ultimosQuatro = numeroEmTexto.substring(numeroEmTexto.length() - 4);
		    System.out.println("O valor da compra foi de: R$" + valor + ", com parcelas no valor de: R$" + valor/parcelas + " no cartão de crédito com final " + ultimosQuatro);
		} else {
		    System.out.println("O valor da compra foi de: R$" + valor + ", com parcelas no valor de: R$" + valor/parcelas + " no cartão de crédito com final " + numeroEmTexto);
		}
	}
	
	public void pagar(double valor, String chavePix) {
		if (chavePix.length() >= 4) {
		    String ultimosTres = chavePix.substring(chavePix.length() - 3);
		    System.out.println("O valor da compra foi de: R$" + valor + " na chave PIX com os ultimos 3 digitos " + ultimosTres);
		} else {
		    System.out.println("O valor da compra foi de: R$" + valor + " na chave PIX com os ultimos 3 digitos " + chavePix);
		}
	}
	
	public void pagar(double valor, boolean clienteVip) {
		if(clienteVip) {
			System.out.println("O valor da compra foi de: R$" + (valor-(valor*this.DESCONTO)) + " com o desconto VIP!");
		}else {
			System.out.println("O valor da compra foi de: R$" + valor);	
		}
	}
}
