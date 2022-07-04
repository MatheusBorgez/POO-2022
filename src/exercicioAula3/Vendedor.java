package exercicioAula3;

public class Vendedor extends Funcionario{

    private int meta;
    private String regiao;

    public Vendedor(int meta, String regiao) {
        this.meta = meta;
        this.regiao = regiao;
    }

    public int getMeta() {
        return meta;
    }
    public void setMeta(int meta) {
        this.meta = meta;
    }
    public String getRegiao() {
        return regiao;
    }
    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

}
