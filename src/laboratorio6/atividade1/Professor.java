package laboratorio6.atividade1;

public class Professor extends Pessoa {

    private String formacao;

    public Professor(String nome, int matricula, String formacao) {
        super(nome, matricula);
        this.formacao = formacao;
    }

    @Override
    public String mostraDados() {
        // TODO Auto-generated method stub
        return null;
    }

    public String getFormacao() {
        return formacao;
    }   
    
}
