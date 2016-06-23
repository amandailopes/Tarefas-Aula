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
public class Complexo {

    private double real;
    private double img;

    public Complexo(double real, double img) {
        this.real = real;
        this.img = img;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImg() {
        return img;
    }

    public void setImg(double img) {
        this.img = img;
    }

    public double modulo() {
        return Math.sqrt(Math.pow(real, 2.) + Math.pow(img, 2.));

    }

    public void reset() {
        this.img = 0;
        this.real = 0;
    }
    
    public void incrementar(){
        this.real = real+1;
    }
    
    public void conjugado(){
          this.img = img*(-1);
    }

    public static void main(String[] args) {
        Complexo c1 = new Complexo(2.0, 2.0);
        double mod = c1.modulo();
        System.out.println("Modulo é " + mod);
        c1.conjugado();
        System.out.println("Conjugado é " +"Parte real "+ c1.getReal()+  "Parte Img "  +c1.getImg());
        c1.reset();
        System.out.println("Reset é " + c1.getImg()+ c1.getReal());
        c1.incrementar();
        System.out.println("Incrementar " +c1.getReal() );
        
        
    }

}
