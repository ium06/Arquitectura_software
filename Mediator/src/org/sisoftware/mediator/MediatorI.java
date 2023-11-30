package org.sisoftware.mediator;

public class MediatorI implements Mediator{
    private Radio radio;
    private Telefono telefono;
    private Coche coche;


    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }
    public void setRadio(Radio radio) {
        this.radio = radio;
    }
    public void setCoche(Coche coche) {
        this.coche = coche;
    }


    @Override
    public void enciendeCoche() {
        coche.enciende();
    }

    @Override
    public void apagaCoche() {
        coche.apaga();
    }

    @Override
    public void enciendeTelefono() {
        telefono.enciende();
    }

    @Override
    public void apagaTelefono() {
        telefono.apaga();
    }

    @Override
    public void enciendeRadio() {
        radio.enciende();
    }

    @Override
    public void apagaRadio() {
        radio.apaga();
    }

}
