package lista6.exercicio2;

public class TesteColaborador {
	public static void main(String[] args) {
Empregado empregado = new Empregado("Ana Costa", "Rua das Flores, 123", "15/03/2021", "Analista de Sistemas", 6500.00, 87654321);
		
		Estagiario estagiario = new Estagiario("Marcos Lima", "Av. Paulista, 1000", "10/02/2023", "Suporte N1", 1200.00, 12345);
		
		Empresa empresa = new Empresa("Tech Solutions LTDA", "Rua da Tecnologia, 404", "01/06/2015", 150.00, "Consultoria de Software", 12345678000195L);
		
		Autonomo autonomo = new Autonomo("Juliana Alves", "Praça Central, 8", "20/08/2022", 85.50, "Designer Gráfico", 11122233344L);

		empregado.exibirDados();
		estagiario.exibirDados();
		empresa.exibirDados();
		autonomo.exibirDados();
	}
}
