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

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
