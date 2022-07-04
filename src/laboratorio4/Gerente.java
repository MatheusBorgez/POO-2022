package laboratorio4;

public class Gerente extends Funcionario {
 
    private double salario;
    private double bonificacao;

    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double getBonificacao() {
        return bonificacao;
    }
    
    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }
    
    public Gerente(String nome, String sobrenome, double salario, double bonificacao) {
        super(nome, sobrenome);
        this.salario = salario;
        this.bonificacao = bonificacao;
    }
    
    public Gerente(double salario, double bonificacao) {
        this.salario = salario;
        this.bonificacao = bonificacao;
    }

    @Override
    public String toString() {
        return "Gerente [bonificacao=" + bonificacao + ", salario=" + salario + "]" + super.toString();
    }

    @Override
    public double calcularGanhos() {
        return salario + bonificacao;
    }   
    
}
