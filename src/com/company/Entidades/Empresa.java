package com.company.Entidades;

import java.util.ArrayList;

public class Empresa implements Componente {

    private String NIT;
    private String nombre;
    private String direccion;
    private ArrayList <Componente> componentes = new ArrayList<Componente>();

    public Empresa(String NIT, String nombre, String direccion) {
        this.NIT = NIT;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
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

    public ArrayList<Componente> getComponentes() {
        return componentes;
    }

    public void agregarComponente(Componente componente) {
        componentes.add(componente);
    }

    public void despedirEmpleado(String id){
        for (int i = 0; i <componentes.size(); i++) {
            if(componentes.get(i)instanceof Biciusuario){
                if(((Biciusuario) componentes.get(i)).getId().equals(id)){
                    componentes.remove(i);
                }
            }
        }
    }
    public void eliminarTodas(){
        componentes.clear();
    }

    @Override
    public void mostrarInformacion() {

        System.out.println( "Empresa{" +
                "NIT='" + NIT + '\'' +
                ", name='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                '}');
        if(componentes.size()>0){
            System.out.println("CONTIENE");
            for (Componente componente:componentes){
                componente.mostrarInformacion();
            }
        }
       }
}
