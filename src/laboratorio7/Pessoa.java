package laboratorio7;

public class Pessoa {
    private String nome;
    private double salario;
    private int numeroDependentes;
    private int idade;
    
    public Pessoa(String nome, double salario, int numeroDependentes, int idade) {
        this.nome = nome;
        this.salario = salario;
        this.numeroDependentes = numeroDependentes;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public int getNumeroDependentes() {
        return numeroDependentes;
    }
    
    public void setNumeroDependentes(int numeroDependentes) {
        this.numeroDependentes = numeroDependentes;
    }
    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double calculaImposto() {

        if (salario <= 1787.77 || idade >= 65) {
            return 0;
        }
        else if (salario <= 2679.29) {
            return deduzaDepedentes((salario * 0.075) - 134.08);
        }
        else if (salario <= 3572.43) {
            return deduzaDepedentes((salario * 0.15) - 335.03);
        }
        else if (salario <= 4463.81) {
            return deduzaDepedentes((salario * 0.225) - 602.96);
        }

        return deduzaDepedentes((salario * 0.275) - 826.15);
    }

    private double deduzaDepedentes(double valorImposto) {
        return zerarImpostoNegativo(valorImposto - (numeroDependentes * 179.71));
    }

    private double zerarImpostoNegativo(double valorImposto) {
        return valorImposto > 0 ? valorImposto : 0;
    }
    
}
