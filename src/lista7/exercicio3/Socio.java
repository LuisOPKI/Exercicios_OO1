package lista7.exercicio3;

public class Socio extends Cliente {
    private String cpf;
    private Dependente dependente;

    public Socio(String nome, int dataNascimento, String cpf, String telefone, Endereco endereco) {
        super(nome, dataNascimento, telefone, endereco);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public Dependente getDependente() {
        return dependente;
    }

    public void setDependente(Dependente dependente) {
        this.dependente = dependente;
    }
}
