package lista7.exercicio3;

public class Dependente extends Cliente {
    public Dependente(String nome, int dataNascimento, String telefone, Endereco endereco) {
        super(nome, dataNascimento, telefone, endereco);
    }

    @Override
    public String toString() {
        return "Dependente: " + super.toString();
    }
}
