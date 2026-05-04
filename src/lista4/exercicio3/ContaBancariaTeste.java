package lista4.exercicio3;

public class ContaBancariaTeste {
	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria(1010, 55443, 
				new Titular("111.222.333-44", "9.888.777-6", "Gabriel Souza", "22/02/1988", "Masculino", 4200.0, 
						new Endereco("Rua XV de Novembro", 1500, "Centro", "Curitiba", "PR")));

		ContaBancaria conta2 = new ContaBancaria(2020, 11229, 
				new Titular("555.666.777-88", "12.444.555-0", "Mariana Santos", "05/11/1992", "Feminino", 6800.0, 
						new Endereco("Avenida Paulista", 900, "Bela Vista", "São Paulo", "SP")));

		ContaBancaria conta3 = new ContaBancaria(3030, 99887, 
				new Titular("999.888.777-66", "7.111.222-3", "Roberto Dias", "30/01/1975", "Masculino", 3100.0, 
						new Endereco("Rua da Praia", 45, "Ipanema", "Rio de Janeiro", "RJ")));

		conta1.emitir();
		conta2.emitir();
		conta3.emitir();
		
		conta1.depositar(3000.00);
		conta1.emitir();
		conta1.sacar(67.69);
		conta1.emitir();
	}
}
