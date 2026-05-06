package lista5.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private List<Conta> conta;

	public Banco(List<Conta> conta) {
		this.conta = new ArrayList<Conta>();
	}
	public void criarConta(int numero, String nome, String cpf) {
		Conta conta = new Conta(numero, new Cliente(nome, cpf));
		this.conta.add(conta);
		
	
	
	}
//	private boolean verificarNumero(int numero) {
//		for(Conta conta : this.conta) {
			
//			return true;
//		}
//	}
}

