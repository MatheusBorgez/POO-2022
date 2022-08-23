package laboratorio10;

public class FabricaDocumentos extends Fabrica {

    @Override
    public Documento createDocumento(int numero, String remetente, TipoDocumento tipo) {
        if(tipo == TipoDocumento.CARTA) {
            return new Carta(numero, remetente, tipo);
        }
        else if (tipo == TipoDocumento.NOTIFICACAO) {
            return new Notificacao(numero, remetente, tipo);
        }
        return new Telegrama(numero, remetente, tipo);
    }
}
