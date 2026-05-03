package lista3.exercicio1;

public class FuncionarioTeste {
	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario(123456,
												   "Jacinto Thomas",
												   "11/09/2001",
												   "Masculino",
												   "Pedreiro",
												   "42 99116-6641",
												   "Thomas Muller",
												   123,
												   "Jardim Recanto",
												   "Tupi",
												   "RR");
		
		Funcionario funcionario2 = new Funcionario(742091,
													"Beatriz Helena Santos",
													"12/07/1998",
													"Feminino",
													"Analista de Sistemas",
													"47 99223-4455",
													"Avenida das Hortênsias",
													1024,
													"Vila Nova",
													"Joinville",
													"SC");
		System.out.println(funcionario1);
		System.out.println(funcionario2);
		funcionario1.setSetor("Alfaiate");
		System.out.println(funcionario1.getSetor());
		System.out.println("=========================");
		funcionario2.setTelefone("42 99455-6463");
		System.out.println(funcionario2.getTelefone());
		System.out.println("=========================");
		
		System.out.println(funcionario1);
		System.out.println(funcionario2);
	}
}
