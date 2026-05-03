package lista3.exercicio5;

public class CarroTeste {
	public static void main(String[] args) {
		Carro carro1 = new Carro("Ferrari");
		
			System.out.println(carro1);
		
			for (int i = 0; i < 28; i++) {

				carro1.acelerar();
				System.out.println(carro1);
			}

			for (int i = 0; i < 28; i++) {

				carro1.frear();
				System.out.println(carro1);
				
			}
	}
}