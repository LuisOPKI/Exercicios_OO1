package lista3.exercicio4;

public class ContaTeste {
	public static void main(String[] args) {
		Conta conta1 = new Conta(1234, 5678, 0);
		
		conta1.depositar(1000);
		conta1.sacar(589.89);
		conta1.verificarSaldo();
	}
}
