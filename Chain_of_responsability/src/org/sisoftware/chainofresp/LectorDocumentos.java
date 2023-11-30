package org.sisoftware.chainofresp;

public interface LectorDocumentos {
	String contenido(Documento documento);

	Boolean validar(String type);
}
