package com.priscila.cursojava.aula46.labs;

import com.priscila.cursojava.aula46.labs.Figura2D;

public class Quadrado extends Figura2D {
    
    private int lado;

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

    @Override
    public double calcularArea() {
        return lado * lado;
        //return Math.pow(lado, 2);
    }
    
    
}
