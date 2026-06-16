package lista7.exercicio4;

import java.util.ArrayList;
import java.util.List;

public class TecnicoAdministrativo extends FuncionarioUtfpr{
	private double adicionalNoturno;
	private List<Processo> processos;
	
	public TecnicoAdministrativo(int registro, String nome, String dataAdmissao, double salarioBase,
			double adicionalNoturno) {
		super(registro, nome, dataAdmissao, salarioBase);
		this.adicionalNoturno = adicionalNoturno;
		this.processos = new ArrayList<Processo>();
	}
	
	public void adicionarProcesso(int num, String dataDeCriacao, String descricao) {
		for(Processo processo : processos) {
			if(num == processo.getNum()) {
				System.out.println("O número do processo já está sendo utilizado, não foi possivel adicionar");
				return;
			}
		}
		this.processos.add(new Processo(num, dataDeCriacao, descricao));
		System.out.println("O processo " + num + " foi adicionado!");
	}
	
	public void removerProcesso(int num) {
		for(Processo processo : processos) {
			if(num == processo.getNum()) {
				System.out.println("O processo " + num + " foi removido!");
				this.processos.remove(processo);
				return;
			}
		}
		System.out.println("O processo não foi encontrado");
	}
	
	public void exibirDados() {
		super.exibirDados();
		System.out.println("VALOR DO ADICIONAL NOTURNO: " + this.adicionalNoturno);
		System.out.println("PROCESSOS");
		for(Processo processo : processos) {
			processo.exibirDados();
		}
	}
	
	@Override
	protected double calcularSalario() {
		return this.salarioBase + this.adicionalNoturno;
	}
}
