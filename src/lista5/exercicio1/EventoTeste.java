package lista5.exercicio1;

public class EventoTeste {
	public static void main(String[] args) {
		Evento evento1 = new Evento(
			    "Bad World Tour", 
			    new Artista("Michael Jackson", "Norte-Americano", "O Rei do Pop em sua turnê recordista de público."), 
			    "15/07/1988", 
			    new Local(
			        "Wembley Stadium", 
			        new Endereco("London Road", 1, "Wembley Park", "Londres", "Inglaterra"), 
			        72000
			    ), 
			    12, 
			    new Endereco("London Road", 1, "Wembley Park", "Londres", "Inglaterra")
			);
		evento1.exibirRelatorio();
		evento1.comprarIngressos(5);
		evento1.exibirRelatorio();
		evento1.comprarIngressos(7452);
		evento1.exibirRelatorio();
	}
	}

