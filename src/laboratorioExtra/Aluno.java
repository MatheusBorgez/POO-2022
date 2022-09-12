package laboratorioExtra;

import java.util.ArrayList;

public class Aluno extends Pessoa {
    
    private int matricula;
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();

    public Aluno(String nome, int matricula) {
        super(nome);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public void addDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

    public double calculaMedia() {

        if (this.disciplinas.isEmpty()) {
            return 0;
        }

        int somaPesos = 0;
        double somaNotas = 0;

        for (Disciplina disciplina : this.disciplinas) {
            somaPesos += disciplina.getPeso();
            somaNotas += disciplina.getNota() * disciplina.getPeso();
        }

        return somaNotas / somaPesos;
    }

    public boolean aprovado() {

        for (Disciplina disciplina : this.disciplinas) {
            if (disciplina.getNota() < disciplina.getLimite()) {
                return false;
            }
        }

        return calculaMedia() >= 6;
    }

    @Override
    public String toString() {
        return String.format("Aluno: %s, Média: %.2f, Situação: %s", this.nome, this.calculaMedia(), (this.aprovado() ? "aprovado" : "reprovado"));
    }  
}
