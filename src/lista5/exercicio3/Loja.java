package lista5.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Loja {
	private String cnpj;
	private String razaoSocial;
	private List<Produto> produtos;
	
	public Loja(String cnpj, String razaoSocial) {
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.produtos = new ArrayList<Produto>();
	}

	private Produto acharProduto(int codigo) {
		for(Produto produto : this.produtos) {
			if(produto.getCodigo() == codigo) {
				return produto;
			}
		}
		return null;
	}
		
	public void cadastrarProduto(int codigo, String nomeProduto, String marca, String modelo, int quantidadeEstoque,
			double valorUnd) {
			Produto produto = acharProduto(codigo);
			if(produto != null) {
				produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() + quantidadeEstoque);
				System.out.println(produto.getNomeProduto() + " já cadastrado, então foi atualizado a quantidade em estoque!");
			}
			else {
				this.produtos.add(new Produto(codigo, nomeProduto, marca, modelo, quantidadeEstoque, valorUnd));
				System.out.println("O produto foi cadastrado!");
			}
	}
	
	public void adquirirProduto(int codigo, int quantidadeAdquirir) {
		Produto produto = acharProduto(codigo);
				if (produto != null && quantidadeAdquirir > 0) {
					produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() + quantidadeAdquirir);
					System.out.println("O produto " + produto.getNomeProduto() + " foi adicionado ao estoque em " + quantidadeAdquirir +
							" unidades!");
				}
				else {
					System.out.println("Erro");
				}
	}
	
	public void exibirProdutos() {
		System.out.println("======= ESTOQUE DA LOJA =======");
	    System.out.println("Loja: " + this.razaoSocial);
	    System.out.println("CNPJ: " + this.cnpj);
	    System.out.println("===============================");
		for(Produto produto : this.produtos) {
			System.out.println("==========================================");
			System.out.println("Código: " + produto.getCodigo());
			System.out.println("Produto: " + produto.getNomeProduto());
			System.out.println("Marca: " + produto.getMarca());
			System.out.println("Modelo: " + produto.getModelo());
			System.out.println("Quantidade em Estoque: " + produto.getQuantidadeEstoque());
			System.out.printf("Valor Unitário: R$ %.2f%n", produto.getValorUnd());
		}
		System.out.println("==========================================");
	}
	
	public void venderProduto(int codigo, int quantidadeVenda) {
		Produto produto = this.acharProduto(codigo);
		if(produto == null) {
			System.out.println("O produto não foi encontrado!");
		}
		else if(produto.getQuantidadeEstoque() < quantidadeVenda){
			System.out.println("Não há está quantidade em estoque");
		}
		else {
			produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() - quantidadeVenda);
		}
	}
}
