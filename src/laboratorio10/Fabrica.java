package laboratorio10;

public abstract class Fabrica {
    abstract Documento createDocumento(int numero, String remetente, TipoDocumento tipo);
}
