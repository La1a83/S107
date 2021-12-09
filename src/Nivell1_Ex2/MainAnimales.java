/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nivell1_Ex2;




public class MainAnimales {

    
    @SuppressWarnings("deprecation")//Despareixen els warnings del IDE.
    public static void main(String[] args) {
        Perro perro1 = new Perro();
        Gato gato1 = new Gato();
        
        
        
        //Probando los deprecated:
        perro1.numOjos();
        gato1.deprecatedMethod();
    }      
        
}
