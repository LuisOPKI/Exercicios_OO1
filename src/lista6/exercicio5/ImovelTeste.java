package lista6.exercicio5;

public class ImovelTeste {
	public static void main(String[] args) {
		ImovelNovo imovel1 = new ImovelNovo(450000.00, new Endereco("Rua das Palmeiras", 120, "Centro", "Florianópolis", "SC"), 35000.00);
		
		ImovelUsado imovel2 = new ImovelUsado(320000.00, new Endereco("Av. Paulista", 1500, "Bela Vista", "São Paulo", "SP"), 25000.00);

		imovel1.exibirDados();
		System.out.println();
		imovel2.exibirDados();
	}
}