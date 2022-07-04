package exercicioAula3;

public class Funcionario {

    protected String nome;
    protected String cpf;
    protected double salario;

    public double bonificacao() {
        return salario * 0.10;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
