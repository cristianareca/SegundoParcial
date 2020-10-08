package com.company.Entidades;

public class Bicicleta{

    private String serial;
    private String marca;
    private String modelo;

    public Bicicleta(String serial, String marca, String modelo) {
        this.serial = serial;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void agregarComponente(Componente componente) {

    }

    public void mostrarInformacion(){
        System.out.println("        Dueño de Bicicleta");
        System.out.println ("       Bicicleta{" +
                "serial='" + serial + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}');
    }

}
