package lista2.exercicio3;

public class PessoaTeste {
	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("Rodrigo Garro", "Masculino", "111.222.333-44", 28, 1.74, 72.5);
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.sexo);
		System.out.println(pessoa1.cpf);
		System.out.println(pessoa1.idade);
		System.out.println(pessoa1.altura);
		System.out.println(pessoa1.peso);
		
		Pessoa pessoa2 = new Pessoa("Memphis Depay", "Masculino", "555.666.777-88", 32, 1.76, 78.0);
		System.out.println(pessoa2.nome);
		System.out.println(pessoa2.sexo);
		System.out.println(pessoa2.cpf);
		System.out.println(pessoa2.idade);
		System.out.println(pessoa2.altura);
		System.out.println(pessoa2.peso);
		
		Pessoa pessoa3 = new Pessoa("Yuri Alberto", "Masculino", "999.000.111-22", 25, 1.82, 78.0);
		
		System.out.println(pessoa3.nome);
		System.out.println(pessoa3.sexo);
		System.out.println(pessoa3.cpf);
		System.out.println(pessoa3.idade);
		System.out.println(pessoa3.altura);
		System.out.println(pessoa3.peso);
		
		pessoa1.andar();
		pessoa2.correr();
		pessoa3.dormir();
		pessoa1.falar();
		
	}
}
