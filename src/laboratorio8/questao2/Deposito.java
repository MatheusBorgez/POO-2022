package laboratorio8.questao2;

public class Deposito {
    private String descricao;
    private double valor;

    public Deposito(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Deposito [descricao=" + descricao + ", valor=" + valor + "]";
    }
}
