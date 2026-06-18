package lista7.exercicio3;

public class Filme {
    private String titulo;
    private int duracao;
    private double valorLocacao;
    private double valorMultaDiaria;
    private boolean disponivel;
    private int diaAlocacao;
    private int diaPrevistaDevolucao;
    private int diaDevolucao;
    private Cliente cliente;

    public Filme(String titulo, int duracao, double valorLocacao, double valorMultaDiaria) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.valorLocacao = valorLocacao;
        this.valorMultaDiaria = valorMultaDiaria;
        this.disponivel = true;
        this.diaAlocacao = 0;
        this.diaPrevistaDevolucao = 0;
        this.diaDevolucao = 0;
        this.cliente = null;
    }

    public void alugarFilme(Cliente cliente, boolean isDependente) {
        if (this.disponivel) {
            this.disponivel = false;
            this.cliente = cliente;
            this.diaAlocacao = 0; // Supondo que a alocação ocorre no dia 0
            this.diaPrevistaDevolucao = this.diaAlocacao + 7; // Prazo de 7 dias para devolução
            if (isDependente) {
                this.valorLocacao *= 0.5; // Desconto de 50% para dependentes
            }
        } else {
            System.out.println("Filme " + this.titulo + " não está disponível para aluguel.");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public double getValorMultaDiaria() {
        return valorMultaDiaria;
    }

    public void setValorMultaDiaria(double valorMultaDiaria) {
        this.valorMultaDiaria = valorMultaDiaria;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public int getDiaAlocacao() {
        return diaAlocacao;
    }

    public void setDiaAlocacao(int diaAlocacao) {
        this.diaAlocacao = diaAlocacao;
    }

    public int getDiaPrevistaDevolucao() {
        return diaPrevistaDevolucao;
    }

    public void setDiaPrevistaDevolucao(int diaPrevistaDevolucao) {
        this.diaPrevistaDevolucao = diaPrevistaDevolucao;
    }

    public int getDiaDevolucao() {
        return diaDevolucao;
    }

    public void setDiaDevolucao(int diaDevolucao) {
        this.diaDevolucao = diaDevolucao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    

}
