package laboratorio6.atividade1;

public class Aluno extends Pessoa {
    private int ano;
    private Curso Curso;

    public Aluno(int matricula, int ano, String nome) {
        super(nome, matricula);
        this.ano = ano;
    }

    @Override
    public String mostraDados() {
        // TODO Auto-generated method stub
        return null;
    }

    public Curso getCurso() {
        return Curso;
    }

    public void setCurso(Curso curso) {
        Curso = curso;
    }
    

}
