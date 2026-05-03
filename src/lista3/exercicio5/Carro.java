package lista3.exercicio5;

public class Carro {
	private String modelo;
	private int velocidade;
	private int marcha;
	
	public Carro(String modelo) {
		this.modelo = modelo;
		this.velocidade = 0;
		this.marcha = 0;
	}
	public void acelerar() {
		this.velocidade += 10;
		if(this.velocidade>130) {
			this.velocidade = 130;
		}
		trocarMarcha();
	}
	public void frear() {
		this.velocidade -= 10;
		if(this.velocidade<0) {
			this.velocidade = 0;
		}
		trocarMarcha();
	}
	private void trocarMarcha() {
		if(this.velocidade == 0) {
			this.marcha = 0;
		}
		else if(this.velocidade > 0 && this.velocidade < 20) {
			this.marcha = 1;
		}
		else if(this.velocidade >= 20 && this.velocidade < 40) {
			this.marcha = 2;
		}
		else if(this.velocidade >= 40 && this.velocidade < 60) {
			this.marcha = 3;
		}
		else if(this.velocidade >= 60 && this.velocidade < 90) {
			this.marcha = 4;
		}
		else {
			this.marcha = 5;
		}
	}
	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", velocidade=" + velocidade + ", marcha=" + marcha + "]";
	}
	
}
