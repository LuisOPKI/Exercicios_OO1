package lista2.exercicio4;

public class NotebookTeste {
	public static void main(String[] args) {
		
		Notebook notebook1 = new Notebook();
		Notebook notebook2 = new Notebook();
		Notebook notebook3 = new Notebook();
		
		notebook1.marca = "Lenovo";
		notebook1.modelo = "IdeaPad 3";
		notebook1.polegadas = 15.6;
		notebook1.modeloCPU = "AMD Ryzen 5 5500U";
		notebook1.memoriaRam = 8;
		notebook1.armazenamento = 256;

		notebook2.marca = "Apple";
		notebook2.modelo = "MacBook Air";
		notebook2.polegadas = 13.6;
		notebook2.modeloCPU = "Apple M2";
		notebook2.memoriaRam = 16;
		notebook2.armazenamento = 512;

		notebook3.marca = "Dell";
		notebook3.modelo = "Alienware m16";
		notebook3.polegadas = 16.0;
		notebook3.modeloCPU = "Intel Core i9-13900HX";
		notebook3.memoriaRam = 32;
		notebook3.armazenamento = 1024;
		
		notebook1.ligar();
		notebook2.desligar();
		notebook3.processarInformacoes();
		notebook2.conectarInternet();
	}

}
