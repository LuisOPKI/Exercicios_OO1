package lista7.exercicio4;

public class FuncionarioUtfprTeste {
	public static void main(String[] args) {
		Professor prof1 = new Professor(1001, "Ana Beatriz", "10/02/2015", 5500.00, "Doutor");
		prof1.adicionarDisciplina(10, "Programação Orientada a Objetos", "Conceitos de herança, polimorfismo e abstração", 60);
		prof1.adicionarDisciplina(11, "Estrutura de Dados", "Pilhas, Filas, Listas e Árvores", 80);
		prof1.adicionarDisciplina(10, "POO 2", "Teste de duplicação", 40); 
		
		Professor prof2 = new Professor(1002, "Carlos Mendes", "15/08/2019", 4200.00, "Mestre");
		prof2.adicionarDisciplina(20, "Engenharia de Software", "Metodologias ágeis e UML", 60);
		prof2.adicionarDisciplina(21, "Banco de Dados", "Modelagem relacional e SQL", 60);
		prof2.removerDisciplina(20); 

		TecnicoAdministrativo tec1 = new TecnicoAdministrativo(2001, "Roberto Silva", "05/01/2021", 3200.00, 450.00);
		tec1.adicionarProcesso(5001, "10/10/2023", "Compra de novos computadores para o laboratório 3");
		tec1.adicionarProcesso(5002, "15/10/2023", "Manutenção do ar condicionado do bloco B");
		tec1.adicionarProcesso(5001, "16/10/2023", "Teste de duplicação"); 
		tec1.removerProcesso(5002); 

		System.out.println("=================================================");
		prof1.exibirDados();
		
		System.out.println("=================================================");
		prof2.exibirDados();
		
		System.out.println("=================================================");
		tec1.exibirDados();
		System.out.println("=================================================");

	}
}
