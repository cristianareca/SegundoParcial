
package com.company.decorator;

public class MaterialDecorator extends BicicletaDecorator
{
    private String material;

    public MaterialDecorator(Bicicleta bicicleta, String material) {
        super(bicicleta);
        this.material = material;
    }

    public String decorateMaterial()
    {
        return "Agregado material " + this.material + " a la bicicleta";
    }
    
}
