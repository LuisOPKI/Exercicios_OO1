package lista2.exercicio3;

public class Pessoa {
	
	String nome;
	String sexo;
	String cpf;
	int idade;
	double altura;
	double peso;
	
	public Pessoa(String nome, String sexo, String cpf, int idade, double altura, double peso ) {
		this.nome = nome;
		this.sexo = sexo;
		this.cpf = cpf;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
	}
	public void andar() {
		System.out.println(nome + " está andando!");
	}
	public void correr() {
		System.out.println(nome + " está correndo!");
	}
	public void falar() {
		System.out.println(nome + " está falando!");
	}
	public void dormir() {
		System.out.println(nome + " está dormindo!");
	}
}
