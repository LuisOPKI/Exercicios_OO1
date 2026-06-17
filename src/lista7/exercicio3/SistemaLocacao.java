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

    public void alugarFilme(Cliente cliente, Filme filme) {
        
    }

    public void devolverFilme(Cliente cliente, Filme filme) {
        
    }

}
