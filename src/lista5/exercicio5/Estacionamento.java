package lista5.exercicio5;

import java.util.List;
import java.util.ArrayList;

public class Estacionamento {
	private List<Vaga> vagas;
	private final int TEMPO_MINIMO;
	private final double TAXA_MINIMA;
	private final double TAXA_ADICIONAL;
	
	public Estacionamento(){
		this.vagas = new ArrayList<Vaga>();
		this.inicializarVaga();
		this.TEMPO_MINIMO = 3;
		this.TAXA_MINIMA = 2.00;
		this.TAXA_ADICIONAL = 0.50;
	}
	public void inicializarVaga() {
		this.vagas.add(new Vaga(1));
		this.vagas.add(new Vaga(2));
		this.vagas.add(new Vaga(3));
		this.vagas.add(new Vaga(4));
		this.vagas.add(new Vaga(5));
	}
	
	public void estacionarVeiculo(String placa, String modelo, String cor, int horaIngresso) {
		for(Vaga vaga : vagas) {
			if(vaga.isDisponibilidade() == true) {
				vaga.estacionarVeiculo(new Veiculo(placa, modelo, cor, horaIngresso));
				return;
			}
		}
		System.out.println("Não há vagas disponíveis no momento!");
	}
	
	public void retirarVeiculo(String placa, int horaSaida) {
		for(Vaga vaga : vagas) {
			if(vaga.isDisponibilidade() == false) {
				if(vaga.getVeiculos().getPlaca().equals(placa)) {
					if(horaSaida - vaga.getVeiculos().getHoraIngresso() < TEMPO_MINIMO){
						System.out.println("O tempo mínimo são de 3 horas, ainda faltam " + (TEMPO_MINIMO - (horaSaida - vaga.getVeiculos().getHoraIngresso())) + " horas");
					}
					else {
						this.calcularCusto(horaSaida, vaga);
						System.out.println("O " + vaga.getVeiculos().getModelo() + ", de placa " + vaga.getVeiculos().getPlaca() + " foi retirado da vaga " + vaga.getId());
						vaga.retirarVeiculo(horaSaida);
					}
					
				}
			}
		}
	}
	private void calcularCusto(int horaSaida, Vaga vaga) {
		if(horaSaida - vaga.getVeiculos().getHoraIngresso() == TEMPO_MINIMO) {
			 System.out.println("O valor é de " + TAXA_MINIMA + " reais apenas!");
		}
		else {
			System.out.println("O valor que deverá ser pago será de " + (((horaSaida - vaga.getVeiculos().getHoraIngresso() - TEMPO_MINIMO) * TAXA_ADICIONAL) + TAXA_MINIMA) + " reais!");
		}
	}
}
	
