package laboratorio10;

public abstract class Documento {
    private int numero;
    private String remetente;
    private TipoDocumento tipoDocumento;

    public Documento(int numero, String remetente, TipoDocumento tipoDocumento) {
        this.numero = numero;
        this.remetente = remetente;
        this.tipoDocumento = tipoDocumento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    @Override
    public String toString() {
        return "Documento [numero=" + numero + ", remetente=" + remetente + ", tipoDocumento=" + tipoDocumento.getTipoDocumento() + "]";
    }

    
}
