package exercicioAula2;

public class Curso {

    private String nome;
    private String codigo;
    private int vagas;
    private int cargaHoraria;

    private Departamento departamento;

    public Curso(String nome, String codigo, int vagas, int cargaHoraria, Departamento departamento) {
        this.nome = nome;
        this.codigo = codigo;
        this.vagas = vagas;
        this.cargaHoraria = cargaHoraria;
        this.departamento = departamento;
    }

    public Curso() {
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    
    @Override
    public String toString() {

        return String.format("Dados do curso:\nNome: %s\nCodigo: %s\nQuantidade de vagas: %s\nCarga Horaria %sh",
                                this.nome, this.codigo, this.vagas, this.cargaHoraria);
    }
    
    
}
