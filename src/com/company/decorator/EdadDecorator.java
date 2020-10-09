
package com.company.decorator;

public class EdadDecorator extends BicicletaDecorator {
    private String edad;

    public EdadDecorator(Bicicleta bicicleta, String edad) {
        super(bicicleta);
        this.edad = edad;
    }


    public String decorateEdad() {
        return "Agregada edad" + this.edad + " a la bicicleta" +
                bicicleta.mostrarInformacion();
    }


}
