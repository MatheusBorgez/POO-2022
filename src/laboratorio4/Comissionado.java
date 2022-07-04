package laboratorio4;

public class Comissionado extends Funcionario {
    private double salario;
    private double percentualComissao;
    private int totalVendas;
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public int getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(int totalVendas) {
        this.totalVendas = totalVendas;
    }

    public Comissionado(String nome, String sobrenome, double salario, double percentualComissao, int totalVendas) {
        super(nome, sobrenome);
        this.salario = salario;
        this.percentualComissao = percentualComissao;
        this.totalVendas = totalVendas;
    }

    public Comissionado(double salario, double percentualComissao, int totalVendas) {
        this.salario = salario;
        this.percentualComissao = percentualComissao;
        this.totalVendas = totalVendas;
    }

    @Override
    public String toString() {
        return "Comissionado [percentualComissao=" + percentualComissao + ", salario=" + salario + ", totalVendas="
                + totalVendas + "]" + super.toString();
    }

    @Override
    public double calcularGanhos() {
        return salario + (totalVendas * (percentualComissao / 100));
    }
    
    
}
