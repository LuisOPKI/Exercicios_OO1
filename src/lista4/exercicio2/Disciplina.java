package lista4.exercicio2;

public class Disciplina {
	private Integer codigo;
	private String nome;
	private String modalidade;
	private Integer cargaHoraria;
	private Professor professor;
	
	public Disciplina(Integer codigo, String nome, String modalidade, Integer cargaHoraria, Professor professor) {
		this.codigo = codigo;
		this.nome = nome;
		this.modalidade = modalidade;
		this.cargaHoraria = cargaHoraria;
		this.professor = professor;
	}
	
	public void exibirRelatorio() {
		System.out.println("======= RELATÓRIO DA DISCIPLINA =======");
        System.out.println("Código: " + codigo);
        System.out.println("Disciplina: " + nome);
        System.out.println("Modalidade: " + modalidade);
        System.out.println("Carga Horária: " + cargaHoraria + "h");
        
        System.out.println("\n--- Dados do Professor ---");
        System.out.println("Registro: " + professor.getRegistro());
        System.out.println("Nome: " + professor.getNome());
        System.out.println("Data de Nasc.: " + professor.getDataNascimento());
        System.out.println("Salário: R$ " + professor.getSalario());
        System.out.println("=======================================\n");
	}
}
