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
public class Triangulo extends Figuras2D{
    private int base;
    private int altura;
    private double perimetro;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public void hallarPerimetro() {
        perimetro = base * altura;
    }
    @Override
    public void imprimir()
    {
        System.out.println("\nEl Perimetro del circulo es: " + perimetro);
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
}
