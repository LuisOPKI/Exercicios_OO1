package lista5.exercicio3;

public class LojaTeste {
	public static void main(String[] args) {
		Loja loja1 = new Loja("913.124.121/43", "Super 12");
		
		loja1.cadastrarProduto(1001, "Smartphone Galaxy S24", "Samsung", "S24 Ultra", 50, 5999.90);
		loja1.exibirProdutos();
		loja1.cadastrarProduto(2005, "Fritadeira Air Fryer", "Mondial", "AF-31", 120, 450.00);
		loja1.exibirProdutos();
		loja1.cadastrarProduto(3010, "Notebook Inspiron 15", "Dell", "i15-i1200", 15, 4299.00);
		loja1.exibirProdutos();
		loja1.cadastrarProduto(4088, "Monitor Gamer 24\"", "LG", "UltraGear 24GN600", 30, 1150.50);
		loja1.exibirProdutos();
		loja1.cadastrarProduto(4088, "Monitor Gamer 24\"", "LG", "UltraGear 24GN600", 30, 1150.50);
		loja1.exibirProdutos();
		
		loja1.adquirirProduto(1001, 2);
		loja1.exibirProdutos();
		
		loja1.venderProduto(3010, 15);
		loja1.exibirProdutos();
		loja1.venderProduto(3010, 15);
		loja1.exibirProdutos();
	}
}
