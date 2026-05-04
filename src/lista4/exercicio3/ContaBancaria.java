package lista4.exercicio3;

public class ContaBancaria {
	private int numAgencia;
	private int numConta;
	private Titular titular;
	private double saldo;
	
	public ContaBancaria(int numAgencia, int numConta, Titular titular) {
		this.numAgencia = numAgencia;
		this.numConta = numConta;
		this.titular = titular;
		this.saldo = 0.0;
	}
	
	public void sacar(double valor) {
		if(valor > this.saldo && valor > 0) {
			System.out.println("Valor insdisponível");
		}
		else {
			this.saldo -= valor; 
			System.out.println("Saque realizado");
		}
			
	}
	
	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			System.out.println("Deposito realizado");
		}
		else {
			System.out.println("Valor incompátivel");
		}
	}
	
	public void emitir() {
	    System.out.println("=======================================================");
	    System.out.println("Agencia: " + numAgencia);
	    System.out.println("Conta: " + numConta);
	    System.out.println("Saldo: " + saldo);
	    System.out.println("Nome do Titular: " + titular.getNome());
	    System.out.println("CPF: " + titular.getCpf());
	    System.out.println("RG: " + titular.getRg());
	    System.out.println("Data de Nascimento: " + titular.getDataNascimento());
	    System.out.println("Sexo: " + titular.getSexo());
	    System.out.println("Renda Mensal: " + titular.getRendaMensal());
	    System.out.println("Logradouro: " + titular.getEndereco().getLogradouro());
	    System.out.println("Numero: " + titular.getEndereco().getNumero());
	    System.out.println("Bairro: " + titular.getEndereco().getBairro());
	    System.out.println("Cidade: " + titular.getEndereco().getCidade());
	    System.out.println("UF: " + titular.getEndereco().getUf());
	    System.out.println("=======================================================");
	}
	}
