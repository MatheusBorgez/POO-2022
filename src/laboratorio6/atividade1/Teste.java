package laboratorio6.atividade1;

public class Teste {
    public static void main(String[] args) {
        Curso curso = new Curso("Informatica", "001");
        curso.addDisciplina(new Disciplina(1, "manutenção de computadores", 200));
        curso.addDisciplina(new Disciplina(2, "introdução a computação", 400));

        Aluno aluno = new Aluno(5544, 2019, "Matheus Borges");
        aluno.setCurso(curso);
        aluno.setEndereco(new Endereco("Rua dona gercina", 135, "Setor negrão de lima"));

        Professor professor = new Professor("Aldair", 2001, "Engenheiro de Software");
    }
}
