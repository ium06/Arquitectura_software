package org.sisoftware.mediator;

    public interface Component {
        void setMediator(Mediator mediator);
        void enciende();

        void apaga();

        boolean status();

    }

