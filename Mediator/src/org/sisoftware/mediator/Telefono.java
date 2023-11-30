package org.sisoftware.mediator;

public class Telefono implements Component{

	private boolean encendida = false;
	private Mediator mediator;
	@Override
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	@Override
	public void enciende() {
		encendida = true;
	}

	public void enciendeMusica(){
		mediator.enciendeTelefono();
	}

	public void recibeLlamada() {
		mediator.apagaRadio();
		mediator.enciendeTelefono();

	}

	@Override
	public void apaga() {
		encendida = false;
	}

	@Override
	public boolean status() {
		return encendida;
	}

	public boolean musicaEncendida(){
		return encendida;
	}

}
