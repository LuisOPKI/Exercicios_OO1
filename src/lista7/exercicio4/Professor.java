package lista7.exercicio4;

import java.util.List;
import java.util.ArrayList;

public class Professor extends FuncionarioUtfpr{
	private String titulacao;
	private List<Disciplina> disciplinas;
	
	public Professor(int registro, String nome, String dataAdmissao, double salarioBase, String titulacao) {
		super(registro, nome, dataAdmissao, salarioBase);
		this.titulacao = titulacao;
		this.disciplinas = new ArrayList<Disciplina>();
	}
	
	public void adicionarDisciplina(int codigo, String nome, String ementa, int cargaHoraria) {
		for(Disciplina disciplina : disciplinas) {
			if(disciplina.getCodigo() == codigo) {
				System.out.println("O código já é vinculado a uma disciplina, não foi possível adicionar!");
				return;
			}
		}
		this.disciplinas.add(new Disciplina(codigo, nome, ementa, cargaHoraria));
		System.out.println("Disciplina " + nome + " foi adicionada com sucesso!");
	}
	
	public void removerDisciplina(int codigo) {
		for(Disciplina disciplina : disciplinas) {
			if(disciplina.getCodigo() == codigo) {
				System.out.println("A disciplina " + disciplina.getNome() + " foi removida do quadro de aulas!");
				this.disciplinas.remove(disciplina);
				return;
			}
		}
		System.out.println("A disciplina não foi encontrada pelo código informado!");
	}

	public void exibirDados() {
		super.exibirDados();
		System.out.println("TITULAÇÃO: " + this.titulacao);
		System.out.println("DISCIPLINAS ATRIBUIDAS: ");
		for(Disciplina disciplina : disciplinas) {
			disciplina.exibirDados();
		}
		System.out.println("SALARIO FINAL: " + this.calcularSalario());
	}
	
	@Override
	protected double calcularSalario() {
		int horas = this.calculoHoras();
		if(this.titulacao.equalsIgnoreCase("Mestre")) {
			return ((this.salarioBase + 1000) + (15.00 * horas));
		}
		else if (this.titulacao.equalsIgnoreCase("Doutor")) {
			return ((this.salarioBase + 2000) + (15.00 * horas));
		}
		return (this.salarioBase + (15.00 * horas));
	}
	
	private int calculoHoras() {
		int horas = 0;
		for(Disciplina disciplina : disciplinas) {
			if(disciplina == null) {
				return 0;
			}
			horas += disciplina.getCargaHoraria();
		}
		return horas;
	}
}
