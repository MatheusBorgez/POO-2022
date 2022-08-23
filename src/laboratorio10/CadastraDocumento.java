package laboratorio10;

import java.util.ArrayList;

public class CadastraDocumento {
    public static void main(String[] args) {
        ArrayList<Documento> documentos = new ArrayList<>();
        FabricaDocumentos fabrica = new FabricaDocumentos();

        documentos.add(fabrica.createDocumento(1, "matheus", TipoDocumento.CARTA));
        documentos.add(fabrica.createDocumento(2, "andrade", TipoDocumento.NOTIFICACAO));
        documentos.add(fabrica.createDocumento(3, "borges", TipoDocumento.TELEGRAMA));

        for (Documento documento : documentos) {
            System.out.println(documento.toString());
        }
    }
}
