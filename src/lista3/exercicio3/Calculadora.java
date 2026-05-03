package lista3.exercicio3;

public class Calculadora {
	private String marca;
	private String modelo;
	private String tipo;
	private int memoriaInterna; // megabytes
	
	public Calculadora(String marca, String modelo, String tipo, int memoriaInterna) {
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		this.memoriaInterna = memoriaInterna;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public int getMemoriaInterna() {
		return memoriaInterna;
	}
	public void soma(double num1, double num2) {
		double result = num1 + num2;
		System.out.println(result);
	}
	public void sub(double num1, double num2) {
		double result = num1 - num2;
		System.out.println(result);
	}		
	public void mult(double num1, double num2) {
		double result = num1 * num2;
		System.out.println(result);
	}
	public void div(double num1, double num2) {
		if(num2 != 0) {
		double result = num1 / num2;
		System.out.println(result);
		}
		else
			System.out.println("Valor inválido");
	}

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", modelo=" + modelo + ", tipo=" + tipo + ", memoriaInterna="
				+ memoriaInterna + "]";
	}
	
}
