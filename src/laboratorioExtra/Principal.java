package laboratorioExtra;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Disciplina d1 = new Disciplina("Matemática", 3, 8, 5);
        Disciplina d2 = new Disciplina("Física", 1, 6, 5);
        Disciplina d3 = new Disciplina("Química", 1, 6, 5);

        Disciplina d4 = new Disciplina("Matemática", 3, 3, 5);
        Disciplina d5 = new Disciplina("Física", 1, 6, 5);
        Disciplina d6 = new Disciplina("Química", 1, 8, 5);

        Disciplina d7 = new Disciplina("Matemática", 3, 10, 5);
        Disciplina d8 = new Disciplina("Física", 1, 10, 5);
        Disciplina d9 = new Disciplina("Química", 1, 4.9, 5);

        Aluno a1 = new Aluno("José", 202201);
        Aluno a2 = new Aluno("Maria", 202202);
        Aluno a3 = new Aluno("João", 202203);

        a1.addDisciplina(d1);
        a1.addDisciplina(d2);
        a1.addDisciplina(d3);

        a2.addDisciplina(d5);
        a2.addDisciplina(d6);
        a2.addDisciplina(d4);

        a3.addDisciplina(d7);
        a3.addDisciplina(d8);
        a3.addDisciplina(d9);

        ArrayList<Aluno> alunos = new ArrayList<>();
        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);

        Aluno maiorNota = new Aluno("", 0);

        for (Aluno aluno : alunos) {
            if (maiorNota.calculaMedia() < aluno.calculaMedia()) {
                maiorNota = aluno;
            }
            System.out.println(aluno.toString());
        }

        System.out.println("Aluno de maior nota: " + maiorNota.toString());
    }
}
