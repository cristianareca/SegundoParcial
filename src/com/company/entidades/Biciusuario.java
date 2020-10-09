package com.company.entidades;

import com.company.decorator.Bicicleta;

import java.util.ArrayList;

public class Biciusuario extends AppUser implements Componente {

    private String id;

    private ArrayList <Bicicleta> bicicletas = new ArrayList<Bicicleta>();

    public Biciusuario(String password, String correo, String nombre, String direccion, String telefono, String id) {
        super(password, correo, nombre, direccion, telefono);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void agregarBicicleta(Bicicleta bicicleta) {
        bicicletas.add(bicicleta);
    }

    public ArrayList<Bicicleta> getBicicletas() {
        return bicicletas;
    }


    @Override
    public void mostrarInformacion() {
        System.out.println("Biciusuario{" +
                "correo='" + correo + '\'' +
                ", password='" + password + '\'' +
                ", id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}');

        for(Bicicleta bicicleta:bicicletas){
            bicicleta.mostrarInformacion();
        }
    }


}
