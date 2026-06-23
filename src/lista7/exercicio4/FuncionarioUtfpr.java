	package lista7.exercicio4;
	
	import java.util.ArrayList;
	import java.util.List;
	
	public abstract class FuncionarioUtfpr {
		protected int registro;
		protected String nome;
		protected String dataAdmissao;
		protected double salarioBase;
		
		public FuncionarioUtfpr(int registro, String nome, String dataAdmissao, double salarioBase) {
			this.registro = registro;
			this.nome = nome;
			this.dataAdmissao = dataAdmissao;
			this.salarioBase = salarioBase;
		}
	
		protected abstract double calcularSalario();
		
		public void exibirDados() {
			System.out.println("REGISTRO: " + this.registro);
			System.out.println("NOME: " + this.nome);
			System.out.println("DATA DE ADMISSÃO: " + this.dataAdmissao);
			System.out.println("SALÁRIO BASE: " + this.salarioBase);
		}
	}
