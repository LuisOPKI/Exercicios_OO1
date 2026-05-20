package lista6.exercicio1;

public class DataTeste {
	public static void main(String[] args) {
		Data data1 = new Data(4,11,2006);
		data1.exibirData();
		Data data2 = new Data(9,1983);
		data2.exibirData();
		Data data3 = new Data(31);
		data3.exibirData();
		Data data4 = new Data();
		data4.exibirData();
		
		Feriado feriado1 = new Feriado();
		feriado1.exibirData();
		Feriado feriado2 = new Feriado("Dia do Chapéu");
		feriado2.exibirData();
		Feriado feriado3 = new Feriado(4,11,2006,"Aniversário do Otávio");
		feriado3.exibirData();
		
	}
}
