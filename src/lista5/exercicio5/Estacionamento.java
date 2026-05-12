package lista5.exercicio5;

import java.util.List;
import java.util.ArrayList;

public class Estacionamento {
	private List<Vaga> vagas;
	
	public Estacionamento(){
		this.vagas = new ArrayList<Vaga>();
		this.inicializarVaga();
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
			}
			else
			{
				System.out.println("Não há vagas disponíveis no momento!");
			}
		}
	}
	
	public void retirarVeiculo(String placa, int horaSaida) {
		for(Vaga vaga : vagas) {
			if(vaga.isDisponibilidade() == false) {
				if(vaga.getVeiculos().getPlaca().equals(placa)) {
					vaga.retirarVeiculo();
				}
			}
		}
	}
}
	
