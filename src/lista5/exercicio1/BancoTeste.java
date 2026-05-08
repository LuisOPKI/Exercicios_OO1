package lista5.exercicio1;

public class BancoTeste {
	public static void main(String[] args) {
		Banco banco1 = new Banco();
		
		banco1.criarConta(9999, "182.743.894-65", "Osman Bakakbur");
		banco1.criarConta(7823, "623.746.563-34", "Kvira Kvaraktahelia");
		banco1.criarConta(9402, "984.274.757-12", "Ditador Mbappé");
		banco1.criarConta(9999, "182.743.894-65", "Osman Bakakbur");
		
		banco1.verificarSaldo(9999);
		banco1.verificarSaldo(7823);
		banco1.verificarSaldo(9402);
		
		banco1.depositar(9999, 6343.70);
		banco1.verificarSaldo(9999);
		
		banco1.depositar(7823, 1293.12);
		banco1.verificarSaldo(7823);
		
		banco1.depositar(9402, 2200.12);
		banco1.verificarSaldo(9402);
		
		banco1.depositar(9999, -101.67);
		
		banco1.sacar(9999, 1324.12);
		banco1.verificarSaldo(9999);
		
		banco1.sacar(7823, 1111.00);
		banco1.verificarSaldo(7823);
		
		banco1.sacar(9402, 435.09);
		banco1.verificarSaldo(9402);
	}
}
