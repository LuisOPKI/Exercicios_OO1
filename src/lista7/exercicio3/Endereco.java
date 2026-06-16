package lista7.exercicio3;

public class Endereco {
    private String logradouro;
    private int numero;
    private String bairro;
    private String cep;
    private String cidade;
    private String unidadeFederativa;

    public Endereco(String logradouro, int numero, String bairro, String cep, String cidade, String unidadeFederativa) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.unidadeFederativa = unidadeFederativa;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUnidadeFederativa() {
        return unidadeFederativa;
    }

    @Override
    public String toString() {
        return logradouro + ", " + numero + ", " + bairro + ", " + cep + ", " + cidade + ", " + unidadeFederativa;
    }
}
