/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.figurasgeometricas;

/**
 *
 * @author duvan
 */
public class Esfera extends Figuras3D{
    private int radio;
    private double volumen;
    private double PI = 3.1415;

    public Esfera(int radio) {
        this.radio = radio;
    }
    @Override
    public void hallarPerimetro() {
        volumen = PI *(radio^3);
    }
    @Override
    public void imprimir()
    {
        System.out.println("\nEl Perimetro del circulo es: " + volumen);
    }

    /**
     * @return the radio
     */
    public int getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(int radio) {
        this.radio = radio;
    }
    /**
     * @return the PI
     */
    public double getPI() {
        return PI;
    }

    /**
     * @param PI the PI to set
     */
    public void setPI(double PI) {
        this.PI = PI;
    }
    
}
