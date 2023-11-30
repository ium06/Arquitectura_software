package org.sisoftware.chainofresp;

public class LectorOdt implements LectorDocumentos {
	@Override
	public String contenido(Documento documento) {
		return "odt " + documento.getContenido();
	}

	@Override
	public Boolean validar(String type){
		return type.equals("odt");
	}
}
