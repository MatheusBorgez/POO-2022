package laboratorio6.atividade1;

public abstract class Pessoa {
    protected String nome;
    private Endereco endereco;
    private int matricula;

    public Pessoa(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public abstract String mostraDados();

}
