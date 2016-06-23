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
public class Projeto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ola Mundo");
        System.out.println(3);
        Circulo c1 = new Circulo(5.5, 6, 3);
        System.out.println("Area do circulo"+ c1.getX() + " Raio "+ c1.getRaio());
    }
    
}
