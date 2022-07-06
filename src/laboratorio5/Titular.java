package laboratorio5;

import java.util.ArrayList;

public class Titular extends Socio implements Associacao {

    private int numTitulo;
    private ArrayList<Dependente> dependentes;

    public Titular(String nome, int idade, char sexo, int numTitulo) {
        super(nome, idade, sexo);
        this.numTitulo = numTitulo;
        dependentes = new ArrayList<>();
    }

    public Titular(int numTitulo) {
        this.numTitulo = numTitulo;
    }

    public Titular() {
    }

    public int getNumTitulo() {
        return numTitulo;
    }

    public void setNumTitulo(int numTitulo) {
        this.numTitulo = numTitulo;
    }

    @Override
    public double calcularValorMensalidade() {
        int idade = super.getIdade();

        double valorMensalidade = idade >= 21 && idade <= 65 ? 500 : 200;

        for (Dependente dependente : dependentes) {
            valorMensalidade += dependente.calcularValorMensalidade();
        }

        return valorMensalidade;
    }

    @Override
    public void associarObjetos(Object obj) {
        dependentes.add((Dependente)obj);
    }

    @Override
    public String toString() {
        return "Titular [numTitulo=" + numTitulo + "]" + super.toString();
    }
    
}
