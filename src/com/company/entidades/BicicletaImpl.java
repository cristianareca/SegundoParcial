/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.entidades;

import com.company.decorator.Bicicleta;

/**
 *
 * @author Riva
 */
public class BicicletaImpl implements Bicicleta
{
    private String serial;
    private String marca;
    private String color;

    public BicicletaImpl(String serial, String marca, String color)
    {
        this.serial = serial;
        this.marca = marca;
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String mostrarInformacion() {
        return "BicicletaImpl{" +
                "serial='" + serial + '\'' +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
