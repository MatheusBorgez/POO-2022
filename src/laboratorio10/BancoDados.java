package laboratorio10;

public class BancoDados {
    private String nome;
    private int codigo;

    public static BancoDados instancia;

    private BancoDados() {
        codigo = 001;
        nome = "MySql";
    }

    public static BancoDados getInstancia() {
        if (instancia == null) {
            instancia = new BancoDados();
        }

        return instancia;
    }

    public String toString() {
        return "BancoDados : " + codigo + "-" + nome + " - Instância :" + this.hashCode();
    }
}
