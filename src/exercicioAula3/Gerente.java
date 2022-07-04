package exercicioAula3;

public class Gerente extends Funcionario {

    private int senha;

    @Override
    public double bonificacao() {
        return salario * 0.15;
    }
    
}
