package com.company.decorator;

public class BicicletaDecorator implements Bicicleta{

    protected Bicicleta bicicleta;

    public BicicletaDecorator(Bicicleta bicicleta) {
        this.bicicleta = bicicleta;
    }

    @Override
    public String mostrarInformacion() {
        return this.bicicleta.mostrarInformacion();
    }
}