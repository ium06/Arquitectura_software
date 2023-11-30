package org.sisoftware.chainofresp;

import java.util.Arrays;
import java.util.List;

public class ProcesadorDocumentos {
    private List<LectorDocumentos> list;

    public ProcesadorDocumentos(LectorDocumentos ... LectorDocumentos) {
        list = Arrays.asList(LectorDocumentos);
    }

    public String concatena(List<Documento> documentos) {
        String resultado = "";
        for (Documento doc : documentos) {
            for (LectorDocumentos documento : list){
                if (documento.validar(doc.getTipo())) {
                    resultado += documento.contenido(doc);
                }
            }
            resultado += "\n";
        }
        return resultado;
    }
}
