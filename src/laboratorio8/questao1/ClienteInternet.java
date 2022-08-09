package laboratorio8.questao1;

public class ClienteInternet extends Cliente{
    private String email;

    public ClienteInternet(String nome, int idade, Grupo grupo, String email) {
        super(nome, idade, grupo);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
