package lista5.exercicio5;

public class EstacionamentoTeste {
	public static void main(String[] args) {
Estacionamento estacionamento = new Estacionamento();
		
		estacionamento.estacionarVeiculo("ABC-1234", "Gol", "Vermelho", 5);
		estacionamento.estacionarVeiculo("MNO-9876", "Onix", "Amarelo", 6);
		estacionamento.estacionarVeiculo("XYZ-1596", "Fiesta", "Verde", 7);
		estacionamento.estacionarVeiculo("QWE-7777", "Cruze", "Preto", 8);
		estacionamento.estacionarVeiculo("MKO-3579", "A3", "Prata", 9);
		
		estacionamento.estacionarVeiculo("FGH-9999", "Celta", "Vermelho", 10);
		
		estacionamento.retirarVeiculo("QWE-7777", 18);
		
		estacionamento.estacionarVeiculo("FGH-9999", "Celta", "Vermelho", 19);
	}
}
