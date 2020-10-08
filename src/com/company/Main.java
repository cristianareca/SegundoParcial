package com.company;

import com.company.Entidades.Biciusuario;
import com.company.Entidades.Componente;
import com.company.Entidades.Empresa;
import com.company.Gestor.Gestor;

public class Main {

    public static void main(String[] args) {

        Gestor.build().crearBiciusuario("1","biciusuario","a","a");
        Gestor.build().crearBiciusuario("1","a","a","a");
        Gestor.build().crearEmpresa("1","empresa","a");
        Gestor.build().crearEmpresa("1","a","a");

        Componente biciusuario = Gestor.build().consultarBiciusuario("1");
        Componente biciusuario2 = Gestor.build().consultarBiciusuario("2");
        Componente empresa = Gestor.build().consultarEmpresa("1");
        Componente empresa2 = Gestor.build().consultarEmpresa("2");
        System.out.println(((Biciusuario)biciusuario).getNombre());
        System.out.println(((Empresa)empresa).getNombre());

        Gestor.build().actualizarBiciusuario("1","nuevobiciusuario","a","a");
        Gestor.build().actualizarEmpresa("1","nuevaempresa","a");
        Gestor.build().actualizarBiciusuario("2","nuevobiciusuario","a","a");
        Gestor.build().actualizarEmpresa("2","nuevaempresa","a");

        System.out.println(((Biciusuario)biciusuario).getNombre());
        System.out.println(((Empresa)empresa).getNombre());

        Gestor.build().crearEmpresa("2","b","b");
        empresa2 = (Empresa) Gestor.build().consultarEmpresa("2");
        Gestor.build().crearConglomerado("2","1");
        Gestor.build().contratarEmpleado("2","1");
        Gestor.build().crearEmpresa("3","c","c");
        Componente empresa3 = Gestor.build().consultarEmpresa("3");

        Gestor.build().crearConglomerado("3","2");
        empresa3.mostrarInformacion();

        Gestor.build().eliminarEmpresa("2");

        Gestor.build().consultarEmpresa("2");
        Gestor.build().consultarEmpresa("1");
    }
}
