package lista2.exercicio2;

public class Carro {
	
	String modelo;
	String marca;
	String cor;
	int ano;
	int renavam;
	String chassi;
	String placa;
	boolean partidaCarro = false;
	int velocidadeCarro = 0;
	
	public void ligar() {
		if (partidaCarro == false && velocidadeCarro == 0) {
			System.out.println("O " + modelo + " está ligando!");
			partidaCarro = true;
		}
		else {
			System.out.println("O " + " já está ligado");
		}
	}
	public void desligar() {
		if (partidaCarro == true && velocidadeCarro == 0) {
		System.out.println("O " + modelo + " está desligando!");
		partidaCarro = false;
		}
		else if(partidaCarro == true && velocidadeCarro > 0){
			System.out.println("O " + modelo + " ainda está em movimento!");
		}
		else {
			System.out.println("O " + modelo + " já está parado");
		}
	}
	public void frear(int x) {
		if(x <= velocidadeCarro && partidaCarro == true) {
		velocidadeCarro = velocidadeCarro - x;
		System.out.println("O " + modelo + " está freando, sua velocidade é agora de " + velocidadeCarro + "KM/h");
		}
		else if(partidaCarro == false){
			System.out.println("O " + modelo + " está parado!");
		}
		else {
			System.out.println("Velocidade de frenagem imcompátivel!");
		}
	}
	public void acelerar(int y) {
		if (partidaCarro == true && velocidadeCarro + y <= 220){
			velocidadeCarro = velocidadeCarro + y;
			System.out.println("O " + modelo + " está acelerando, sua velocidade é agora de " + velocidadeCarro + "KM/h");
		}
		else if(partidaCarro == false){
			System.out.println("O " + modelo + " está desligado!");
		}
		else {
			System.out.println("Velocidade imcompátivel com o " + modelo +"!");
		}

	}

}
