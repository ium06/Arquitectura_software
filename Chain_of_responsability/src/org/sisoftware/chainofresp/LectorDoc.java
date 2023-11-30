package org.sisoftware.chainofresp;

public class LectorDoc implements LectorDocumentos {
    @Override
    public String contenido(Documento documento) {
        return "doc " + documento.getContenido();
    }

    @Override
    public Boolean validar(String type){
        return type.equals("doc");
    }
}
