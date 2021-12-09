
package Nivell1_Ex1;


public class Gato extends Animal {

    @Override
    public void numPatas() {
       System.out.println("El gato tiene 4 patas");
    }

    @Override
    public String emiteSonido() {
        return "El gato maúlla.";
    }
    
    
    
}
