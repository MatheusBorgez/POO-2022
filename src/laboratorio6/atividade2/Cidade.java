package laboratorio6.atividade2;

import java.util.ArrayList;

public class Cidade implements Publicavel {
    private String codigo;
    private String nome;
    private int populacao;
    private double area;
    private ArrayList<Cidade> cidadesFronteira;

    public Cidade(String codigo, String nome, double area) {
        this.codigo = codigo;
        this.nome = nome;
        this.area = area;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public ArrayList<Cidade> getCidadesFronteira() {
        return cidadesFronteira;
    }

    public void addCidadeFronteira(Cidade cidadeFronteira) {
        this.cidadesFronteira.add(cidadeFronteira);
    }

    @Override
    public boolean equals(Object obj) {

        Cidade cidade = (Cidade) obj;

        return cidade.nome.equals(this.nome) && cidade.codigo == this.codigo;
    }

    public boolean isLimitrofe(Cidade cidade) {
        return cidadesFronteira.contains(cidade);
    }

    public String classificacao() {

        double densidadeDemografica = populacao/area;

        if (densidadeDemografica > 500) {
            return "Povoação elevada: " + densidadeDemografica + "hab/km²";
        }
        else if (densidadeDemografica > 100) {
            return "Povoação regular: " + densidadeDemografica + "hab/km²";
        }
        
        return "Povoação baixa: " + densidadeDemografica + "hab/km²";        
    }

    public ArrayList<Cidade> vizinhasEmComum(Cidade cidade) {

        ArrayList<Cidade> cidadesVizinhasComuns = new ArrayList<>();

        for (Cidade cidade2 : cidade.getCidadesFronteira()) {
           if (cidadesFronteira.contains(cidade2)) {
            cidadesVizinhasComuns.add(cidade2);
           } 
        }

        return cidadesVizinhasComuns;
    }

    @Override
    public String mostraDados() {
        return toString();
    }

    @Override
    public String toString() {
        return "Cidade [area=" + area + ", cidadesFronteira=" + cidadesFronteira + ", codigo=" + codigo + ", nome="
                + nome + ", populacao=" + populacao + "]";
    }   
    
}
