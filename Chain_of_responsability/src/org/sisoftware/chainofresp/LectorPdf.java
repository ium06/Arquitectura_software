package org.sisoftware.chainofresp;

public class LectorPdf implements LectorDocumentos {
	@Override
	public String contenido(Documento documento) {
		return "pdf " + documento.getContenido();
	}

	@Override
	public Boolean validar(String type){
		return type.equals("pdf");
	}
}
