package lista5.exercicio1;

public class Conta {
	private int numero;
	private double saldo;
	private Cliente cliente;
	
	public Conta(int numero, Cliente cliente) {
		this.numero = numero;
		this.saldo = 0.00;
		this.cliente = cliente;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void sacar(double valor) {
		if(this.saldo >= valor && valor > 0) {
			this.saldo -= valor;
			System.out.println("Saque realizado!");
			System.out.println("Valor restante: " + saldo);
		}
		else {
			System.out.println("Valor indispónivel");
		}
	}
}
