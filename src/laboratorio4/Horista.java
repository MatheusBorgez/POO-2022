package laboratorio4;

public class Horista extends Funcionario {
    private int horasTrabalhadas;
    private double valorHora;

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public Horista(String nome, String sobrenome, int horasTrabalhadas, double valorHora) {
        super(nome, sobrenome);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public Horista(int horasTrabalhadas, double valorHora) {
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return "Horista [horasTrabalhadas=" + horasTrabalhadas + ", valorHora=" + valorHora + "]" + super.toString();
    }

    @Override
    public double calcularGanhos() {
        return horasTrabalhadas * valorHora;
    }
}
