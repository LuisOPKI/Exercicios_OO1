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
			System.out.printf("Valor restante: R$ %.2f\n",this.saldo);
		}
		else {
			System.out.println("Valor indispónivel");
		}
	}
	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		}
		else {
			System.out.println("Não é possivel realizar o depósito!");
		}
	}
	public void verificarSaldo() {
		System.out.println("=======================================");
		System.out.println("Conta numero: " + this.numero);
		System.out.println("Titular da conta: " + cliente.getNome());
		System.out.println("CPF do titular: " + cliente.getCpf());
		System.out.printf("Saldo da conta: R$ %.2f\n", this.saldo);
		System.out.println("=======================================");
	}
}
