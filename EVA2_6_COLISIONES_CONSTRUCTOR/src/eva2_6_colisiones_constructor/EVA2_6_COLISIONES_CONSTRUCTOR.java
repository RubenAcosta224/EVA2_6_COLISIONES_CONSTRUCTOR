/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_6_colisiones_constructor;

/**
 *
 * @author dell
 */
public class EVA2_6_COLISIONES_CONSTRUCTOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Animal:");
        Animal animal1 = new Animal();
        animal1.respirar();
        animal1.comer();
 
        System.out.println("Mamífero:");
        Mamífero mamifero1 = new Mamífero();
    }
    
}
