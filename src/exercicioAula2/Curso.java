package exercicioAula2;

public class Curso {

    String nome;
    String codigo;
    int vagas;
    int cargaHoraria;

    public Curso(String nome, String codigo, int vagas, int cargaHoraria) {
        this.nome = nome;
        this.codigo = codigo;
        this.vagas = vagas;
        this.cargaHoraria = cargaHoraria;
    }

    public Curso() {
    }
    
    @Override
    public String toString() {

        return String.format("Dados do curso:\nNome: %s\nCodigo: %s\nQuantidade de vagas: %s\nCarga Horaria %sh",
                                this.nome, this.codigo, this.vagas, this.cargaHoraria);
    }
    
    
}
