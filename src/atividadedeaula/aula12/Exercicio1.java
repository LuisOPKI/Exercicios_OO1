package atividadedeaula.aula12;

import java.util.List;
import java.util.ArrayList;

public class Exercicio1 {
	private int soma;
	private int media;
	private List<Lista> listas;
	
	public Exercicio1() {
		super();
		this.soma = 0;
		this.media = 0;
		this.listas = new ArrayList<Lista>();
	}
	
	public void instanciarNumeros() {
		this.listas.add(new Lista(3));
		this.listas.add(new Lista(3));
		this.listas.add(new Lista(3));
		this.listas.add(new Lista(3));
		this.listas.add(new Lista(3));
	}
	
	public void calcularMediaESoma() {
		for(Lista lista : listas) {
			this.soma += lista.getValor();
		}
		System.out.println("SOMA: " + this.soma);
		this.media = this.soma / listas.size();
		System.out.println("MEDIA ARITMEDICA: " + this.media);
	}
}
