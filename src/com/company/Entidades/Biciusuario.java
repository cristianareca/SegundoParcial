package com.company.Entidades;

import java.util.ArrayList;

public class Biciusuario implements Componente{

    private String id;
    private String nombre;
    private String direccion;
    private String telefono;
    private ArrayList <Componente> bicicletas = new ArrayList<Componente>();

    public Biciusuario(String id, String nombre, String direccion, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public void agregarComponente(Componente componente) {
        bicicletas.add(componente);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Biciusuario{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}');
        for(Componente componente:bicicletas){
            componente.mostrarInformacion();
        }
    }


}
