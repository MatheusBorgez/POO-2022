package laboratorio6.atividade1;

public class Disciplina {
    
    private int codigo;
    private String nome;
    private int creditos;

    public Disciplina(int codigo, String nome, int creditos) {
        this.codigo = codigo;
        this.nome = nome;
        this.creditos = creditos;
    }

    @Override
    public String toString() {
        return "Disciplina [codigo=" + codigo + ", creditos=" + creditos + ", nome=" + nome + "]";
    } 
}
