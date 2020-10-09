package com.company.entidades;

public class Admin extends User implements Componente{

    public Admin(String password, String correo) {
        super(password, correo);
    }


    @Override
    public void mostrarInformacion() {

    }
}
