package laboratorio8.questao2;

public class Saque {
    private String descricao;
    private double valor;
    private int dia;

    public Saque(String descricao, double valor, int dia) {
        this.descricao = descricao;
        this.valor = valor;
        this.dia = dia;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public int getDia() {
        return dia;
    }

    @Override
    public String toString() {
        return "Saque [dia=" + dia + ", descricao=" + descricao + ", valor=" + valor + "]";
    }    
}
