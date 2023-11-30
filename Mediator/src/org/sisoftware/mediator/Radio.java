package org.sisoftware.mediator;

public class Radio implements Component{

	private boolean encendida = false;
	private Mediator mediator;

	@Override
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	public void enciende() {
		encendida = true;
	}

	public void enciendeR() {
		mediator.enciendeRadio();
		mediator.apagaTelefono();
	}

	@Override
	public void apaga() {
		encendida = false;
	}

	@Override
	public boolean status() {
		return encendida;
	}

	public boolean encendida() {
		return encendida;
	}

}
