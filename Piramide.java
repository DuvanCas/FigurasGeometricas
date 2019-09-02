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
public class Piramide extends Figuras3D{
    private int base;
    private int altura;
    private double volumen;

    public Piramide(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public void hallarPerimetro() {
        setVolumen((getBase() * getAltura()) / 3);
    }
    @Override
    public void imprimir()
    {
        System.out.println("\nEl Perimetro del circulo es: " + getVolumen());
    }

    /**
     * @return the base
     */
    public int getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(int base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public int getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     * @return the volumen
     */
    public double getVolumen() {
        return volumen;
    }

    /**
     * @param volumen the volumen to set
     */
    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }
}
