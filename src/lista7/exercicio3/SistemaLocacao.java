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
        // encontrar cliente pelo nome
        Cliente cliente = null;
        for (Cliente c : clientes) {
            if (c.nome.equalsIgnoreCase(nomeCliente)) {
                cliente = c;
                break;
            }
        }
        if (cliente == null) {
            System.out.println("Cliente " + nomeCliente + " não encontrado.");
            return;
        }

        for (Filme filme : filmes) {
            if (filme.getTitulo().equalsIgnoreCase(nome) && filme.isDisponivel()) {
                filme.setDisponivel(false);
                filme.setCliente(cliente);
                System.out.println("Filme " + filme.getTitulo() + " alugado para " + cliente.nome);
                return;
            }
        }
        System.out.println("Filme " + nome + " não disponível para aluguel.");
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
