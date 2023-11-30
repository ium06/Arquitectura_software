package org.sisoftware.adapter;

public interface BancoNostrum {
	void movimiento(String cliente, int cantidad);
	Integer estado(String cliente);
}
