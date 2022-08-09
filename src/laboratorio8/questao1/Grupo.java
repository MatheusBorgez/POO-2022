package laboratorio8.questao1;

import java.util.ArrayList;

public class Grupo {
    private String nome;
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Interesses> interesses = new ArrayList<>();
    private Loja loja;

    public Grupo(String nome, Loja loja) {
        this.nome = nome;
        this.loja = loja;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void addClientes(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public ArrayList<Interesses> getInteresses() {
        return interesses;
    }

    public void addInteresses(Interesses interesses) {
        this.interesses.add(interesses);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Loja getLoja() {
        return loja;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }
}
