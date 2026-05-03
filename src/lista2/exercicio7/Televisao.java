package lista2.exercicio7;

public class Televisao {
	String marca;
	double polegadas;
	String resolucao;
	int canal;
	int volume;
	String estadoTelevisao;
	
	public void ligar() {
		if (estadoTelevisao != "ligado") {
			estadoTelevisao = "ligado";
			System.out.println("A televisao está " + estadoTelevisao);
			
		}
		else {
			System.out.println("A televisao está " + estadoTelevisao);
		}
	}
	public void desligar() {
		if (estadoTelevisao == "ligado") {
			estadoTelevisao = "desligado";
			System.out.println("A televisao está " + estadoTelevisao);
			
		}
		else {
			System.out.println("A televisao está " + estadoTelevisao);
		}
	} 
	public void alterarCanalUp() {
		if(estadoTelevisao == "ligado") {
			if(canal < 99) {
			canal++;
			}
			else{
				canal = 1;
			}
		}
		System.out.println("O canal é " + canal);
	}
	public void alterarCanalDown() {
		if(estadoTelevisao == "ligado") {
			if(canal > 1) {
			canal--;
			}
			else{
				canal = 99;
			}
		}
		System.out.println("O canal é " + canal);
	}
	public void aumentarVolume() {
		if(estadoTelevisao == "ligado") {
			if(volume < 30) {
			volume = volume + 1;
			}
			else{
				volume = 30;
			}
		}
		System.out.println("O volume é " + volume);
	}
	public void abaixarVolume() {
		if(estadoTelevisao == "ligado") {
			if(volume > 0) {
			volume = volume - 1;
			}
			else{
				volume = 0;
			}
		}
		System.out.println("O volume é " + volume);
	}
	@Override
	public String toString() {
		return "Marca = " + marca + "\nPolegadas = " + polegadas + 
				"\n Resolucao = " + resolucao + "\n Canal = "
				+ canal + "\n Volume = " + volume +
				"\n estadoTelevisao = " + estadoTelevisao + "\n";
	}
	
}
