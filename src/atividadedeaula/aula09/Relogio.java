package atividadedeaula.aula09;

public class Relogio {
	private String marca;
	private int hora;
	private int minutos;
	
	public Relogio (String marca, int hora, int minutos) {
		this.marca = marca;
		this.hora = hora;
		this.minutos = minutos;
	}
	public String getMarca() {
		return marca;
	}
	public int getHora() {
		return hora;
	}
	public int getMinutos() {
		return minutos;
	}
	public void setHora(int hora){
		if(hora >= 0 && hora <= 23) {
		this.hora = hora;
		}
		else {
			System.out.println("Valor indisponivel");
		}
	}
	public void setMinutos(int minutos){
		if(minutos >= 0 && minutos <= 59) {
			this.minutos = minutos;
			}
			else {
				System.out.println("Valor indisponivel");
			}
	}
}
