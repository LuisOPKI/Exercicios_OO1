package lista7.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class SistemaLocacao {

    private List<Cliente> clientes;
    private List<Filme> filmes;

    public SistemaLocacao() {
        this.clientes = new ArrayList<Cliente>();
        this.filmes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void adicionarFilme(Filme filme) {
        this.filmes.add(filme);
    }

    public void alugarFilme(String nomeCliente, String nome, int diaAlocacao) {{
        for (Filme filme : filmes) {
            if (filme.getTitulo().equalsIgnoreCase(nome) && filme.isDisponivel()) {
                filme.alugarFilme(cliente, false)
                System.out.println("Filme " + filme.getTitulo() + " alugado para " + cliente.nome);
                return;
            }
        }
    }

    public void devolverFilme(Cliente cliente, Filme filme) {
        if (filme.getCliente() == cliente) {
            filme.setDisponivel(true);
            filme.setCliente(null);
            System.out.println("Filme " + filme.getTitulo() + " devolvido com sucesso.");
        } else {
            System.out.println("Filme " + filme.getTitulo() + " não foi alugado por " + cliente.nome);
        }
    }

}
