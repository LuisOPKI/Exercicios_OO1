package lista5.exercicio1;

import java.util.ArrayList;
import java.util.List;

	public class Banco{
		private List<Conta> contas;
	
	public Banco() {
		this.contas = new ArrayList<Conta>();
	}
	
	public void criarConta(int numero, String cpf, String nome) {
		if(this.verificarConta(numero)) {
			System.out.println("Já há uma conta com esse número!");
		}
		else {
			this.contas.add(new Conta(numero, new Cliente(cpf, nome)));
			System.out.println("A conta foi criada com sucesso para " + nome + "!");
		}
	}
	
	private boolean verificarConta(int numero) {
		for(Conta conta : contas) {
			if(numero == conta.getNumero())
				return true;
		}
		return false;
	}
	
	public void sacar(int numero, double valor) {
		
		for(Conta conta : contas) {
			if(numero == conta.getNumero()) {
				conta.sacar(valor);
				return;
			}
		}
		System.out.println("A conta não foi localizada!");
	}
	
	public void depositar(int numero, double valor) {
		
		for(Conta conta : contas) {
			if(numero == conta.getNumero()) {
				conta.depositar(valor);
				return;
			}
		}
		System.out.println("A conta não foi localizada!");
	}
	
	public void verificarSaldo(int numero) {
		
		for(Conta conta : contas) {
			if(numero == conta.getNumero()) {
				conta.verificarSaldo();
				return;
			}
		}
		System.out.println("A conta não foi localizada!");
	}
}
