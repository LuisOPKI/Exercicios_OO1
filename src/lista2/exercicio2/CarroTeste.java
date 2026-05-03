package lista2.exercicio2;

public class CarroTeste {
	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();
		
		carro1.modelo = "Gol";
		carro1.marca = "Volkswagen";
		carro1.cor = "Vermelho";
		carro1.ano = 2020;
		carro1.renavam = 123123;
		carro1.chassi = "9BWHE21JX24060831";
		carro1.placa = "ABC-1B34";
		
		carro2.modelo = "Onix";
		carro2.marca = "Chevrolet";
		carro2.cor = "Preto";
		carro2.ano = 2013;
		carro2.renavam = 987987;
		carro2.chassi = "7FSKI59ZJ24071254";
		carro2.placa = "XYZ-1G45";
		
		carro3.modelo = "Ka";
		carro3.marca = "Ford";
		carro3.cor = "Prata";
		carro3.ano = 2015;
		carro3.renavam = 456456;
		carro3.chassi = "5UDHT3HD24070632";
		carro3.placa = "MNO-5D78";
		
		carro1.ligar();
		carro1.acelerar(140);
		carro1.frear(40);
		carro1.frear(90);
		carro1.desligar();
		carro1.acelerar(220);
		
		carro2.ligar();
		carro2.desligar();
		
	}
}
