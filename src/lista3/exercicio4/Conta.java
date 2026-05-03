package lista3.exercicio4;

public class Conta {
	private int numAgencia;
	private int numConta;
	private double saldo;
	
	public Conta(int numAgencia, int numConta, double saldo) {
		this.numAgencia = numAgencia;
		this.numConta = numConta;
		this.saldo = saldo;
	}
	public void sacar(double valor) {
		if(valor > this.saldo) {
			System.out.println("Valor indisponivel!");
		}
		else {
			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso.");
		}
	}
	public void depositar(double valor) {
		this.saldo += valor;
		System.out.println("Depósito realizado com sucesso.");
	}
	public void verificarSaldo() {
		System.out.println("========================");
		System.out.println("Número da Agência: " + this.numAgencia);
		System.out.println("Número da Conta: " + this.numConta);
		System.out.println("Saldo: R$" + String.format("%.2f", this.saldo));
		System.out.println("========================");
	}
}
