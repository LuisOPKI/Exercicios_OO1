package lista7.exercicio3;

public abstract class Cliente {
    protected String nome;
    protected String dataNascimento; // apenas dia do mês
    protected String telefone;
    protected Endereco endereco;

    public Cliente(String nome, String dataNascimento, String telefone, Endereco endereco) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return nome + ", " + dataNascimento + ", " + telefone + ", " + endereco;
    }
}
