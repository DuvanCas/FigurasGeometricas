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
public class Circulo extends Figuras2D{
    private int radio;
    double perimetro;
    private double PI = 3.1415;

    public Circulo(int radio) {
        this.radio = radio;
    }
    @Override
    public void hallarPerimetro() {
        perimetro = PI * ((radio)^2);
    }
    @Override
    public void imprimir()
    {
        System.out.println("\nEl Perimetro del circulo es: " + perimetro);
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
