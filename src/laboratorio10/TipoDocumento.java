package laboratorio10;

public enum TipoDocumento {

    CARTA("Carta"),
    NOTIFICACAO("Notificação"),
    TELEGRAMA("Telegrama");

    private String tipoDocumento;

    TipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getTipoDocumento() {
        return this.tipoDocumento;
    }
}
