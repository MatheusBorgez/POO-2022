package laboratorio6.atividade1;

import java.util.ArrayList;

public class Curso {

    private String nome;
    private String codigo;
    private ArrayList<Disciplina> disciplinas;

    public Curso(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public void addDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }
    
}
