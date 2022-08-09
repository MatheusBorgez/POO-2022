package laboratorio9;

import java.io.Serializable;

public class Funcionario implements Serializable {
    private String nome;
    private char sexo;
    private double salario;
    private int dependentes;
    
    public Funcionario(String nome, char sexo, double salario, int dependentes) {
        this.nome = nome;
        this.sexo = sexo;
        this.salario = salario;
        this.dependentes = dependentes;
    }

    public Funcionario() {
    }

    public double impostoRenda() {
        double reducaoDep = 189.59 * dependentes;

        if (salario <= 1903.98) {
            return 0;
        }
        else if (salario <= 2826.65) {
            return (salario * 7.5 / 100 - 142.80) - reducaoDep;
        }
        else if (salario <= 3751.05) {
            return (salario * 15 / 100 - 354.80) - reducaoDep;
        }
        else if (salario <= 4664.68) {
            return (salario * 22.5 / 100 - 636.13) - reducaoDep;
        }

        return (salario * 27.5 / 100 - 869.36) - reducaoDep;
    }

    @Override
    public String toString() {
        return "Funcionario [dependentes=" + dependentes + ", nome=" + nome + ", salario=" + salario + ", sexo=" + sexo
                + impostoRenda() + "]";
    }



    
}
