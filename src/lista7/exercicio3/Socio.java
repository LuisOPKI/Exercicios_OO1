package lista7.exercicio3;

public class Socio extends Cliente {
    private String cpf;
    private Dependente dependente;

    public Socio(String nome, String dataNascimento, String telefone, Endereco endereco, String cpf) {
        super(nome, dataNascimento, telefone, endereco);
        this.cpf = cpf;
    }

    public void adicionarDependente(Dependente dependente) {
        this.dependente = dependente;
    }

    public void removerDependente(String nomeDependente) {
        if (this.dependente != null && this.dependente.getNome().equalsIgnoreCase(nomeDependente)) {
            this.dependente = null;
            System.out.println("Dependente " + nomeDependente + " removido com sucesso.");
            return;
        }
        System.out.println("Dependente " + nomeDependente + " não encontrado.");
    }

    public String getCpf() {
        return cpf;
    }
}
