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
public class Araña extends Animal {

    @Override
    public void numPatas() {
        System.out.println("La araña tiene 8 patas.");
    }

    @Override
    public String emiteSonido() {
        String sonido = "La araña no emite ningún sonido.";
        return sonido;
    }
    
    
    
}
