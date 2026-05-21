package lista6.exercicio6;

public class FuncionarioTeste {
	public static void main(String[] args) {
		Desenvolvedor dev = new Desenvolvedor("Rafael Costa", 1001, 5500.00, 4);
		
		Gerente gerente = new Gerente("Mariana Oliveira", 2002, 9500.00, 865900.65);
		
		Administrativo admin = new Administrativo("Carlos Santos", 3003, 3200.00, 450.00);

		dev.exibirDados();
		gerente.exibirDados();
		admin.exibirDados();
	}
}
