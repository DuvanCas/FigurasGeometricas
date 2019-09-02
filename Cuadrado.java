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
public class Cuadrado extends Figuras2D{
    private int lado;
    private int lado1;
    private double perimetro;

    public Cuadrado(int lado, int lado1) {
        this.lado = lado;
        this.lado1 = lado1;
    }
    @Override
    public void hallarPerimetro() {
        perimetro = lado * lado1;
    }
    @Override
    public void imprimir()
    {
        System.out.println("\nEl Perimetro del cuadrado es: " + perimetro);
    }

    /**
     * @return the lado
     */
    public int getLado() {
        return lado;
    }

    /**
     * @param lado the lado to set
     */
    public void setLado(int lado) {
        this.lado = lado;
    }
}
