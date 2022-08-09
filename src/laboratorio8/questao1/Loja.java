package laboratorio8.questao1;
import java.util.ArrayList;

public class Loja {
    private String nome;
    private ArrayList<Grupo> grupos = new ArrayList<>();

    public ArrayList<Grupo> getGrupos() {
        return grupos;
    }

    public void addGrupo(Grupo grupo) {
        this.grupos.add(grupo);
    }

    public Loja(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
