package lista7.exercicio3;

public class Dependente extends Cliente {

    public Dependente(String nome, String dataNascimento, String telefone, Endereco endereco) {
        super(nome, dataNascimento, telefone, endereco);
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
}
