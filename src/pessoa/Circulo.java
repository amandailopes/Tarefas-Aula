/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa;

/**
 *
 * @author Amanda
 */
public class Circulo {

    private double x, y;
    private double raio;

    /**
     * Construtor
     *
     * @param x
     * @param y
     * @param raio
     */
    public Circulo(double x, double y, double raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
  
}
