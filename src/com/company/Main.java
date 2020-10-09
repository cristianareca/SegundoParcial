package com.company;

import com.company.entidades.User;
import com.company.gestor.GestorProxy;

public class Main {

    public static void main(String[] args) {
        User user = new User("admin@movelo.org","Movelo123");
        GestorProxy gestorProxy= new GestorProxy(user);
        gestorProxy.ejecutarAccion("crearBiciusuario,a,a,a,a,a,a");
    }
}
