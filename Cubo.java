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
public class Cubo extends Figuras3D{
    private int area;
    private int area1;
    private int area2;
    private double volumen;

    public Cubo(int area, int area1, int area2) {
        this.area = area;
        this.area = area1;
        this.area = area2;
    }
    @Override 
    public void hallarPerimetro()
    {
        volumen = area * area1 * area2;
    }
    @Override
    public void imprimir()
    {
        System.out.println("\nEl volumen del cubo es: " + volumen);
    }

    /**
     * @return the area
     */
    public int getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(int area) {
        this.area = area;
    }

    /**
     * @return the area1
     */
    public int getArea1() {
        return area1;
    }

    /**
     * @param area1 the area1 to set
     */
    public void setArea1(int area1) {
        this.area1 = area1;
    }

    /**
     * @return the area2
     */
    public int getArea2() {
        return area2;
    }

    /**
     * @param area2 the area2 to set
     */
    public void setArea2(int area2) {
        this.area2 = area2;
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
