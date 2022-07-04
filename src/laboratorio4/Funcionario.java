package laboratorio4;

public abstract class Funcionario {
    protected String nome;
    protected String sobrenome;

    public Funcionario(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Funcionario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", sobrenome=" + sobrenome + "]";
    }  

    public abstract double calcularGanhos();
    
}
