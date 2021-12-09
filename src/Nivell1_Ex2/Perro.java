/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nivell1_Ex2;



/**
 *
 * @author laiayjordi
 */
public class Perro extends Animal {
    
    @Override
    public String emiteSonido () {
        String sonido = "El perro ladra.";
        return sonido;
    }
    @Override
    public void numPatas () {
        System.out.println ("El perro tiene 4 patas.");
    }
    
    // Javadoc comment follows
    /**
     * @deprecated
     * Because it's no longer useful.
     */
    @Deprecated
    public void numOjos() { 
        System.out.println("El perro tiene 2 ojos.");
    
    }
}
    
    

