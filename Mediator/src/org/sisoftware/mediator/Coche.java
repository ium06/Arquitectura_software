package org.sisoftware.mediator;

public class Coche implements Component{

	private Mediator mediator;
	private boolean encendida = false;

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	@Override
	public void enciende() {
		encendida = true;
	}

	public void cocheEnciende() {
		mediator.enciendeCoche();
		mediator.enciendeRadio();
		mediator.apagaTelefono();
	}

	@Override
	public void apaga() {
		encendida = false;
	}

	public void cocheApaga() {
		mediator.apagaRadio();
		mediator.apagaCoche();
	}


	@Override
	public boolean status() {
		return encendida;
	}


}
