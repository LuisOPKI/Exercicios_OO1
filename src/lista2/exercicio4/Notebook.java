package lista2.exercicio4;

public class Notebook {
	
	String marca;
	String modelo;
	double polegadas;
	String modeloCPU;
	int memoriaRam;
	int armazenamento;
	
	public void ligar() {
		System.out.println("O " + marca + " " + modelo + " está ligando!");
	}
	
	public void desligar () {
		System.out.println("O " + marca + " " + modelo + " está desligando!");
	}
	
	public void processarInformacoes () {
		System.out.println("O " + marca + " " + modelo + " está processando informações!");
	}
	
	public void conectarInternet () {
		System.out.println("O " + marca + " " + modelo + " está conectando a Internet!");
	}

}
