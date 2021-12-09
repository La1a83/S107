/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nivell1_Ex1;


public class MainAnimales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro perro1 = new Perro();
        Gato gato1 = new Gato();
        Araña araña1 = new Araña();
         //Probando métodos override:
         
        System.out.println(perro1.emiteSonido());
        System.out.println(gato1.emiteSonido());
        System.out.println(araña1.emiteSonido());
       
        perro1.numPatas();
        gato1.numPatas();
        araña1.numPatas();
        
    }
    
}
